public class Main {
    public static void main(String[] args) {

        int myVar1 = 99;
        float myVar2 = 3.14f;
        char myVar3 = 'A';
        boolean myVar4 = true;
        String myVar5 = "Hello, World!";

        double y = 1 / 3;
        System.out.println("1 / 3 = " + y);
        double z = 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1;
        System.out.println("10 * 0.1 = " + z);

        String string1 = "2.23";  // till float
        String string2 = "false";  // till boolean
        String string3 = "1337";  // till integer

        float float1 = Float.parseFloat(string1);
        boolean boolean1 = Boolean.parseBoolean(string2);
        int int1 = Integer.parseInt(string3);

        System.out.printf("Convert of values: %f %b %d\n", float1, boolean1, int1);

        if (myVar1 > myVar2) {
            System.out.println("Heja Java");
        }

        if (y > 0.0) {
            System.out.println("Konstigt");
        } else {
            System.out.println("Vilken tur!");
        }

        if(z == 1.0) {
            System.out.println("Vad nu då!?");
        }
    }
}