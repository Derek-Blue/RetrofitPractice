package com.example.retrofitpractice;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;

public class ItemFragment extends Fragment {

    private ImageView item_image;
    private TextView name, address, register, status;
    private ProgressBar progressBar;

    private String image_result,name_result,address_result, register_result, status_result;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_item, container, false);

        progressBar = view.findViewById(R.id.progress);
        item_image = view.findViewById(R.id.item_image);
        name = view.findViewById(R.id.name);
        address = view.findViewById(R.id.address);
        register = view.findViewById(R.id.register);
        status = view.findViewById(R.id.status);

        if (TextUtils.isEmpty(image_result)){
            item_image.setImageResource(R.drawable.nopic);
            progressBar.setVisibility(View.GONE);
        }else {
            Glide.with(view.getContext().getApplicationContext())
                    .load(image_result)
                    .listener(new RequestListener<Drawable>() {
                        @Override
                        public boolean onLoadFailed(@Nullable GlideException e, Object model, Target<Drawable> target, boolean isFirstResource) {
                            Toast.makeText(view.getContext(), "圖片載入失敗", Toast.LENGTH_SHORT).show();
                            return false;
                        }

                        @Override
                        public boolean onResourceReady(Drawable resource, Object model, Target<Drawable> target, DataSource dataSource, boolean isFirstResource) {
                            //Toast.makeText(view.getContext(), "成功", Toast.LENGTH_SHORT).show();
                            progressBar.setVisibility(View.GONE);
                            return false;
                        }
                    })
                    .error(R.drawable.nopic)
                    .into(item_image);
        }

        name.setText(name_result);

        if (TextUtils.isEmpty(address_result)){
            address.setText("暫不提供");
            address.setTextColor(Color.RED);
        }else {
            address.setText(address_result);
        }

        register.setText(register_result);

        if (TextUtils.isEmpty(status_result)){
            status.setText("暫無詳情");
            status.setTextColor(Color.RED);
        }else {
            status.setText(status_result);
        }

        return view;
    }

    public void setImage_result(String image_result) {
        this.image_result = image_result;
    }

    public void setName_result(String name_result) {
        this.name_result = name_result;
    }

    public void setAddress_result(String address_result) {
        this.address_result = address_result;
    }

    public void setRegister_result(String register_result) {
        this.register_result = register_result;
    }

    public void setStatus_result(String status_result) {
        this.status_result = status_result;
    }
}
