package com.baishan.annotationdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.yl.annotation.ContentView;

@ContentView(R.layout.activity_main)
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
