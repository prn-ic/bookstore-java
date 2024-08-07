package ru.bookstore.bookstore.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ru.bookstore.bookstore.contracts.BookRepository;
import ru.bookstore.bookstore.contracts.BookService;
import ru.bookstore.bookstore.entities.Book;
import ru.bookstore.bookstore.requests.dtos.BookDto;
import ru.bookstore.bookstore.responses.BaseResponse;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@RequestMapping("books")
public class BookController {

    @Autowired
    private BookService bookService;

    public BookController() {
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/get")
    public BaseResponse<List<Book>> getListOfBooks() {
        List<Book> books = bookService.Get();
        return new BaseResponse<List<Book>>("Success", 0, books);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/get/")
    public BaseResponse<Book> getById(@RequestParam int id) {
        Book book = bookService.Get(id);
        return new BaseResponse<Book>("Success", 0, book);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("")
    public BaseResponse<Book> add(@RequestBody BookDto entity) {
        Book book = bookService.Add(entity);
        return new BaseResponse<Book>("Success", 0, book);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PutMapping("")
    public BaseResponse<Book> update(@RequestBody BookDto entity) {
        Book book = bookService.Update(entity);
        return new BaseResponse<Book>("Success", 0, book);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @DeleteMapping("")
    public BaseResponse<String> delete(@RequestParam int id) {
        bookService.Delete(id);
        return new BaseResponse<String>("Success", 0, "book was successfully removed");
    }

}
