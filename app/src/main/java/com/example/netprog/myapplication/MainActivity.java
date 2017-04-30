package com.example.netprog.myapplication;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable(){
            public void run() {

                Intent intent = new Intent(MainActivity.this,week1_initialscreen.class);
                startActivity(intent);
                finish();
            }
        },2000);
    }
}
