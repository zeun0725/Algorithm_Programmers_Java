package com.fastcampus.classpart;

public class PersonTest {

    public static void main(String[] args) {
        Person person = new Person();
        person.age = 40;
        person.name = "James";
        person.isMarried = true;
        person.numberOfChildren = 3;

        System.out.println("나이:" + person.age);
    }
}
