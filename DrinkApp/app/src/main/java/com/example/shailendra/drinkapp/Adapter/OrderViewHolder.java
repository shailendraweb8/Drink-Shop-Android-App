package com.example.shailendra.drinkapp.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.shailendra.drinkapp.Interface.IItemClickListener;
import com.example.shailendra.drinkapp.R;

public class OrderViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{


    public TextView txt_order_id , txt_order_price , txt_order_address , txt_order_comment , txt_order_status;

    IItemClickListener itemClickListener;

    //setter for itemclick listener


    public void setItemClickListener(IItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }

    public OrderViewHolder(View itemView) {
        super(itemView);


        txt_order_address = (TextView)itemView.findViewById(R.id.txt_order_address);
        txt_order_id = (TextView)itemView.findViewById(R.id.txt_order_id);
        txt_order_price = (TextView)itemView.findViewById(R.id.txt_order_price);
        txt_order_comment = (TextView)itemView.findViewById(R.id.txt_order_comment);
        txt_order_status = (TextView)itemView.findViewById(R.id.txt_order_status);

        itemView.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        itemClickListener.onClick(view);
    }
}
