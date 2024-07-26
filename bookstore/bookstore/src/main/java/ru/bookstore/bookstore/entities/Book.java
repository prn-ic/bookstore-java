package ru.bookstore.bookstore.entities;

public class Book extends BaseEntity {
    private String name;
    private int pages;

    public Book() {

    }

    public Book(String name, int pages) {
        this.name = name;
        this.pages = pages;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
