package com.startjava.lesson_2_3.wolf;

public class WolfTest {

    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        wolfOne.setGender("Самец");
        wolfOne.setName("Волчара");
        wolfOne.setColor("Серый");
        wolfOne.setAge(7);
        wolfOne.setWeight(50);

        System.out.println("Пол волка: " + wolfOne.getGender());
        System.out.println("Кличка волка: " + wolfOne.getName());
        System.out.println("Окрас волка: " + wolfOne.getColor());
        System.out.println("Вес волка: " + wolfOne.getWeight() + " кг");

        wolfOne.move();
        wolfOne.sit();
        wolfOne.run();
        wolfOne.howl();
        System.out.println(wolfOne.hunt());
    }
}