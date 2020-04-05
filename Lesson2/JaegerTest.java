public class JaegerTest {
    public static void main(String[] args) {
        Jaeger gipsyDanger = new Jaeger();
        gipsyDanger.setModelName("Gipsy Danger");
        gipsyDanger.setMark("Mark-3");
        gipsyDanger.setOrigin("USA");
        gipsyDanger.setHeight(79.25f);
        gipsyDanger.setWeight(1.980f);
        gipsyDanger.setSpeed(7);
        gipsyDanger.setStrength(8);
        gipsyDanger.setArmor(6);

        System.out.println("имя модели: " + gipsyDanger.getModelName());
        System.out.println("Марка: " + gipsyDanger.getMark());
        System.out.println("Страна производства: " + gipsyDanger.getOrigin());
        System.out.println("Рост: " + gipsyDanger.getHeight() + "м");
        System.out.println("Вес: " + gipsyDanger.getWeight() + "т");
        System.out.println("Скорость: " + gipsyDanger.getSpeed());
        System.out.println("Сила: " + gipsyDanger.getStrength());
        System.out.println("Защита: " + gipsyDanger.getArmor());
        gipsyDanger.palmGripBacklash();
        gipsyDanger.elbowRocket();
        System.out.println(gipsyDanger.drift());

        Jaeger chernoAlpha = new Jaeger();
        chernoAlpha.setModelName("Cherno Alpha");
        chernoAlpha.setMark("Mark-1");
        chernoAlpha.setOrigin("Russia");
        chernoAlpha.setHeight(85.34f);
        chernoAlpha.setWeight(2.412f);
        chernoAlpha.setSpeed(3);
        chernoAlpha.setStrength(10);
        chernoAlpha.setArmor(10);

        System.out.println("имя модели: " + chernoAlpha.getModelName());
        System.out.println("Марка: " + chernoAlpha.getMark());
        System.out.println("Страна производства: " + chernoAlpha.getOrigin());
        System.out.println("Рост: " + chernoAlpha.getHeight() + "м");
        System.out.println("Вес: " + chernoAlpha.getWeight() + "т");
        System.out.println("Скорость: " + chernoAlpha.getSpeed());
        System.out.println("Сила: " + chernoAlpha.getStrength());
        System.out.println("Защита: " + chernoAlpha.getArmor());
        chernoAlpha.sluggernaut();
        chernoAlpha.headshock();
        System.out.println(chernoAlpha.drift());
    }
}