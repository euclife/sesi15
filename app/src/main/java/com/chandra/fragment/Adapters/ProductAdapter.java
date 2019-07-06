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

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder{
    List<Product> listBerita;

    public class ProductViewHolder extends RecyclerView.ViewHolder{
        public TextView nama_product, listIsiBerita, listWaktuPosted;

        public ProductViewHolder(@NonNull View itemView){
            super(itemView);
            nama = itemView.findViewById(R.id.listJudulBerita);
            listIsiBerita = itemView.findViewById(R.id.listIsiBerita);
            listWaktuPosted = itemView.findViewById(R.id.listWaktuPosted);
        }
    }

    public ProductAdapter (List<Product> listBerita){
        this.listBerita = listBerita;
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
        productViewHolder..setText(listBerita.get(i).getJudul_berita());
        beritaViewHolder.listIsiBerita.setText(listBerita.get(i).getIsi_berita());
        beritaViewHolder.listWaktuPosted.setText(listBerita.get(i).getWaktu_posted());
        beritaViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(beritaViewHolder.itemView.getContext(), "clicked on Row",Toast.LENGTH_SHORT);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listBerita.size();
    }
}
