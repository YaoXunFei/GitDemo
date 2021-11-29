package com.test.gitdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("hello");
        System.out.println("hello2");
        System.out.println("hello3");
        System.out.println("master");
        System.out.println("test");
        System.out.println("push test");
        System.out.println("pull test");
        System.out.println("hithub 测试更新");
    }
}
