package com.fastcampus.test;

public class Bus {
    int number;
    int passengerCount;
    int money;

    public Bus(int number) {
        this.number = number;
    }

    public void take(int money) { //승차
        this.money += money;
        passengerCount++;
    }

    public void showBusInfo() {
        System.out.println(number + "번 버스의 승객 수는" + passengerCount + "이고, 수입은" + money + "입니다.");
    }

}
