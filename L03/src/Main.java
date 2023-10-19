public class Main {
    public static void main(String[] args) {

        /*
            for(
                init - körs en gång, innan loopen startar
                condition - kontrolleras när loopen skall starta - om sant, startas loopen
                step - anropas när loopen har kört klart
            )
         */

        /*
        final int START = 0;
        final int MAX = 100;
        System.out.println("Detta är en for-loop 1");

        for (int i=0; i <= 5; i++) {
            System.out.println(i);
        }

        System.out.println("Detta är en for-loop 2");
        // Räknar 0 - 100 men bra vartannat nummer tal
        for(int counter=START; counter <= MAX; counter += 2) {
            System.out.println(counter);
        }
        */

        /*
            while(
                condition - starta om loopen så länge detta är sant
            )
         */

        int counter = 0;
        /*
        while(counter) {
            System.out.println("While loop: " + counter);
            counter = counter + 1;
        }
        */
        /*
                do {
                } while (
                    condition - starta om loopen om sant
                )
         */
        counter = 0;
        long timestamp = System.currentTimeMillis();
        do {
            counter++;
            if(counter % 1000000 == 0) {
                System.out.println(counter);
                break;
            }
        } while(counter < 2000000000);
        long timePassed = System.currentTimeMillis() - timestamp;
        System.out.printf("Arbetet tog %d ms\n", timePassed);

        //System.out.println("\033[H\033[2J");

        System.out.println("Det största talet är: " + maxNumber(7, 4));
        System.out.println("Omkretsen är " + circumferenceCircle(56.2));

    }

    private static int maxNumber(int tal1, int tal2) {
        if(tal1 > tal2) {
            return tal1;
        }
        return tal2;
    }

    private static double circumferenceCircle(double radius) {
        return 2*3.14*radius;
    }

}