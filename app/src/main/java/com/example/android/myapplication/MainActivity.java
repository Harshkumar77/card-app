package com.example.android.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;
import androidx.core.content.ContextCompat;
import androidx.viewpager2.widget.ViewPager2;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<cardStructure> cardStructureArrayList = new ArrayList<>();
    // ArrayList of all the cards
    TextView hl, vl;
    boolean isHorizontal = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Adding card info
        cardStructureArrayList.add(new cardStructure("Diamond queen", R.raw.xqqdd, false));
        cardStructureArrayList.add(new cardStructure("Heart queen", R.raw.xqqhh, false));
        cardStructureArrayList.add(new cardStructure("Spade queen", R.raw.xqqss, true));
        cardStructureArrayList.add(new cardStructure("Club queen", R.raw.xqqcc, true));

        ViewPager2 viewPager2 = findViewById(R.id.viewPager2); // accessing ViewPager in activity_main.xml

        viewPager2.setAdapter(new viewPagerAdapter(this, cardStructureArrayList, findViewById(R.id.tabs), viewPager2));
        //setting viewPagerAdapter with viewPager

        hl = findViewById(R.id.hl);
        vl = findViewById(R.id.vl);

        hl.setOnClickListener(v -> {
            if (!isHorizontal) {
                isHorizontal = true;
                viewPager2.setOrientation(ViewPager2.ORIENTATION_HORIZONTAL);
                hl.setBackgroundColor(ContextCompat.getColor(getBaseContext() , android.R.color.darker_gray));
                vl.setBackgroundColor(ContextCompat.getColor(getBaseContext() , android.R.color.white));
            }
        });
        vl.setOnClickListener(v -> {
            if (isHorizontal) {
                isHorizontal = false;
                viewPager2.setOrientation(ViewPager2.ORIENTATION_VERTICAL);
                vl.setBackgroundColor(ContextCompat.getColor(getBaseContext() , android.R.color.darker_gray));
                hl.setBackgroundColor(ContextCompat.getColor(getBaseContext() , android.R.color.white));
            }
        });
    }
}