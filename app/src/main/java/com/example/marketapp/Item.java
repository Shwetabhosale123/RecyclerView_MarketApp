package com.example.marketapp;

public class Item {

    int itemImage;
    String itemName,itemDesc;

    public Item(int itemImage, String itemName, String itemDesc) {
        this.itemImage = itemImage;
        this.itemName = itemName;
        this.itemDesc = itemDesc;
    }

    public int getItemImage() {
        return itemImage;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemImage(int itemImage) {
        this.itemImage = itemImage;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setItemDesc(String itemDesc) {
        this.itemDesc = itemDesc;
    }

    public String getItemDesc() {
        return itemDesc;
    }
}
