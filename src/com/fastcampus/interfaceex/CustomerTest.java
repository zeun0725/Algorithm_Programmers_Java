package com.fastcampus.interfaceex;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.buy();
        customer.sell();
        customer.order();
        customer.sayHello();

        Buy buyer = customer;
        buyer.buy();
        buyer.order(); //인스턴스의 order이 불림

        Sell seller = customer;
        seller.sell();
        seller.order();

        if (seller instanceof Customer) {
            System.out.println("true");
        }
    }
}
