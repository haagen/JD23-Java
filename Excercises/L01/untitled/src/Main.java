import java.util.Scanner;

public class Main {

    final static Double PI = 3.14;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your radius? ");
        Double radius = scanner.nextDouble();

        System.out.println("The circumference is: " + (2*PI*radius));

    }


}