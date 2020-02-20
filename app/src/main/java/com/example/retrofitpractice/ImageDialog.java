package com.example.retrofitpractice;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.bumptech.glide.Glide;

public class ImageDialog extends Dialog {

    Window window = null;
    ImageView imageView;
    private String imageUri;

    public ImageDialog(@NonNull Context context,String imageUri) {
        super(context);

        this.imageUri = imageUri;
        setwindow();
    }

    public ImageDialog(@NonNull Context context, int themeResId) {
        super(context, themeResId);
    }

    protected ImageDialog(@NonNull Context context, boolean cancelable, @Nullable OnCancelListener cancelListener) {
        super(context, cancelable, cancelListener);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        View view = LayoutInflater.from(getContext()).inflate(R.layout.imagedialog_view, null);
        imageView = view.findViewById(R.id.image);

        Glide.with(getContext())
                .load(imageUri)
                .into(imageView);

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cancel();
            }
        });
        setContentView(view);
        super.onCreate(savedInstanceState);
    }

    private void setwindow(){
        window = getWindow();
        window.setBackgroundDrawableResource(android.R.color.transparent);
    }

    @Override
    public void show() {
        setCanceledOnTouchOutside(true);
        super.show();
    }
}
