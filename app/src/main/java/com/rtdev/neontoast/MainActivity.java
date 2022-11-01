package com.rtdev.neontoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.toastID).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//            NeonToast neonToast;
            }
        });


    }
}