package com.startjava.person;

public class Person {

    String name = "Человек";
    String gender = "Мужчина";
    float height = 1.78f;
    float weight = 74.5f;
    int age = 120;

    void move() {
        System.out.println("Человек идёт");
    }

    void sit() {
        System.out.println("Человек сидит");
    }

    void run() {
        System.out.println("Человек бежит");
    }

    void talk() {
        System.out.println("Человек говорит");
    }

    boolean learnJava() {
        System.out.println("Человек учит JAVA");
        return true;
    }
}