import java.util.Random;

public class Main {
    public static void main(String[] args) {

        System.out.println("for-loop");
        for(int i=1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println("");

        System.out.println("while-loop");
        int i=1;
        while(i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println("");

        System.out.println("do-while-loop");
        i = 1;
        do {
            System.out.print(i + " ");
            i++;
        } while(i <= 10);
        System.out.println("");

        printRandomNumber();
    }

    private static void printRandomNumber() {
        Random random = new Random();
        int myRandomNumber = random.nextInt(10);
        System.out.println("random-loop-length");
        for(int i=1;i<=myRandomNumber;i++) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }
}