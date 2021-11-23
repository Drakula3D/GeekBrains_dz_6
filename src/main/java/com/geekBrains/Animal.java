package com.geekBrains;

public abstract class Animal {

    private int run;
    private int swim;
    public static int count = 0;

    public abstract void run();

    public abstract void swim();

    public Animal(int run, int swim) {
        this.run = run;
        this.swim = swim;
        count++;
    }

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public int getSwim() {
        return swim;
    }

    public void setSwim(int swim) {
        this.swim = swim;
    }

    public static void getInfo() {
        System.out.println("Созданных животных: " + count);
    }
}
