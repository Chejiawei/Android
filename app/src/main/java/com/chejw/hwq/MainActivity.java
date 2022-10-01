package com.chejw.hwq;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v("CHEJW","冗余信息");
        Log.d("CHEJW","调试信息");
        Log.i("CHEJW","一般消息");
        Log.w("CHEJW","警告信息");
        Log.e("CHEJW","错误信息");
    }
}