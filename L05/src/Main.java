public class Main {
    public static void main(String[] args) {

        //lesson1();
        //lesson2();

        lesson3();

    }

    static void lesson3() {
        Pet hund = new Pet("Boss", 3, "Hund");
        Pet cat = new Pet("Sickan", 12, "Katt");
        Pet pp = new Pet("Plutten", 23, "Häst");
    }

    static void lesson2() {

        Pokemon chansey = new Pokemon("Chansey", 110, "Jord", 60);
        Pokemon pikachu = new Pokemon("Pikachu", 90, "Eld", 80);

        pikachu.attack(chansey);
        pikachu.stats();


    }

    static void lesson1() {
        Car suzuki = new Car("Suzuki", "Samurai", "Black", 1986, 90);
        suzuki.year = 1986;

        Car volvo = new Car("Volvo", "XC90", "Saffrans Gul", 2022, 190);

        suzuki.info();
        volvo.info();
        volvo.info(25);

        //suzuki.honk();
        //Car.honk(); // honk() är static - då behöver vi ingen instans av klassen

        suzuki.info();
        suzuki.accelerate(70);
        //suzuki.currentSpeed = 2000;
        suzuki.info();
        System.out.println("Ny hastighet för Suzuki:n: " + suzuki.accelerate(70));
        System.out.println("Jag tvärnitar i 5s då får jag hastigheten: " + suzuki.brake(35));
        suzuki.info();
    }
}