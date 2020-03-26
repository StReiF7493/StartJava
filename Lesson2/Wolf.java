public class Wolf {

    private String gender;
    private String name;
    private String color;
    private int weight;
    private int age;

    public String getname() {
        return name;
    }

    void setname(String name) {
        this.name = name;

    }

    public String getgender() {
        return gender;
    }

    void setgender(String gender) {
        this.gender = gender;
    }

    public String getcolor() {
        return color;
    }

    void setcolor(String color) {
        this.color = color;
    }

    public int getweight() {
        return weight;
    }

    void setweight(int weight) {
        this.weight = weight;
    }

    public int getage() {
        return age;
    }

    void setage(int age) {
        if(age >= 8) {
            System.out.println("Некорректный возраст");
        } else {
            this.age = age;
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