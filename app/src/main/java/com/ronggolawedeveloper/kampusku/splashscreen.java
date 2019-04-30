package com.ronggolawedeveloper.kampusku;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.os.Handler;

public class splashscreen extends AppCompatActivity {

    private int waktu_loading=4000;
    //4000=4 detik

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //setelah loading maka akan langsung berpindah ke Main activity
                Intent home = new Intent(splashscreen.this, MainActivity.class);
                startActivity(home);
                finish();
            }
        }, waktu_loading);
    }
}
