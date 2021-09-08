package com.fastcampus.inheritance;

public class VIPCustomer extends Customer{

    double salesRatio;
    private int agentID;

    public VIPCustomer(int customerID, String customerName) {
        super(customerID, customerName);
        customerGrade = "VIP";
        bonusRatio = 0.05;
        salesRatio = 0.1;
    }

//    public VIPCustomer() {
//        super(0, null);
//        customerGrade = "VIP";
//        bonusRatio = 0.05;
//        salesRatio = 0.1;
//        System.out.println("VIPCustomer() 생성자 호출");
//    }
}
