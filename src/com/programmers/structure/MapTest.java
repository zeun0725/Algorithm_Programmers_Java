package com.programmers.structure;

import java.util.*;

public class MapTest {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("1","Apple Iphone");
        map.put("2","Apple Ipad");
        map.put("3","Samsung Galaxy");
        map.put("4","Samsung Tablet");

        System.out.println("2: " + map.get("2"));

        for (Map.Entry<String, String> entry : map.entrySet()){
            System.out.printf("%s:%s\n", entry.getKey(), entry.getValue());
        }

        for(String s : map.keySet()) {
            System.out.printf("%s\n", s);
        }

        for(String s : map.values()) {
            System.out.printf("%s\n", s);
        }


    }
}
