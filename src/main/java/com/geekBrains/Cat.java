package com.geekBrains;

public class Cat extends Animal {

    public static int count = 0;

    public Cat(int run) {
        super(run, 0);
        count++;
    }

    @Override
    public void run() {
        realRun();
    }

    public void run(int run) {
        super.setRun(run);
        realRun();
    }

    @Override
    public void swim() {
        System.out.println("Кот не умеет плавать!");
    }

    public void realRun() {
        if (getRun() > 200) {
            System.out.println("Коту не хватает сил пробежать такое расстояние");
        } else if (getRun() >= 0) {
            if (getRun() == 1) {
                System.out.println("Кот пробежал " + getRun() + " метр");
            } else if (getRun() > 1 && getRun() <= 4) {
                System.out.println("Кот пробежал " + getRun() + " метра");
            } else System.out.println("Кот пробежал " + getRun() + " метров");
        } else System.out.println("Коты задом не бегают");
    }

    public static void getInfo() {
        System.out.println("Созданных котов: " + count);
    }
}
