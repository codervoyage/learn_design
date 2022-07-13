package com.hang.iterator;

/**
 * @Author: dch
 * @Description: BookShelf - 书架
 * @Create: 2022-07-13 15:34
 **/
public class BookShelf implements Aggregate {

    private final Book[] books;

    private int index = 0;

    public Book getBookAt(int index) {
        return books[index];
    }

    public void appendBook(Book book) {
        this.books[index] = book;
        index++;
    }

    public BookShelf(int size) {
        this.books = new Book[size];
    }

    public int getLength() {
        return index;
    }


    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
