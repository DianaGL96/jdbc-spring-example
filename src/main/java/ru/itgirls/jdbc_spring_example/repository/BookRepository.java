package ru.itgirls.jdbc_spring_example.repository;

import ru.itgirls.jdbc_spring_example.model.Book;

import java.util.List;

public interface BookRepository {
    List<Book> findAllBooks();
    Book findBookId(Long id);
}
