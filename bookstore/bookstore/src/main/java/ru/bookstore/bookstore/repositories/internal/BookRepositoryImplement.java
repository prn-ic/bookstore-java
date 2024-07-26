package ru.bookstore.bookstore.repositories.internal;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import ru.bookstore.bookstore.contracts.BookRepository;
import ru.bookstore.bookstore.entities.Book;
import ru.bookstore.bookstore.requests.dtos.BookDto;

@Component
public class BookRepositoryImplement implements BookRepository {

    private List<Book> books = new ArrayList<>();

    public BookRepositoryImplement() {

    }

    public BookRepositoryImplement(List<Book> books) {
        this.books = books;
    }

    @Override
    public Book Add(BookDto bookDto) {
        Book book = new Book(bookDto.name, bookDto.pages);
        book.setId(books.size() + 1);
        books.add(book);

        return book;
    }

    @Override
    public Book Update(BookDto bookDto) {
        Book book = books.stream().filter(b -> bookDto.id == b.getId()).findFirst().get();
        if (book == null) {
            book = this.Add(bookDto);
        }

        book.setName(bookDto.name);
        book.setPages(bookDto.pages);

        return book;
    }

    @Override
    public void Delete(int id) {
        Book book = books.stream().filter(b -> id == b.getId()).findFirst().get();
        books.remove(book.getId() - 1);
    }

    @Override
    public Book Get(int id) {
        return books.get(id - 1);
    }

    @Override
    public List<Book> Get() {
        return books;
    }

}
