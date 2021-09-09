package com.fastcampus.polymorphism;

import java.util.ArrayList;

class Animal{
    public void move() {
        System.out.println("동물이 움직입니다.");
    }
}

class Human extends Animal {
    public void move() {
        System.out.println("사람이 움직입니다.");
    }

    public void readBooks() {
        System.out.println("사람이 책을 읽습니다.");
    }
}

class Tiger extends Animal {
    public void move() {
        System.out.println("호랑이가 네발로 뜁니다.");
    }

    public void hunting() {
        System.out.println("호랑이가 사냥을 합니다.");
    }
}


public class AnimalTest {
    public static void main(String[] args) {
        // 다형성 (polymorphism)
        Animal hAnimal = new Human();
        Animal tAnimal = new Tiger();

        AnimalTest test = new AnimalTest();
//        test.moveAnimal(hAnimal);
//        test.moveAnimal(tAnimal);

        ArrayList<Animal> animalList = new ArrayList<Animal>();
        animalList.add(hAnimal);
        animalList.add(tAnimal);

        for(Animal animal : animalList) {
            animal.move();

        }

        test.testDownCasting(animalList);
    }

    public void testDownCasting(ArrayList<Animal> list) {
        for(int i=0; i<list.size(); i++) {
            Animal ani = list.get(i);

            if ( ani instanceof Human ) {
                Human human = (Human)ani;
                human.readBooks();
            }
            else if (ani instanceof Tiger) {
                Tiger tiger = (Tiger)ani;
                tiger.hunting();
            }
        }
    }

    public void moveAnimal(Animal animal) {
        animal.move();
    }
}
