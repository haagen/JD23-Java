import java.util.*;

public class Main {
    public static void main(String[] args) {
        //ex1_javaArrays();
        //ex2_javaArrayList();
        ex3_javaHashMap();
    }

    private static void ex1_javaArrays() {
        Scanner scanner = new Scanner(System.in);
        int[] userInts = new int[7];
        for(int i=0; i<userInts.length; i++) {
            System.out.printf("Mata in tal %d: ", i+1);
            userInts[i] = scanner.nextInt();
        }

        int total=0;
        for(int i: userInts) {
            total += i;
        }
        double average = (double) total / (double) userInts.length;
        System.out.printf("Medeltalet blir: %.2f\n", average);
    }

    private static void ex2_javaArrayList() {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> myNumbers = new ArrayList<Double>();

        do {
            System.out.print("Mata in flyttal: ");
            double d = scanner.nextFloat();
            if (d >= 0.0 && d <= 100.0) {
                myNumbers.add(d);
            }
        } while(myNumbers.size() < 7);

        double searchNo = Double.MAX_VALUE;
        int indx = -1;

        // Find the smallest number
        for (int i=0; i<myNumbers.size(); i++) {
            if(searchNo > myNumbers.get(i)) {
                searchNo = myNumbers.get(i);
                indx = i;
            }
        }
        System.out.printf("Minsta talet i listan var %.2f. Det raderas.\n", searchNo);
        myNumbers.remove(indx);

        indx = -1;
        searchNo = Double.MIN_VALUE;
        for(int i=0; i<myNumbers.size(); i++) {
            if(searchNo < myNumbers.get(i)) {
                searchNo = myNumbers.get(i);
                indx = i;
            }
        }
        System.out.printf("Största talet i listan var %.2f. Det raderas.\n", searchNo);
        myNumbers.remove(indx);

        double total = 0;
        for(Double d: myNumbers) {
            total += d;
        }
        double average = total / myNumbers.size();
        System.out.printf("Medeltalet blir då %.2f\n", average);
    }

    private static void ex3_javaHashMap() {

        Scanner scanner = new Scanner(System.in);
        HashMap<String, Double> exchange = new HashMap<String, Double>();
        exchange.put("SEK", 1.00);
        exchange.put("USD", 0.091);
        exchange.put("JPY", 13.6365);
        exchange.put("BIF", 256.885);

        double saldo = 2312.23;

        System.out.print("Du kan visa ditt saldo i följande valutor ");
        for(String currencySymbol: exchange.keySet()) {
            System.out.print(currencySymbol+ " ");
        }
        System.out.println();

        boolean validCurrency = false;
        String request;
        do {
            System.out.print("Ange valuta: ");
            request = scanner.nextLine();
            if(exchange.containsKey(request)) {
                validCurrency = true;
            } else {
                System.out.println("Ogiltig valuta.");
            }
        } while(!validCurrency);

        System.out.printf("Ditt saldo i %s blir %.2f\n", request, exchange.get(request)*saldo);

    }

}