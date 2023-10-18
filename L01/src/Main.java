/*
 Det finns mycket funktionalitet i Java - men för att få tillgång till den
 behöver vi göra den tillgänglig för vår klass. Det gör vi med import. Imports lägger
 man alltid i toppen på filen.
 */

import java.util.Scanner;

/*
    Detta är en kommentar i Java - den kan täcka flera rader och
    det som skriv här ignoreras av kompilatorn.
 */
// En kommentar kan också täcka en rad på detta sättet
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        /*

            Fär att spara information använder vi variabler:

            typ namn;
            typ namn = value;

         */

        int age;    // Heltal
        String name = "Martin"; // Sträng
        double points = 0.0; // Flyttal

        // Variabler kan vi använda på olika sätt - t.ex. för utskrift
        System.out.println("Hej " + name + "!");

        System.out.println("Hur gammal är du?");
        Scanner scanner = new Scanner(System.in);
        age = scanner.nextInt();

        final int MAXYEAR = 100;
        int inTheFuture = MAXYEAR - age;
        System.out.println("Då är du " + MAXYEAR + " år om " + inTheFuture + " år!");
        //System.out.println("Då är du " + MAXYEAR + " år om " + (MAXYEAR - age) + " år!");
    }
}