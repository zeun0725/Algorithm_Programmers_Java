package com.fastcampus.test;

public class People {
    String name;
    int money;

    public People(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public void buyStarCafe(StarCafe starCafe, int price) {
        money -= price;
        starCafe.sellCoffee(price);
    }

    public void buyBeanCafe(BeanCafe beanCafe, int price) {
        money -= price;
        beanCafe.sellCoffee(price);
    }
}
