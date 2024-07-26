package ru.bookstore.bookstore.contracts;

import java.util.List;

import ru.bookstore.bookstore.entities.Book;
import ru.bookstore.bookstore.requests.dtos.BookDto;

public interface BookService {
    
    Book Add(BookDto bookDto);

    Book Update(BookDto bookDto);

    void Delete(int id);

    Book Get(int id);

    List<Book> Get();
}
