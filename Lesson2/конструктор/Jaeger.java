public class Jaeger {

    private String modelName;
    private String mark;
    private String origin;
    private float height;
    private float weight;
    private int speed;
    private int strength;
    private int armor;

    public String getModelName() {
        return modelName;
    }

    public String getMark() {
        return mark;
    }

    public String getOrigin() {
        return origin;
    }

    public float getHeight() {
        return height;
    }

    public float getWeight() {
        return weight;
    }

    public int getSpeed() {
        return speed;
    }

    public int getStrength() {
        return strength;
    }

    public int getArmor() {
        return armor;
    }



    public Jaeger(String modelName2, String mark2, String origin2, float height2, float weight2, int speed2, int strength2, int armor2) {

        modelName = modelName2;
        mark = mark2;
        origin = origin2;
        height = height2;
        weight = weight2;
        speed = speed2;
        strength = strength2;
        armor = armor2;
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