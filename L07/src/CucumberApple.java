public class CucumberApple implements Veggie, Fruit{

    String name;
    String color;

    CucumberApple(String name, String color) {
        this.name = name;
        this.color = color;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public int ripe() {
        System.out.println("Sweet, so sweet. I must ripe!");
        return 42;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }
}
