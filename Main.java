// np-database
// A simple relational database programmed in Java
//
// Created by Nick Pernisco on 3/13/18.
//

package com.np;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Database theDB = new Database();
    int menuOption;

	do {
        System.out.println("(1) add user | (2) view users | (3) add item | (4) view items | (5) assign item | (6) quit");
        Scanner sc = new Scanner(System.in);
        menuOption = sc.nextInt();

        // Create a new user
        if (menuOption == 1) {
            System.out.println("Enter user's name: ");
            Scanner scanner = new Scanner(System.in);
            String userNameString = scanner.nextLine();

            // Create new user and add it to the database
            theDB.addUser(userNameString);
        }

        // Create a new item
        if (menuOption == 3) {
            System.out.println("Enter item's name: ");
            Scanner scanner = new Scanner(System.in);
            String itemNameString = scanner.nextLine();

            // Create new user and add it to the database
            theDB.addItem(itemNameString);
        }

        // Assign an item to a user (only existing items and existing users, no error checking
        if (menuOption == 5) {

            // Initialize ID variables
            int userIDInt;
            int itemIDInt;

            // Get the user ID
            System.out.println("Enter a User ID: ");
            Scanner assignUser = new Scanner(System.in);
            userIDInt = assignUser.nextInt();

            // Get the item ID
            System.out.println("Enter a Item ID: ");
            Scanner assignItem = new Scanner(System.in);
            itemIDInt = assignItem.nextInt();

            // Perform the assignment
            itemIDInt = itemIDInt - 1;
            userIDInt = userIDInt - 1;
            theDB.assignItemToUser(theDB.itemTable.get(itemIDInt), theDB.userTable.get(userIDInt));
        }

        // Show all users in the database
        if (menuOption == 2) {
            theDB.displayUsers();
        }

        // Show all items in the database
        if (menuOption == 4) {
            theDB.displayItems();
        }

        // Show all items in the database
        if (menuOption == 6) {
            menuOption = -1;
        }

	} while (menuOption != -1);
    }
}
