package ru.bookstore.bookstore.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ru.bookstore.bookstore.contracts.BookRepository;
import ru.bookstore.bookstore.entities.Book;
import ru.bookstore.bookstore.requests.dtos.BookDto;
import ru.bookstore.bookstore.responses.BaseResponse;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@RequestMapping("books")
@Component
public class BookController {

    private BookRepository bookRepository;

    @Autowired
    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @GetMapping("/get")
    public BaseResponse<List<Book>> getListOfBooks() {
        List<Book> books = bookRepository.Get();
        return new BaseResponse<List<Book>>("Success", 0, books);
    }

    @GetMapping("/get/{id}")
    public BaseResponse<Book> getById(@RequestParam int id) {
        Book book = bookRepository.Get(id);
        return new BaseResponse<Book>("Success", 0, book);
    }

    @PostMapping("")
    public BaseResponse<Book> add(@RequestBody BookDto entity) {
        Book book = bookRepository.Add(entity);
        return new BaseResponse<Book>("Success", 0, book);
    }

    @PutMapping("")
    public BaseResponse<Book> update(@RequestBody BookDto entity) {
        Book book = bookRepository.Update(entity);
        return new BaseResponse<Book>("Success", 0, book);
    }

    @DeleteMapping("{id}")
    public BaseResponse<String> delete(@RequestParam int id) {
        bookRepository.Delete(id);
        return new BaseResponse<String>("Success", 0, "book was successfully removed");
    }

}
