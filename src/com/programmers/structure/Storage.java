package com.programmers.structure;

//제네릭 클래스 사용
public class Storage<T> {
    T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }


}
