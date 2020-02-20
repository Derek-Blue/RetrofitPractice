package com.example.retrofitpractice;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    Spinner spinner;
    ViewPager viewPager;

    ViewpagerAdapter viewpagerAdapter;
    APIservice apIservice;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.spinner);
        viewPager = findViewById(R.id.viewpager);

        viewpagerAdapter = new ViewpagerAdapter(getSupportFragmentManager(), 0);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://data.boch.gov.tw/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        apIservice = retrofit.create(APIservice.class);
        final PrDialog prDialog = new PrDialog(MainActivity.this, R.style.PrDialog);
        prDialog.show();
        Call<List<Post>> call = apIservice.getPosts();
        call.enqueue(new Callback<List<Post>>() {
            @Override
            public void onResponse(Call<List<Post>> call, Response<List<Post>> response) {

                if (!response.isSuccessful()) {
                    Log.v("V30=", "Code = " + response.code());
                    prDialog.dismiss();
                    return;
                }

                List<Post> posts = response.body();

                ArrayList<String> spnList = new ArrayList<>();

                for (Post post : posts) {
                    ItemFragment itemFragment = new ItemFragment();
                    itemFragment.setImage_result(post.getRepresentImage());
                    itemFragment.setName_result(post.getCaseName());
                    itemFragment.setAddress_result(post.getKeepAddressNew());
                    itemFragment.setRegister_result(post.getRegisterReason());
                    itemFragment.setStatus_result(post.getReserveStatus());

                    viewpagerAdapter.addFragment(itemFragment);

                    spnList.add(post.getCaseName());
                }
                viewPager.setAdapter(viewpagerAdapter);

                ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(MainActivity.this, R.layout.spinner_item, spnList);
                spinner.setAdapter(arrayAdapter);

                prDialog.dismiss();
            }

            @Override
            public void onFailure(Call<List<Post>> call, Throwable t) {
                Log.v("V100=", "" + t.getMessage());
            }
        });

        spinner.setOnItemSelectedListener(selectedListener);

        viewPager.addOnPageChangeListener(changeListener);
    }

    private Spinner.OnItemSelectedListener selectedListener = new AdapterView.OnItemSelectedListener() {
        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            Log.d("V100=", "" +id);
            viewPager.setCurrentItem(spinner.getSelectedItemPosition());

        }

        @Override
        public void onNothingSelected(AdapterView<?> parent) {

        }
    };

    private ViewPager.OnPageChangeListener changeListener = new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            spinner.setSelection(viewPager.getCurrentItem());

        }

        @Override
        public void onPageSelected(int position) {

        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }
    };
}



class ViewpagerAdapter extends FragmentPagerAdapter{

    private ArrayList<Fragment> fragments;

    public void addFragment(Fragment fragment){
        fragments.add(fragment);
    }

    public ViewpagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        this.fragments = new ArrayList<>();
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }
}
