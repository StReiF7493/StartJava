public class Person {


    String manName = "Человек";
    String manGender = "Мужчина";
    float manHeight = 1.78f;
    float manWeight = 74.5f;
    int manAge = 120;

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