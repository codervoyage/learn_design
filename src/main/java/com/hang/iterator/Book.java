package com.hang.iterator;

/**
 * @Author: dch
 * @Description: Book - book没啥大用，book只是book
 * @Create: 2022-07-13 15:32
 **/
public class Book {

    private final String name;

    public Book(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                '}';
    }
}
