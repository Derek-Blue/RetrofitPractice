package com.example.retrofitpractice;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class PrDialog extends Dialog {

    Window window = null;

    public PrDialog(@NonNull Context context) {
        super(context);
    }

    public PrDialog(@NonNull Context context, int themeResId) {
        super(context, themeResId);
        setwindow();
    }

    protected PrDialog(@NonNull Context context, boolean cancelable, @Nullable OnCancelListener cancelListener) {
        super(context, cancelable, cancelListener);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        View view = LayoutInflater.from(getContext()).inflate(R.layout.prdialog_view, null);

        setContentView(view);
        super.onCreate(savedInstanceState);
    }

    private void setwindow(){
        window = getWindow();
        window.setBackgroundDrawableResource(android.R.color.transparent);

    }
}
