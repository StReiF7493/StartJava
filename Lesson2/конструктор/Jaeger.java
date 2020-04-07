public class Jaeger {

    String modelName;
    String mark;
    String origin;
    float height;
    float weight;
    int speed;
    int strength;
    int armor;

    public Jaeger(String modelName, String mark, String origin, float height, float weight, int speed, int strength, int armor) {
        this.modelName = modelName;
        this.mark = mark;
        this.origin = origin;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
        this.strength = strength;
        this.armor = armor;
    }

    public void palmGripBacklash() {
        System.out.println("used Palm grip backlash");
    }

    public void elbowRocket() {
        System.out.println("used Elbow Rocket");
    }

    public void sluggernaut() {
        System.out.println("used Sluggernaut");
    }

    public void headshock() {
        System.out.println("used Headshock");
    }

    public boolean drift() {
        System.out.println("Вы вошли в дрифт");
        return true;
    }
}