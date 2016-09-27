package com.atguigu.fragment01;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.util.Log;

public class MainActivity extends FragmentActivity {
    public MainActivity() {
        Log.e("TAG", "MainActivity...");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.e("TAG", "onCreate...");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
