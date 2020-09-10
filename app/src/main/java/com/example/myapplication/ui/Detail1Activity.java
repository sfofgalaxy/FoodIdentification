package com.example.myapplication.ui;

import android.app.Activity;
import android.os.Bundle;

import com.example.myapplication.R;

public class Detail1Activity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        // 每个activity需获取
        getApplicationContext();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_page1_layout);
    }
}
