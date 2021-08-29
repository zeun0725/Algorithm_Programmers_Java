package com.fastcampus.test;

public class CafeTest {
    public static void main(String[] args) {
        People Kim = new People("kim",10000);
        People Lee = new People("lee",10000);

        StarCafe starCafe = new StarCafe();
        BeanCafe beanCafe = new BeanCafe();

        Kim.buyStarCafe(starCafe, Menu.STARAMERICANO);
        Lee.buyBeanCafe(beanCafe, Menu.BEANLATTE);

    }
}
