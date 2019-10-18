package com.example.firebaserecyclerview;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewHolders extends RecyclerView.ViewHolder{

    public TextView name;
    public TextView code;
    public TextView price;
    public TextView qty;

    private List<Catalog> catalogObject;
    public RecyclerViewHolders(final View itemView, final List<Catalog> catalogObject) {
        super(itemView);
        this.catalogObject = catalogObject;
        name = (TextView)itemView.findViewById(R.id.textViewName);
        code = (TextView)itemView.findViewById(R.id.textViewCode);
        price = (TextView)itemView.findViewById(R.id.textViewPrice);
        qty = (TextView)itemView.findViewById(R.id.textViewQuantity);
    }
}
