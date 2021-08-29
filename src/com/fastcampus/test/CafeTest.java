package com.fastcampus.test;

public class CafeTest {
    public static void main(String[] args) {
        People Kim = new People("kim",10000);
        People Lee = new People("lee",10000);

        Cafe starCafe = new Cafe("star");
        Cafe beanCafe = new Cafe("bean");

        Kim.orderMenu(starCafe, Menu.STARAMERICANO);
        Lee.orderMenu(beanCafe, Menu.BEANLATTE);

    }
}
