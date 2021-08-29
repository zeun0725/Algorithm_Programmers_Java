package com.fastcampus.test;

public class People {
    String name;
    int money;

    public People(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public void orderMenu(Cafe cafe, int price) {
        money -= price;
        cafe.sellCoffee(price);
    }

}
