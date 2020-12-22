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

    private Context context;
    private ArrayList<cardStructure> cardStructureArrayList;
    private TabLayout tabLayout;
    private ViewPager2 viewPager2;

    public viewPagerAdapter(Context context, ArrayList<cardStructure> cardStructureArrayList, TabLayout tabLayout, ViewPager2 viewPager2) {
        this.context = context;
        this.cardStructureArrayList = cardStructureArrayList;
        this.tabLayout = tabLayout;
        this.viewPager2 = viewPager2;
    }

    @NonNull
    @Override
    public viewPagerAdapter. ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        new TabLayoutMediator(tabLayout, viewPager2,
                (tab, position) -> tab.setText(cardStructureArrayList.get(position).cardName)
        ).attach();
        return new ViewHolder(LayoutInflater.from(context).inflate(R.layout.cell_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull viewPagerAdapter.ViewHolder holder, int position) {
        holder.mText.setText(cardStructureArrayList.get(position).cardName);
        holder.mText.setTextColor(ContextCompat.getColor(context,cardStructureArrayList.get(position).color));
        holder.mImage.setImageResource(cardStructureArrayList.get(position).cardImageId);
    }

    @Override
    public int getItemCount() {
        return cardStructureArrayList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView mText;
        public ImageView mImage;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            mText = itemView.findViewById(R.id.text);
            mImage = itemView.findViewById(R.id.image);
        }
    }
}