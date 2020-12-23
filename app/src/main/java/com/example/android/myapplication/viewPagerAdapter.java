package com.example.android.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.ArrayList;

public class viewPagerAdapter extends RecyclerView.Adapter<viewPagerAdapter.ViewHolder> {

    /**
     * viewPager2Adapter is a custom Adapter to hold ViewHolder
     * This Adapter override methods from RecycleView.Adapter<>
     */

    private Context context;
    private ArrayList<cardStructure> cardStructureArrayList;
    private TabLayout tabLayout;
    private ViewPager2 viewPager2;

    /**
     * constructor for viewPagerAdapter
     *
     * @param context                context of main activity
     * @param cardStructureArrayList ArrayList containing all the info about cards
     * @param tabLayout              TabLayout in which tab will be added
     * @param viewPager2             ViewPager2 in which cards will be added
     */

    public viewPagerAdapter(Context context, ArrayList<cardStructure> cardStructureArrayList, TabLayout tabLayout, ViewPager2 viewPager2) {
        this.context = context;
        this.cardStructureArrayList = cardStructureArrayList;
        this.tabLayout = tabLayout;
        this.viewPager2 = viewPager2;
    }

    /**
     * When ViewHolder is created
     *
     * @param parent   ViewGroup which will be displayed when ViewHolder is created
     * @param viewType .
     * @return ViewHolder which would be displayed
     */

    @NonNull
    @Override
    public viewPagerAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        /* Attaching TabLayoutMediator with the viewPager2 for creating swipe views */
        new TabLayoutMediator(tabLayout, viewPager2,
                (tab, position) -> tab.setText(cardStructureArrayList.get(position).cardName)
                // A lambda expression to add Tab in TabLayout
        ).attach();
        // Inflating Layout file to pass in view holder
        return new ViewHolder(LayoutInflater.from(context).inflate(R.layout.cell_item, parent, false));
    }

    /**
     * When ViewPager2 is holding ViewHolder
     *
     * @param holder   ViewHolder which is being on hold
     * @param position position of current ViewHolder
     */

    @Override
    public void onBindViewHolder(@NonNull viewPagerAdapter.ViewHolder holder, int position) {
        // Modifying the ViewHolder according to the card info
        holder.mText.setText(cardStructureArrayList.get(position).cardName);
        if (cardStructureArrayList.get(position).isBlack)
            holder.mText.setTextColor(ContextCompat.getColor(context, android.R.color.black));
        else
            holder.mText.setTextColor(ContextCompat.getColor(context, android.R.color.holo_red_dark));
        holder.mImage.setImageResource(cardStructureArrayList.get(position).cardImageId);
    }

    /**
     * @return total number of ViewHolder
     */

    @Override
    public int getItemCount() {
        return cardStructureArrayList.size();
    }

    /**
     * Custom View that is used by viewPagerAdapter
     **/

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView mText;
        public ImageView mImage;

        /**
         * Constructor to construct ViewHolder
         *
         * @param itemView Inflated Layout file into view
         */
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            mText = itemView.findViewById(R.id.text);
            mImage = itemView.findViewById(R.id.image);
        }
    }
}