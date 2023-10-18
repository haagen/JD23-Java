public class Main {
    public static void main(String[] args) {

        int myInt = 1;
        float myFloat = 2.0f;   // (4byte - 32bitar)
        double myDouble = 3.0;   // (8byte - 64bitar)
        char myChar = 'S';      // Ett tecken (2 byte)
        boolean myBool = false;

        //System.out.println(myBool); // Skriv "sout" för att snabbt skriva detta

        // Widening Cast - en "mindre" typ till en "större"
        myFloat = myInt;
        myDouble = myFloat;
        System.out.printf("Widening cast: %.10f %.10f %d\n", myDouble, myFloat, myInt);

        // Narrowing Cast - "större" typ till en "mindre"
        myDouble = 3.145678951234;
        myFloat = (float) myDouble;
        myInt = (int) myFloat;
        System.out.printf("Narrowing cast: %.10f %.10f %d\n", myDouble, myFloat, myInt);

        myInt = 0;
        myInt = myInt + 1; // (1)
        myInt++;           // (2)

    }
}