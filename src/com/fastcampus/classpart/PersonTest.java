package com.fastcampus.classpart;

public class PersonTest {

    public static void main(String[] args) {
        Person personNoName = new Person();
        personNoName.showInfo();

        Person personLee = new Person("Lee", 20);
        personLee.showInfo();
        System.out.println(personLee);

        Person p = personLee.getSelf();
        System.out.println(p);
    }
}
