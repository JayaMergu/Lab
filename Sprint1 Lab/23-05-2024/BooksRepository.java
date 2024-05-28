package com.javatpoint.repository;
// Specifies the package name for organizing the repository classes.

import org.springframework.data.repository.CrudRepository;
// Imports the CrudRepository interface from Spring Data, which provides CRUD operations.

import com.javatpoint.model.Books;
// Imports the Books class from the model package.

public interface BooksRepository extends CrudRepository<Books, Integer> {
    // Extends the CrudRepository interface to provide CRUD operations for the Books entity with Integer as the ID type.
}
