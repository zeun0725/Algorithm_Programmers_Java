package com.fastcampus.polymorphism;

import java.util.ArrayList;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customer1 = new Customer(1,"AAA");
        Customer customer2 = new Customer(2,"BBB");
        Customer customer3 = new GoldCustomer(3,"CCC");
        Customer customer4 = new GoldCustomer(4,"DDD");
        Customer customer5 = new VIPCustomer(5, "FFF", 100);
        Customer customer6 = new VIPCustomer(6, "GGG", 200);

        ArrayList<Customer> customerList = new ArrayList<>();
        customerList.add(customer1);
        customerList.add(customer2);
        customerList.add(customer3);
        customerList.add(customer4);
        customerList.add(customer5);
        customerList.add(customer6);

        for(Customer customer : customerList) {
            int cost = customer.calcPrice(10000);
            System.out.println(customer.showCustomerInfo() + cost + "원 지불하였습니다.");
        }


    }
}
