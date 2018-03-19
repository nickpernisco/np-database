# np-database
A simple relational database programmed in Java

In an effort to test my knowledge of concepts I had learned in CS 165 in Oregon State University's computer science program, I decided to create my own database using only Java (the course used C++). This software uses most if not all of the skills learned in an intro to computer science class, up to and including algorithms and data structures.

There is a primary class called Database, which uses vectors to store data from a User and Item class. Those two classes act as tables in a conventional database, and each contains its own set of variables, while the Database class contains the methods to manipulate data. In this example, the data is not stored to disk, nor in any format (CSV, MySQL, MondoDB), but implementing persistent storage to this project should be a relatively simple task. 

This is a useful and simple design to help better understand how databases work. The logic can be translated to any other language, on any platform, and using any type of database.

Methods in the Database class:

addUser(String name) - Adds a new user to the database
addItem(String name) - Adds a new item to the database
displayUsers() - Displays all users in the database
displayItems() - Displays all items in the database
assignUser(Item item, User user) - Assigns an item to a user
