public class JaegerTest {
    public static void main(String[] args) {
        Jaeger gipsyDanger = new Jaeger("Gipsy Danger", "Mark-3", "USA", 79.25f, 1.1980f, 7, 8, 6);

        System.out.println("имя модели " + gipsyDanger.modelName + ". Марка: " + gipsyDanger.mark + ". Страна производства: " + gipsyDanger.origin + ". Рост: " + gipsyDanger.height + ".   Вес: " + gipsyDanger.weight + ". Скорость: " + gipsyDanger.speed + ". Сила: " + gipsyDanger.strength + ". Защита: " + gipsyDanger.armor);
        gipsyDanger.palmGripBacklash();
        gipsyDanger.elbowRocket();
        System.out.println(gipsyDanger.drift());

        Jaeger chernoAlpha = new Jaeger("Cherno Alpha", "Mark-1", "Russia", 85.34f, 2.412f, 3, 10, 10);

        System.out.println("имя модели " + chernoAlpha.modelName + ". Марка: " + chernoAlpha.mark + ". Страна производства: " + chernoAlpha.origin + ". Рост: " + chernoAlpha.height + "м" + ". Вес: " + chernoAlpha.weight + "т" + ". Скорость: " + chernoAlpha.speed + ". Сила: " + chernoAlpha.strength + ". Защита: " + chernoAlpha.armor);
        chernoAlpha.sluggernaut();
        chernoAlpha.headshock();
        System.out.println(chernoAlpha.drift());
    }
}