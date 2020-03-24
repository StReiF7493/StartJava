public class WolfTest {

    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        wolfOne.gender = "Самец";
        wolfOne.name = "Волчара";
        wolfOne.color = "Серый";
        wolfOne.age = 5;
        wolfOne.weight = 50;
        System.out.println("Пол волка: " + wolfOne.gender);
        System.out.println("Кличка волка: " + wolfOne.name);
        System.out.println("Окрас волка: " + wolfOne.color);
        System.out.println("Возраст волка " + wolfOne.age + " лет");
        System.out.println("Вес волка " + wolfOne.weight + " кг");
        wolfOne.move();
        wolfOne.sit();
        wolfOne.run();
        wolfOne.howl();
        System.out.println(wolfOne.hunt());
    }
}