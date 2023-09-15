package com.company;
public class RabbitAndTurtle {
    public static void main(String[] args) {
        AnimalThread rabbit = new AnimalThread("Кролик", 1);
        AnimalThread turtle = new AnimalThread("Черепаха", 5);

        rabbit.start();
        turtle.start();
    }
}
class AnimalThread extends Thread {
    private String name;
    private volatile int priority;
    private int distance;

    public AnimalThread(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    public void run() {
        while (distance < 50) {
            distance += 10;
            System.out.println(name + " пробежал " + distance + " метров");
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(name + " прибежал!");
    }
}


