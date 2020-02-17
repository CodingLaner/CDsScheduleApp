package com.example.cdsscheduleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    Fragment1ToDo fragment1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragment1 = new Fragment1ToDo();

        getSupportFragmentManager().beginTransaction().add(R.id.container, fragment1).commit();
        // 추후 설정에서 앱 시작시 프래그먼트 변경하는 기능 추가 고려


    }


}
