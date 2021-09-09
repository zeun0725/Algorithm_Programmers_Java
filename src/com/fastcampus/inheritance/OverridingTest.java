package com.fastcampus.inheritance;

public class OverridingTest {
    public static void main(String[] args) {
        Customer customerLee = new Customer(10010,"이순신");
        customerLee.bonusPoint = 1000;

        Customer customerKim = new VIPCustomer(10020, "김유신");
        customerKim.bonusPoint = 10000;

        int priceLee = customerLee.calcPrice(10000);
        int priceKim = customerKim.calcPrice(10000);

        //가상 메서드 (메서드의 이름과 메서드의 주소를 가진 가상 메서드 테이블에서 호출될 메서드의 주소를 참조함)
        // 생성된 인스턴스에 기반해 호출되는 것이 가상 메서드
        System.out.println(customerLee.showCustomerInfo() + "지불 금액은 " + priceLee + "입니다.");
        System.out.println(customerKim.showCustomerInfo() + "지불 금액은 " + priceKim + "입니다.");


    }
}
