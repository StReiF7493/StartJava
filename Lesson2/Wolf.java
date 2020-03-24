public class Wolf {

    String gender;
    String name;
    String color;
    int weight;
    int age;

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