package com.fastcampus.abstactex;

public abstract class Car {
    public abstract void drive();
    public abstract void stop();
    public void startCar() {
        System.out.println("시동을 켭니다.");
    }
    public void turnOff() {
        System.out.println("시동을 끕니다.");
    }

    public void washCar() {}

    final public void run() {
        // fianl: 재정의할 수 없는 메서드
        startCar();
        drive();
        stop();
        turnOff();
        washCar();
    }
}
