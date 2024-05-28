package com.javatpoint.model;
// Specifies the package name, which helps in organizing classes and avoiding name conflicts.

import javax.persistence.Column;
// Imports the Column annotation from the javax.persistence package, used to specify the details of a column in the database table.

import javax.persistence.Entity;
// Imports the Entity annotation, used to mark the class as an entity and map it to a database table.

import javax.persistence.Id;
// Imports the Id annotation, used to specify the primary key of an entity.

import javax.persistence.Table;
// Imports the Table annotation, used to specify the table name in the database for the entity.

//mark class as an Entity 
@Entity
// Marks this class as a JPA entity, which means it will be mapped to a database table.

@Table
//defining class name as Table name
// Specifies the table in the database with which this entity is mapped. By default, the table name is the class name.

public class Books
// Declares a public class named Books, which will be mapped to a table in the database.

{
//Defining book id as primary key
@Id
// Specifies the primary key of the entity.

@Column
// Maps the field to a column in the database table.
private int bookid;
// Declares a private integer field named bookid, which will be mapped to a column in the database table.

@Column
// Maps the field to a column in the database table.
private String bookname;
// Declares a private string field named bookname, which will be mapped to a column in the database table.

@Column
// Maps the field to a column in the database table.
private String author;
// Declares a private string field named author, which will be mapped to a column in the database table.

@Column
// Maps the field to a column in the database table.
private int price;
// Declares a private integer field named price, which will be mapped to a column in the database table.

public int getBookid() 
// Defines a public getter method for the bookid field.

{
return bookid;
// Returns the value of bookid.
}

public void setBookid(int bookid) 
// Defines a public setter method for the bookid field.

{
this.bookid = bookid;
// Sets the value of bookid.
}

public String getBookname()
// Defines a public getter method for the bookname field.

{
return bookname;
// Returns the value of bookname.
}

public void setBookname(String bookname) 
// Defines a public setter method for the bookname field.

{
this.bookname = bookname;
// Sets the value of bookname.
}

public String getAuthor() 
// Defines a public getter method for the author field.

{
return author;
// Returns the value of author.
}

public void setAuthor(String author) 
// Defines a public setter method for the author field.

{
this.author = author;
// Sets the value of author.
}

public int getPrice() 
// Defines a public getter method for the price field.

{
return price;
// Returns the value of price.
}

public void setPrice(int price) 
// Defines a public setter method for the price field.

{
this.price = price;
// Sets the value of price.
}
}
