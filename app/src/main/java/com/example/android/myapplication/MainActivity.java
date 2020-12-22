package com.example.android.myapplication;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<cardStructure> cardStructureArrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cardStructureArrayList.add(new cardStructure("Diamond queen", R.raw.xqqdd, android.R.color.holo_red_dark));
        cardStructureArrayList.add(new cardStructure("Heart queen", R.raw.xqqhh, android.R.color.holo_red_dark));
        cardStructureArrayList.add(new cardStructure("Spade queen", R.raw.xqqss, (android.R.color.black)));
        cardStructureArrayList.add(new cardStructure("Club queen", R.raw.xqqcc, android.R.color.black));

        ViewPager2 viewPager2 = findViewById(R.id.viewPager2);

        viewPager2.setAdapter(new viewPagerAdapter(this, cardStructureArrayList, findViewById(R.id.tabs), viewPager2));
        viewPager2.setOrientation(ViewPager2.ORIENTATION_VERTICAL);
    }
}