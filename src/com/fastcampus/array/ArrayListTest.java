package com.fastcampus.array;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        for(String _list : list) {
            System.out.println(_list);
        }

        for(int i=0; i<list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
