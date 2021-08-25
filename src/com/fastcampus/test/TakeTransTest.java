package com.fastcampus.test;

public class TakeTransTest {

    public static void main(String[] args) {
        Student studentJ = new Student("James", 5000);
        Student studentT = new Student("Tomas", 10000);

        Bus bus100 = new Bus(100);
        Bus bus200 = new Bus(200);
        Subway subwayGreen = new Subway(2);
        Subway subwayWhite = new Subway(1);

        studentJ.takeBus(bus100);
        studentT.takeSubway(subwayWhite);

        studentJ.showInfo();
        studentT.showInfo();
        bus100.showBusInfo();
        bus200.showBusInfo();
        subwayGreen.showSubwayInfo();
        subwayWhite.showSubwayInfo();
    }
}
