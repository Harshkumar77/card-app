package com.example.android.myapplication;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

public class MainActivity extends AppCompatActivity {

    ViewPager2 viewPager2;
    boolean orientationHorizontal = true ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager2 = findViewById (R.id.viewPager2);
        viewPager2.setAdapter(new viewPagerAdapter(this));
        viewPager2.setOrientation(ViewPager2.ORIENTATION_VERTICAL);
    }
}