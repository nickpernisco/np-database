
// np-database
// A simple relational database programmed in Java
//
// Created by Nick Pernisco on 3/13/18.
//

package com.np;

import java.util.ArrayList;


public class Database {

    ArrayList<User> userTable;
    ArrayList<Item> itemTable;

    public Database() {
        userTable = new ArrayList<User>();
        itemTable = new ArrayList<Item>();
        this.userTable = userTable;
        this.itemTable = itemTable;
    }

    public void displayUsers() {
        System.out.println("ID " + "Name");

        for (int j = 0; j < userTable.size(); j++) {
            User currentUser = new User("blank");
            currentUser = userTable.get(j);
            System.out.println(currentUser.getUserID() + "  " + currentUser.getUserName());
        }
    }

    public void displayItems() {
        System.out.println("ID " + "Owner " + "Name");

        for (int j = 0; j < itemTable.size(); j++) {
            Item currentItem = new Item("blank");
            currentItem = itemTable.get(j);
            System.out.println(currentItem.getItemID() + "  " + currentItem.getOwnerID() + "     " + currentItem.getItemName());
        }
    }

    public void addUser(String newUserName) {
        User newUser = new User(newUserName);
        newUser.setUserID(this.userTable.size() + 1);
        this.userTable.add(newUser);
    }

    public void addItem(String newItemName) {
        Item newItem = new Item(newItemName);
        newItem.setItemID(this.itemTable.size() + 1);
        this.itemTable.add(newItem);
    }

    public void assignItemToUser(Item item, User user) {
        item.setOwnerID(user.getUserID());
    }


}
