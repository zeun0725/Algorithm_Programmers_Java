package com.fastcampus.abstactex.abstracttest;

public class Avante extends Car{
    @Override
    public void turnOn() {
        System.out.println("avante 시동을 켭니다.");
    }

    @Override
    public void start() {
        System.out.println("avante 달립니다.");

    }

    @Override
    public void stop() {
        System.out.println("avante 멈춥니다.");

    }

    @Override
    public void turnOff() {
        System.out.println("avante 시동을 끕니다.");

    }
}
