package com.example.android.myapplication;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<cardStructure> cardStructureArrayList = new ArrayList<>();
    // ArrayList of all the cards

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cardStructureArrayList.add(new cardStructure("Diamond queen", R.raw.xqqdd, false));
        cardStructureArrayList.add(new cardStructure("Heart queen", R.raw.xqqhh, false));
        cardStructureArrayList.add(new cardStructure("Spade queen", R.raw.xqqss, true));
        cardStructureArrayList.add(new cardStructure("Club queen", R.raw.xqqcc, true));
        //Adding card info

        ViewPager2 viewPager2 = findViewById(R.id.viewPager2); // accessing ViewPager in activity_main.xml

        viewPager2.setAdapter(new viewPagerAdapter(this, cardStructureArrayList, findViewById(R.id.tabs), viewPager2));
        //setting viewPagerAdapter with viewPager

        viewPager2.setOrientation(ViewPager2.ORIENTATION_VERTICAL); // setting orientation of viewPager
    }
}