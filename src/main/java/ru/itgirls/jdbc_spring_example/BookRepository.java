package ru.itgirls.jdbc_spring_example;

import java.util.List;

public interface BookRepository {
    List<Book> findAllBooks();
}
