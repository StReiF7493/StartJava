public class WolfTest {

    public static void main(String[] args) {
        Wolf WolfOne = new Wolf();
        WolfOne.gender = "Самец";
        WolfOne.name = "Волчара";
        WolfOne.color = "Серый";
        WolfOne.age = 5;
        WolfOne.weight = 50;
        System.out.println("Пол волка: " + WolfOne.gender);
        System.out.println("Кличка волка: " + WolfOne.name);
        System.out.println("Окрас волка: " + WolfOne.color);
        System.out.println("Возраст волка " + WolfOne.age + " лет");
        System.out.println("Вес волка " + WolfOne.weight + " кг");
        WolfOne.move();
        WolfOne.sit();
        WolfOne.run();
        WolfOne.howl();
        System.out.println(WolfOne.hunt());
    }
}