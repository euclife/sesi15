package com.chandra.fragment.Models;

public class Product {
    private Integer id;
    private Integer harga;
    private String nama_product;

    public Product() {
    }

    public Product(Integer id, Integer harga, String nama_product) {
        this.id = id;
        this.harga = harga;
        this.nama_product = nama_product;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getHarga() {
        return harga;
    }

    public void setHarga(Integer harga) {
        this.harga = harga;
    }

    public String getNama_product() {
        return nama_product;
    }

    public void setNama_product(String nama_product) {
        this.nama_product = nama_product;
    }
}
