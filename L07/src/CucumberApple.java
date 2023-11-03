public class CucumberApple implements Veggie, Fruit{

    String name;
    String color;

    CucumberApple(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public int ripe() {
        System.out.println("Sweet, so sweet. I must ripe!");
        return 42;
    }
}
