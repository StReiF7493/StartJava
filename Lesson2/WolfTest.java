public class WolfTest {

    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        wolfOne.setgender("Самец");
        wolfOne.setname("Волчара");
        wolfOne.setcolor("Серый");
        wolfOne.setage(7);
        wolfOne.setweight(50);

        System.out.println("Пол волка: " + wolfOne.getgender());
        System.out.println("Кличка волка: " + wolfOne.getname());
        System.out.println("Окрас волка: " + wolfOne.getcolor());
        System.out.println("Возраст волка: " + wolfOne.getage() + " лет");
        System.out.println("Вес волка: " + wolfOne.getweight() + " кг");

        wolfOne.move();
        wolfOne.sit();
        wolfOne.run();
        wolfOne.howl();
        System.out.println(wolfOne.hunt());
    }
}