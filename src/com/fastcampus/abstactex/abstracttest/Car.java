package com.fastcampus.abstactex.abstracttest;

public abstract class Car {
    public abstract void turnOn();
    public abstract void start();
    public abstract void stop();
    public abstract void turnOff();

    public final void run() {
        turnOn();
        start();
        stop();
        turnOff();
    }
}
