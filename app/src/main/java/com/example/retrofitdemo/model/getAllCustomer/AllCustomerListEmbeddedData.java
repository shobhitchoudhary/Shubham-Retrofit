package com.example.retrofitdemo.model.getAllCustomer;

import java.util.ArrayList;

public class AllCustomerListEmbeddedData {
    private ArrayList<EmbeddedItem> item;

    public ArrayList<EmbeddedItem> getItem() {
        return item;
    }

    public void setItem(ArrayList<EmbeddedItem> item) {
        this.item = item;
    }
}
