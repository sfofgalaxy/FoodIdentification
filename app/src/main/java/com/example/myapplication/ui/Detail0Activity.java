package com.example.myapplication.ui;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.StrictMode;

import com.example.myapplication.R;

public class Detail0Activity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        // 每个activity需获取
        Context context = getApplicationContext();
        super.onCreate(savedInstanceState);
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
        setContentView(R.layout.detail_page0_layout);
    }
}
