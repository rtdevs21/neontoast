package com.rtdev.neontoast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Context context = MainActivity.this;

    int i= 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.toastID).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            if (i == 4){
                NeonToast.info(context,"This Is Info", Toast.LENGTH_SHORT);
                i=1;
            }
            else if (i ==3) {
                NeonToast.wrong(context,"This Is Wrong", Toast.LENGTH_SHORT);
                i=4;
            }
            else if (i ==2) {
                NeonToast.success(context,"This Is Success", Toast.LENGTH_SHORT);
                i=3;
            }
            else if (i ==1) {
                NeonToast.simple(context,"This Is Simple", Toast.LENGTH_SHORT);
                i=2;
            }


            }
        });


    }
}