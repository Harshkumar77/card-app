package com.example.android.myapplication;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ViewPager2 viewPager2;
    TabLayout tabLayout;
    ArrayList<cardStructure> cardStructureArrayList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        cardStructureArrayList.add(new cardStructure("Diamond queen", R.raw.xqqdd, "?", android.R.color.holo_red_dark));
        cardStructureArrayList.add(new cardStructure("Heart queen", R.raw.xqqhh, "?", android.R.color.holo_red_dark));
        cardStructureArrayList.add(new cardStructure("Spade queen", R.raw.xqqss, "?", (android.R.color.black)));
        cardStructureArrayList.add(new cardStructure("Club queen", R.raw.xqqcc, "?", android.R.color.black));

        //ArrayList of all the heart cards
        ArrayList<cardStructure> heart = new ArrayList<>();


//        cardStructureArrayList.add(new cardStructure("",R.raw.x));

        tabLayout = (TabLayout) findViewById(R.id.tabs);

        viewPager2 = findViewById(R.id.viewPager2);
        viewPager2.setAdapter(new viewPagerAdapter(this, cardStructureArrayList, tabLayout, viewPager2));
        viewPager2.setOrientation(ViewPager2.ORIENTATION_VERTICAL);
//
//
//        for (int i = 0; i < cardStructureArrayList.size(); i++) {
//            TabLayout.Tab tab = tabLayout.newTab();
//            tab.setText(cardStructureArrayList.get(i).cardName);
//            tabLayout.addTab(tab);
//        }
//
//        tabLayout.setOnScrollChangeListener(new View.OnScrollChangeListener() {
//            @Override
//            public void onScrollChange(View v, int scrollX, int scrollY, int oldScrollX, int oldScrollY) {
//                TextView textView = v.findViewById(R.id.text);
//                ImageView imageView = v.findViewById(R.id.image);
//                textView.setText(cardStructureArrayList.get(scrollY).cardName);
//                imageView.setImageResource(cardStructureArrayList.get(scrollY).cardImageId);
//                LayoutInflater.from(getBaseContext()).inflate(R.layout.cell_item, (ViewGroup) v, false);
//            }
//        });

    }
}