package com.fastcampus.abstactex.abstracttest;

public class Sonata extends Car{
    @Override
    public void turnOn() {
        System.out.println("sonata 시동을 켭니다.");
    }

    @Override
    public void start() {
        System.out.println("sonata 달립니다.");

    }

    @Override
    public void stop() {
        System.out.println("sonata 멈춥니다.");

    }

    @Override
    public void turnOff() {
        System.out.println("sonata 시동을 끕니다.");

    }
}
