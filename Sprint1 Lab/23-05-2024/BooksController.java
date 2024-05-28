package com.javatpoint.controller;
// Specifies the package name, which helps in organizing classes and avoiding name conflicts.

import java.util.List;
// Imports the List interface from the java.util package, used for handling collections of objects.

import org.springframework.beans.factory.annotation.Autowired;
// Imports the Autowired annotation, which is used for automatic dependency injection in Spring.

import org.springframework.web.bind.annotation.DeleteMapping;
// Imports the DeleteMapping annotation, used to map HTTP DELETE requests onto specific handler methods.

import org.springframework.web.bind.annotation.GetMapping;
// Imports the GetMapping annotation, used to map HTTP GET requests onto specific handler methods.

import org.springframework.web.bind.annotation.PathVariable;
// Imports the PathVariable annotation, used to extract data from the URI.

import org.springframework.web.bind.annotation.PostMapping;
// Imports the PostMapping annotation, used to map HTTP POST requests onto specific handler methods.

import org.springframework.web.bind.annotation.PutMapping;
// Imports the PutMapping annotation, used to map HTTP PUT requests onto specific handler methods.

import org.springframework.web.bind.annotation.RequestBody;
// Imports the RequestBody annotation, used to bind the body of the HTTP request to a method parameter.

import org.springframework.web.bind.annotation.RestController;
// Imports the RestController annotation, which is a convenience annotation that combines @Controller and @ResponseBody.

import com.javatpoint.model.Books;
// Imports the Books class from the model package.

import com.javatpoint.service.BooksService;
// Imports the BooksService class from the service package.

//mark class as Controller
@RestController
// Marks this class as a REST controller, allowing it to handle HTTP requests and return JSON responses.

public class BooksController 
// Declares a public class named BooksController, which will handle HTTP requests related to books.

{
//autowire the BooksService class
@Autowired
// Autowires the BooksService class, enabling dependency injection to automatically inject an instance of BooksService.

BooksService booksService;
// Declares a variable of type BooksService to be used in this controller.


//creating a get mapping that retrieves all the books detail from the database 
@GetMapping("/book")
// Maps HTTP GET requests to /book to this method, which retrieves all book details.

private List<Books> getAllBooks() 
// Defines a private method that returns a list of Books.

{
return booksService.getAllBooks();
// Calls the getAllBooks method of booksService to get the list of all books and returns it.
}


//creating a get mapping that retrieves the detail of a specific book
@GetMapping("/book/{bookid}")
// Maps HTTP GET requests to /book/{bookid} to this method, which retrieves details of a specific book.

private Books getBooks(@PathVariable("bookid") int bookid) 
// Defines a private method that returns a Books object, taking bookid as a path variable.

{
return booksService.getBooksById(bookid);
// Calls the getBooksById method of booksService with bookid to get details of the specified book and returns it.
}


//creating a delete mapping that deletes a specified book
@DeleteMapping("/book/{bookid}")
// Maps HTTP DELETE requests to /book/{bookid} to this method, which deletes a specified book.

private void deleteBook(@PathVariable("bookid") int bookid) 
// Defines a private method that deletes a book, taking bookid as a path variable.

{
booksService.delete(bookid);
// Calls the delete method of booksService with bookid to delete the specified book.
}


//creating post mapping that post the book detail in the database
@PostMapping("/books")
// Maps HTTP POST requests to /books to this method, which posts book details to the database.

private int saveBook(@RequestBody Books books) 
// Defines a private method that saves a book, taking the book details from the request body.

{
booksService.saveOrUpdate(books);
// Calls the saveOrUpdate method of booksService with the books object to save or update the book details.

return books.getBookid();
// Returns the book ID of the saved book.
}


//creating put mapping that updates the book detail 
@PutMapping("/books")
// Maps HTTP PUT requests to /books to this method, which updates book details in the database.

private Books update(@RequestBody Books books) 
// Defines a private method that updates a book, taking the book details from the request body.

{
booksService.saveOrUpdate(books);
// Calls the saveOrUpdate method of booksService with the books object to update the book details.

return books;
// Returns the updated book object.
}
}
