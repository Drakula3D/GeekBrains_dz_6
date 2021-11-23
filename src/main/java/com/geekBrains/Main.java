package com.geekBrains;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog(100, 10);
        Cat cat = new Cat(200);
        Cat catTom = new Cat(100);
        Dog dogArni = new Dog(100, 200);

        cat.run(1);
        dog.run(450);
        System.out.println();

        dogArni.swim();
        dog.swim(10);
        catTom.swim();
        System.out.println();

        Animal.getInfo();
        Cat.getInfo();
        Dog.getInfo();

    }
}
