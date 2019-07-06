package com.chandra.fragment.Adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.chandra.fragment.Models.Product;
import com.chandra.fragment.R;

import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder>{
    List<Product> listProduct;

    public class ProductViewHolder extends RecyclerView.ViewHolder{
        public TextView nama_product, harga_product;

        public ProductViewHolder(@NonNull View itemView){
            super(itemView);
            nama_product = itemView.findViewById(R.id.txtNama);
            harga_product = itemView.findViewById(R.id.txtHarga);
        }
    }

    public ProductAdapter (List<Product> listProduct){
        this.listProduct= listProduct;
    }

    @NonNull
    @Override
    public ProductAdapter.ProductViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i){
        View mView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_product,viewGroup,false);
        ProductViewHolder productViewHolder = new ProductViewHolder(mView);
        return productViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull final ProductViewHolder productViewHolder, int i) {
        productViewHolder.nama_product.setText(listProduct.get(i).getNama_product());
        productViewHolder.harga_product.setText(listProduct.get(i).getHarga().toString());
//        beritaViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(beritaViewHolder.itemView.getContext(), "clicked on Row",Toast.LENGTH_SHORT);
//            }
//        });
    }

    @Override
    public int getItemCount() {
        return listProduct.size();
    }
}
