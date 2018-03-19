// np-database
// A simple relational database programmed in Java
//
// Created by Nick Pernisco on 3/13/18.
//

package com.np;

public class User {

    int userID;
    String userName;

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public User(String userName) {

        this.userName = userName;
    }
}
