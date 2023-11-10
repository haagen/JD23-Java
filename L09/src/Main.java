import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        //stringMethods();
        //arraysMethods();
        //dateAndTimeMethods();
        tryCatchMethods();

    }

    private static void tryCatchMethods() {

        int[] arr = { 1, 2, 3 };
        int index = 4;

        /*
        System.out.println("Här har vi en utskrift till konsollen!");
        System.out.println("Heltalet i vår lista på plats " + index + " är " + arr[index]);
        System.out.println("Då var vi klara med detta!");
        */

        try {
            System.out.println("Här har vi en utskrift till konsollen!");
            System.out.println("Heltalet i vår lista på plats " + index + " är " + arr[index]);
            System.out.println("Då var vi klara med detta!");
        } catch (Exception ex) {
            System.out.println("Jag fick ett exception!");
            System.out.println(ex);
            System.out.println(Arrays.toString(ex.getStackTrace()));
        }
        System.out.println("Efter min try-catch");


        System.out.println("Skriv in din ålder!");
        Scanner scanner = new Scanner(System.in);
        int i = -1;
        do {
            try {
                i = scanner.nextInt();
            } catch(Exception e) {
                System.out.println("Det blev fel! Försök igen!");
                String s = scanner.nextLine();
            }
        } while (i<0);
        if(i > 40) {
            System.out.println("Fy vad gammal du är!");
        } else {
            System.out.println("Du är inte torr bakom öronen än!");
        }



    }

    private static void dateAndTimeMethods() {

        LocalDate today = LocalDate.now();
        System.out.println(today);

        int year = today.getYear();
        System.out.println("Year: " + year);
        int month = today.getMonthValue();
        System.out.println("Month: " + month);
        String monthName = today.getMonth().name();
        System.out.println("Month: " + monthName);
        int day = today.getDayOfMonth();
        System.out.println("Day: " + day);
        String weekday = today.getDayOfWeek().toString();
        System.out.println("Day of week: " + weekday);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("uu EEEE");
        System.out.println("Formatter: " + today.format(formatter));

        LocalTime now = LocalTime.now();
        System.out.println("Time: " + now);

        int hour = now.getHour();
        int minute = now.getMinute();
        int seconds = now.getSecond();
        int nano = now.getNano();

        System.out.printf("> %d < > %d < > %d < [%d]\n", hour, minute, seconds, nano);

    }

    private static void arraysMethods() {

        int[] arr = { 3, 2, 1, 1 };

        String aryString = Arrays.toString(arr);
        System.out.println("arr: " + aryString);

        Arrays.sort(arr);
        System.out.println("Sorted arr: " + Arrays.toString(arr));

        int[] aNewArr = { 1, 1, 2, 3};
        System.out.println("New Arr: " + Arrays.toString(aNewArr));

        boolean comparison = arr == aNewArr;
        System.out.println("arr == aNewArr: " + comparison);
        System.out.println("arr: " + arr + " aNewArr: " + aNewArr);

        boolean equals = Arrays.equals(arr, aNewArr);
        System.out.println("Arrays.equals: " + equals);

        int[] anOtherArray = arr.clone();
        System.out.println("arr: " + arr + " anOtherArray: " + anOtherArray);
        equals = Arrays.equals(arr, anOtherArray);
        System.out.println("arr == anOtherArray: " + equals);

    }

    private static void stringMethods() {
        String str = "     Vi är glada javaprogrammerare!     ";
        System.out.printf("Original Str (%d): %s\n", str.length(), str);

        String trimmedStr = str.trim();
        System.out.printf("Trimmed String (%d): %s\n", trimmedStr.length(), trimmedStr);

        char chr = trimmedStr.charAt(6);
        System.out.println("Char at 6: " + chr);

        boolean equal = str.equals(trimmedStr);
        System.out.println("Equals: " + equal);

        boolean contains = str.contains(trimmedStr);
        System.out.println("Contains: " + contains);

    }

}