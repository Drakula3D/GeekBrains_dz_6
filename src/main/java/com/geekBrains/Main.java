package com.geekBrains;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog(100, 10);
        Cat cat = new Cat(200);
        Cat catTom = new Cat(100);
        Dog dogArni = new Dog(100, 200);

        dog.run(450);
        cat.run(1);
        System.out.println();

        dog.swim(10);
        dogArni.swim();
        catTom.swim();
        System.out.println();

        Animal.getInfo();
        Cat.getInfo();
        Dog.getInfo();
    }
}
