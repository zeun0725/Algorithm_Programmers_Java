package com.fastcampus.polymorphism;

public class VIPCustomer extends Customer {

    double salesRatio;
    private final int agentID;

    public VIPCustomer(int customerID, String customerName, int agentID) {
        super(customerID, customerName);
        customerGrade = "VIP";
        bonusRatio = 0.05;
        salesRatio = 0.2;
        this.agentID = agentID;
    }

    @Override
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price - (int)(price * salesRatio);
    }

    @Override
    public String showCustomerInfo() {
        return super.showCustomerInfo() + "담당 직원 번호는 " + agentID + "입니다.";
    }
}
