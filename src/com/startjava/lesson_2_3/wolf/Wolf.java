package com.startjava.lesson_2_3.wolf;

public class Wolf {

    private String gender;
    private String name;
    private String color;
    private int weight;
    private int age;

    public String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    void setGender(String gender) {
        this.gender = gender;
    }

    public String getColor() {
        return color;
    }

    void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    void setAge(int age) {
        if(age >= 8) {
            System.out.println("Некорректный возраст");
        } else {
            this.age = age;
            System.out.println("Возраст волка: " + age + " лет");
        }
    }

    public void move() {
        System.out.println("Волк пошел");
    }

    public void sit() {
        System.out.println("Волк сел");
    }

    public void run() {
        System.out.println("Волк побежал");
    }

    public void howl() {
        System.out.println("Волк завыл");
    }

    public boolean hunt() {
        System.out.println("Волк охотитcя");
        return true;
    }
}