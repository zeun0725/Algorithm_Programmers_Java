package com.fastcampus.test;

public class Cafe {
    String name;
    int money;

    public Cafe(String name) {
        this.name = name;
    }
    public void sellCoffee(int price) {
        money += price;
    }
}
