package com.startjava.lesson2.jaeger;

public class JaegerTest {
    public static void main(String[] args) {
        Jaeger gipsyDanger = new Jaeger("Gipsy Danger", "Mark-3", "USA", 79.25f, 1.1980f, 7, 8, 6);

        System.out.println("имя модели " + gipsyDanger.getModelName() + ". Марка: " + gipsyDanger.getMark() + ". Страна производства: " + gipsyDanger.getOrigin() + ". Рост: " + gipsyDanger.getHeight() + "м" + ". Вес: " + gipsyDanger.getWeight() + "т" + ". Скорость: " + gipsyDanger.getSpeed() + ". Сила: " + gipsyDanger.getStrength() + ". Защита: " + gipsyDanger.getArmor());
        gipsyDanger.palmGripBacklash();
        gipsyDanger.elbowRocket();
        System.out.println(gipsyDanger.drift());

        Jaeger chernoAlpha = new Jaeger("Cherno Alpha", "Mark-1", "Russia", 85.34f, 2.412f, 3, 10, 10);

        System.out.println("имя модели " + chernoAlpha.getModelName() + ". Марка: " + chernoAlpha.getMark() + ". Страна производства: " + chernoAlpha.getOrigin() + ". Рост: " + chernoAlpha.getHeight() + "м" + ". Вес: " + chernoAlpha.getWeight() + "т" + ". Скорость: " + chernoAlpha.getSpeed() + ". Сила: " + chernoAlpha.getStrength() + ". Защита: " + chernoAlpha.getArmor());
        chernoAlpha.sluggernaut();
        chernoAlpha.headshock();
        System.out.println(chernoAlpha.drift());
    }
}