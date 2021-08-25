package com.fastcampus.test;

public class Subway {
    int number;
    int passengerCount;
    int money;

    public Subway(int number) {
        this.number = number;
    }

    public void take(int money) { //승차
        this.money += money;
        passengerCount++;
    }

    public void showSubwayInfo() {
        System.out.println(number + "번 지하철의 승객 수는" + passengerCount + "이고, 수입은" + money + "입니다.");
    }
}
