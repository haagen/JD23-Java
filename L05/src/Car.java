public class Car {

    /*
        Egenskaper (Properties/Attributes/Fields mm)

        Global variabler - dvs globala i klassen. Du kan använda
                           dem i metoderna.
     */
    String make;
    String model;
    String color;
    int year;
    int maxSpeed;
    int currentSpeed = 0;

    Car(String make) {
        /*
            lokal variabel -- fungerar i denna metoden, men inte i andra
                              metoder i klassen.
         */
        int wheelDimensions = 0;
        currentSpeed = 0;
        this.make = make;
    }

    Car(String make, String model, String color, int year, int maxSpeed)  {
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
        this.maxSpeed = maxSpeed;
    }

    void info() {
        System.out.printf("Car %s at speed %d\n", this.make, this.currentSpeed);
    }

    void info(int version) {
        System.out.printf("Car (%d): %s\n", version, make);
    }


    static void honk() {
        System.out.println("TUUUT TUUUT!");
    }

    int accelerate(int changeInSpeed) {
        currentSpeed += changeInSpeed;
        if(currentSpeed > maxSpeed) {
            currentSpeed = maxSpeed;
        }
        return currentSpeed;
    }

    int brake(int changeInSpeed) {
        currentSpeed -= changeInSpeed;
        if(currentSpeed<0) {
            currentSpeed=0;
        }
        return currentSpeed;
    }


}
