package ru.bookstore.bookstore.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ru.bookstore.bookstore.contracts.BookRepository;
import ru.bookstore.bookstore.contracts.BookService;
import ru.bookstore.bookstore.entities.Book;
import ru.bookstore.bookstore.requests.dtos.BookDto;

@Component
public class BookServiceImpl implements BookService {

    @Autowired
    BookRepository bookRepository;

    @Override
    public Book Add(BookDto bookDto) {
        Book book = new Book(bookDto.name, bookDto.pages);
        bookRepository.save(book);

        return book;
    }

    @Override
    public Book Update(BookDto bookDto) {
        Book book = bookRepository.findById(bookDto.id).get();
        book.setName(bookDto.name);
        book.setPages(bookDto.pages);
        bookRepository.save(book);

        return book;
    }

    @Override
    public void Delete(int id) {
        Book book = bookRepository.findById(id).get();
        bookRepository.delete(book);
    }

    @Override
    public Book Get(int id) {
        Book book = bookRepository.findById(id).get();
        return book;
    }

    @Override
    public List<Book> Get() {
        return bookRepository.findAll();
    }

}
