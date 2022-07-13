package com.hang.iterator;

/**
* @Author: dch
* @Date: 2022/7/13
* @Description: 迭代器接口，提供行为：是否有下一个 hasNext，返回当前元素后指向下一个 next。
*/
public interface Iterator {

    public abstract boolean hasNext();

    public abstract Object next();

}
