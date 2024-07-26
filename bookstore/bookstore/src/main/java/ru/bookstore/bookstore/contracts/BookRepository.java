package ru.bookstore.bookstore.contracts;

import org.springframework.data.jpa.repository.JpaRepository;

import ru.bookstore.bookstore.entities.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {
}
