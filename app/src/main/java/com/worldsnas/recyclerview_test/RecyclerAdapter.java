package com.worldsnas.recyclerview_test;

import android.annotation.SuppressLint;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

/**
 * Created by Seyed on 2/23/2018.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerItem>{

    private final List<Item> mItems;

    public RecyclerAdapter(List<Item> items) {
        mItems = items;
    }

    @Override
    public RecyclerItem onCreateViewHolder(ViewGroup parent, int viewType) {
        return new RecyclerItem(LayoutInflater.from(parent.getContext()).inflate(R.layout.row_rv_item, parent, false));
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(RecyclerItem holder, int position) {
        holder.content.setText(mItems.get(position).mDesc);
        holder.number.setText("No.: "+(position+1));
        Glide.with(holder.itemView.getContext()).load(mItems.get(position).photi).into(holder.image);
    }

    @Override
    public int getItemCount() {
        return mItems.size();
    }

    static class RecyclerItem extends RecyclerView.ViewHolder{

        TextView number;
        TextView content;
        ImageView image;

        public RecyclerItem(View itemView) {
            super(itemView);
            number = itemView.findViewById(R.id.number_view);
            content = itemView.findViewById(R.id.content_view);
            image = itemView.findViewById(R.id.image);

        }
    }
}
