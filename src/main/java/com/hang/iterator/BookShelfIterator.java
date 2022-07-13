package com.hang.iterator;

/**
 * @Author: dch
 * @Description: BookShelfIterator - 书架的迭代器
 * @Create: 2022-07-13 15:34
 **/
public class BookShelfIterator implements Iterator{

    private final BookShelf books;

    private int index = 0;

    public BookShelfIterator(BookShelf books) {
        this.books = books;
    }

    @Override
    public boolean hasNext() {
        // 下标不等于数组长度, 还没遍历完，返回true
        if (index < books.getLength()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Object next() {
        Book book = books.getBookAt(index);
        // 下标 + 1, 指向下一个元素
        index++;
        return book;
    }


}
