package com.rtdev.neontoast;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.content.res.AppCompatResources;

public class NeonToast {

    public static void success(Context context, String msg, int duration) {
        View view = ((LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE)).inflate(R.layout.toast_layout,
                null);

        Toast toast = new Toast(context);
        toast.setDuration(duration);
        toast.setView(view);
        LinearLayout mainLayout = view.findViewById(R.id.mainLayoutID);
        TextView txt = view.findViewById(R.id.textViewID);
        ImageView img = view.findViewById(R.id.imageView);
        mainLayout.setBackground(AppCompatResources.getDrawable(context, R.drawable.bg_success));
        img.setImageDrawable(AppCompatResources.getDrawable(context, R.drawable.ic_success));
        txt.setText(msg);
        toast.show();
    }

    public static void wrong(Context context, String msg, int duration) {
        View view = ((LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE)).inflate(R.layout.toast_layout,
                null);

        Toast toast = new Toast(context);
        toast.setDuration(duration);
        toast.setView(view);
        LinearLayout mainLayout = view.findViewById(R.id.mainLayoutID);
        TextView txt = view.findViewById(R.id.textViewID);
        ImageView img = view.findViewById(R.id.imageView);
        mainLayout.setBackground(AppCompatResources.getDrawable(context, R.drawable.bg_error));
        img.setImageDrawable(AppCompatResources.getDrawable(context, R.drawable.ic_wrong));
        txt.setText(msg);
        toast.show();
    }


    public static void info(Context context, String msg, int duration) {
        View view = ((LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE)).inflate(R.layout.toast_layout,
                null);

        Toast toast = new Toast(context);
        toast.setDuration(duration);
        toast.setView(view);
        LinearLayout mainLayout = view.findViewById(R.id.mainLayoutID);
        TextView txt = view.findViewById(R.id.textViewID);
        ImageView img = view.findViewById(R.id.imageView);
        mainLayout.setBackground(AppCompatResources.getDrawable(context, R.drawable.bg_info));
        img.setImageDrawable(AppCompatResources.getDrawable(context, R.drawable.ic_error));
        txt.setText(msg);
        toast.show();
    }

    public static void simple(Context context, String msg, int duration) {
        View view = ((LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE)).inflate(R.layout.toast_layout,
                null);

        Toast toast = new Toast(context);
        toast.setDuration(duration);
        toast.setView(view);
        LinearLayout mainLayout = view.findViewById(R.id.mainLayoutID);
        TextView txt = view.findViewById(R.id.textViewID);
        ImageView img = view.findViewById(R.id.imageView);
        mainLayout.setBackground(AppCompatResources.getDrawable(context, R.drawable.bg_normal));
        img.setVisibility(View.GONE);
        txt.setTextColor(ColorStateList.valueOf(view.getResources().getColor(android.R.color.black)));
        txt.setText(msg);
        toast.show();
    }
}
