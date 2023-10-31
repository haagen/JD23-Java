import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        animals();
        //arv();
    }

    private static void animals() {
        Animal animal = new Animal("Loppan", 'L');
        animal.info();

        Dog dog = new Dog("Fido", 'H');
        dog.info();
        dog.setSex('H');
        dog.info();

        ArrayList<Animal> animals = new ArrayList<Animal>();
        for (int i = 1; i <= 10; i++) {
            if (i <= 5) {
                Animal a = new Animal("Animal " + i, 'M');
                animals.add(a);
            } else {
                Dog d = new Dog("Dog" + i, 'F');
                animals.add(d);
            }
        }

        for (Animal a : animals) {
            System.out.println(a.getName());
        }

    }

    private static void arv() {
        Parent p = new Parent(1);
        Child c = new Child(5, 10);

        System.out.println("p.x = " + p.x);
        p.myMethod();
        System.out.println("p.x = " + p.x);
        System.out.printf("c.x = %d, c.y = %d\n", c.x, c.y);
        c.myMethod();
        System.out.printf("c.x = %d, c.y = %d\n", c.x, c.y);
    }
}