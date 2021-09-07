package com.fastcampus.array;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        for(Object _list : list) {
            System.out.println(_list);
        }

    }
}
