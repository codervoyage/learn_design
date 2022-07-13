package com.hang.iterator;

/**
 * @Author: dch
 * @Description: Main - run
 * @Create: 2022-07-13 15:45
 **/
public final class Main {

    public static void main(String[] args) {
        // 书架最大放4本书，数组可替换成集合，弥补书架有限的问题。
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("A 《环游世界80天》"));
        bookShelf.appendBook(new Book("B 《圣经》"));
        bookShelf.appendBook(new Book("C 《灰姑娘》"));
        bookShelf.appendBook(new Book("D 《长腿叔叔》"));
        // 获得迭代器
        Iterator iterator = bookShelf.iterator();
        // 遍历
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
