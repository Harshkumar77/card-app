package com.example.android.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class viewPagerAdapter extends RecyclerView.Adapter<viewPagerAdapter.ViewHolder> {

    Context context;
    ArrayList<cardStructure> cardStructureArrayList;


    public viewPagerAdapter(Context context , ArrayList<cardStructure> cardStructureArrayList){
        this.context = context;
        this.cardStructureArrayList=cardStructureArrayList;
    }

    @NonNull
    @Override
    public viewPagerAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(context).inflate(R.layout.cell_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull viewPagerAdapter.ViewHolder holder, int position) {
        holder.mText.setText(cardStructureArrayList.get(position).cardName);
        holder.mImage.setImageResource(cardStructureArrayList.get(position).cardImageId);
    }

    @Override
    public int getItemCount() {
        return cardStructureArrayList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        TextView mText ;
        ImageView mImage;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            mText = itemView.findViewById(R.id.text);
            mImage = itemView.findViewById(R.id.image);
        }
    }
}
