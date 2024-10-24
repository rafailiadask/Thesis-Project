package com.example.productspurchaseapp.ViewHolder;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.productspurchaseapp.Interface.ItemClickListener;
import com.example.productspurchaseapp.R;

public class CartViewHolder  extends RecyclerView.ViewHolder implements View.OnClickListener {

    public TextView txtProductName,txtProductPrice,txtProductQuantity,txtProductDescription;
    private ItemClickListener itemClickListener;

    public CartViewHolder(@NonNull View itemView)
    {
        super(itemView);

        txtProductName=itemView.findViewById(R.id.cart_product_name);
        txtProductPrice=itemView.findViewById(R.id.cart_product_price);
        txtProductQuantity=itemView.findViewById(R.id.cart_product_quantity);
        txtProductDescription=itemView.findViewById(R.id.cart_product_description);

        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view)
    {
       itemClickListener.onClick(view,getAdapterPosition(),false);
    }
    public void setItemClickListener(ItemClickListener itemClickListener){
        this.itemClickListener=itemClickListener;
    }
}
