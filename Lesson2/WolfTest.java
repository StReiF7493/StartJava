public class WolfTest {

    public static void main(String[] args){
        Wolf WolfOne = new Wolf();
        System.out.println("Пол волка: " + WolfOne.gender);
        System.out.println("Кличка волка: " + WolfOne.name);
        System.out.println("Окрас волка: " + WolfOne.color);
        System.out.println(WolfOne.hunt());
    }
}