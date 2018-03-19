// np-database
// A simple relational database programmed in Java
//
// Created by Nick Pernisco on 3/13/18.
//

package com.np;

public class Item {

    int ownerID;
    int itemID;
    String itemName;

    public Item(String itemName) {
        this.itemName = itemName;
    }

    public int getOwnerID() {
        return ownerID;
    }

    public void setOwnerID(int ownerID) {
        this.ownerID = ownerID;
    }

    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
}
