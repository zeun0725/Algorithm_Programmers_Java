package com.programmers.structure;




public class GenericsTest1 {
    public static void main(String[] args){
        Storage<String> storage1 = new Storage<>();
        storage1.setItem("MyItem");
        System.out.println(storage1.getItem());

        Storage<Integer> storage2 = new Storage<>();
        storage2.setItem(100);
        System.out.println(storage2.getItem());
    }
}

