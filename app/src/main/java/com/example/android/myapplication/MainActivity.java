package com.example.android.myapplication;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ViewPager2 viewPager2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<cardStructure> cardStructureArrayList = new ArrayList<>();

        cardStructureArrayList.add(new cardStructure("Diamond queen" , R.raw.xqqdd));
        cardStructureArrayList.add(new cardStructure("Heart queen",R.raw.xqqhh));
        cardStructureArrayList.add(new cardStructure("Spade queen",R.raw.xqqss));
        cardStructureArrayList.add(new cardStructure("Club queen",R.raw.xqqcc));


//        cardStructureArrayList.add(new cardStructure("",R.raw.x));

        if (getSupportActionBar() != null)
            getSupportActionBar().setTitle("Card App");
        viewPager2 = findViewById(R.id.viewPager2);
        viewPager2.setAdapter(  new viewPagerAdapter(this,cardStructureArrayList));
        viewPager2.setOrientation(ViewPager2.ORIENTATION_VERTICAL);
    }
}