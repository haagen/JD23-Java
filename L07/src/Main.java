public class Main {
    public static void main(String[] args) {
        GUI gui = new GUI();    // Skapa en ny instans av mitt GUI


        /*
        CucumberApple cucumberApple = new CucumberApple("Banan", "Grön");
        printNameAndRipeness(cucumberApple);
        printColor(cucumberApple);
        */

    }

    static void printColor(Veggie thisVeggie) {
        System.out.println(thisVeggie.getColor());
    }

    static void printNameAndRipeness(Fruit thisFruit) {
        thisFruit.ripe();
        System.out.println(thisFruit.getName());
    }
}

