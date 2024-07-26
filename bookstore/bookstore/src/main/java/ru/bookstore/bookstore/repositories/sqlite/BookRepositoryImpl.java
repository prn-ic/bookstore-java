package ru.bookstore.bookstore.repositories.sqlite;

import java.util.List;

import ru.bookstore.bookstore.contracts.BookRepository;
import ru.bookstore.bookstore.entities.Book;
import ru.bookstore.bookstore.requests.dtos.BookDto;

public class BookRepositoryImpl implements BookRepository {

    

    @Override
    public Book Add(BookDto bookDto) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Add'");
    }

    @Override
    public Book Update(BookDto bookDto) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Update'");
    }

    @Override
    public void Delete(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Delete'");
    }

    @Override
    public Book Get(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Get'");
    }

    @Override
    public List<Book> Get() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Get'");
    }
    
}
