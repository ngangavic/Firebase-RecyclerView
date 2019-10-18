package com.example.firebaserecyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewHolders> {
    private List<Catalog> catalogs;
    protected Context context;
    public RecyclerViewAdapter(Context context, List<Catalog> catalogs) {
        this.catalogs = catalogs;
        this.context = context;
    }
    @Override
    public RecyclerViewHolders onCreateViewHolder(ViewGroup parent, int viewType) {
        RecyclerViewHolders viewHolder = null;
        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.data_row, parent, false);
        viewHolder = new RecyclerViewHolders(layoutView, catalogs);
        return viewHolder;
    }
    @Override
    public void onBindViewHolder(RecyclerViewHolders holder, int position) {
        holder.name.setText(catalogs.get(position).getName());
        holder.code.setText(catalogs.get(position).getCode());
        holder.price.setText(catalogs.get(position).getPrice());
        holder.qty.setText(catalogs.get(position).getQty());
    }
    @Override
    public int getItemCount() {
        return this.catalogs.size();
    }
}
