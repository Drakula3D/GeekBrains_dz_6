package com.geekBrains;

public class Dog extends Animal {

    public static int count = 0;

    public Dog(int run, int swim) {
        super(run, swim);
        count++;
    }

    @Override
    public void run() {
        realRun();
    }

    @Override
    public void swim() {
        realSwim();
    }

    public void run(int run) {
        super.setRun(run);
        realRun();
    }

    public void swim(int swim) {
        super.setSwim(swim);
        realSwim();
    }

    public void realRun() {
        if (getRun() > 500) {
            System.out.println("Собаке не хватает сил пробежать такое расстояние");
        } else if (getRun() >= 0) {
            if (getRun() == 1) {
                System.out.println("Собака пробежала " + getRun() + " метр");
            } else if (getRun() > 1 && getRun() <= 4) {
                System.out.println("Собака пробежала " + getRun() + " метра");
            } else System.out.println("Собака пробежала " + getRun() + " метров");
        } else System.out.println("Собаки задом не бегают");
    }

    public void realSwim() {
        if (getSwim() > 10) {
            System.out.println("Собаке не хватает сил проплыть такое расстояние");
        } else if (getSwim() >= 0) {
            if (getSwim() == 1) {
                System.out.println("Собака проплыла " + getSwim() + " метр");
            } else if (getSwim() > 1 && getSwim() <= 4) {
                System.out.println("Собака проплыла " + getSwim() + " метра");
            } else System.out.println("Собака проплыла " + getSwim() + " метров");
        } else System.out.println("Собаки задом не плавают");
    }

    public static void getInfo() {
        System.out.println("Созданных собак: " + count);
    }
}
