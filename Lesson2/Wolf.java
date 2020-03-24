public class Wolf {

    String gender = "Самец";
    String name = "Волчара";
    String color = "Серый";
    int weight = 60;
    int age = 5;

    void move() {
        System.out.println("Волк пошел");
    }

    void sit() {
        System.out.println("Волк сел");
    }

    void run() {
        System.out.println("Волк побежал");
    }

    void howl() {
        System.out.println("Волк завыл");
    }

    boolean hunt () {
        System.out.println("Волк охотитcя");
        return true;
    }
}