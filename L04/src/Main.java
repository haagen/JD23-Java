import java.util.*; // Importera allt i paketet

public class Main {
    public static void main(String[] args) {

        //javaArray();
        //javaArrayList();
        //javaLinkedList();
        //javaHashSet();
        //javaHashMap();
        javaIterators();

    }

    public static void javaArray() {

        /*
            En array en lista bestående av lika datatyper.

            De definieras med att lägga [] efter datatypens namn.

            Man kan initiera den genom att skriva värdena komma-
            separerat ino {}-parenteser.

         */

        int[] lottoRad = { 2, 7, 9, 12, 23, 30, 31 };

        boolean giltigLottoRad = true;
        for(int i=0; i<lottoRad.length; i++) {
            if(lottoRad[i] < 0 || lottoRad[i] > 31) {
                giltigLottoRad = false;
                break;  // När vi hittar ett ogiltigt tal vet vi att hela raden är ogiltig. Vi behöver därför inte fortsätta att loopa.
            }
        }

        if(giltigLottoRad){
            System.out.println("Lottoraden är giltig!");
        } else {
            System.out.println("Lottoraden är inte giltig!");
        }

        // Hur lägger man då till element i listan? Eller
        // tar bort ett element?

        // Man måste skapa en ny lista. Vi lägger till en extra
        // plats i vår array.
        int[] newArray = new int[lottoRad.length + 1 ];
        for(int i=0; i< lottoRad.length; i++) {
            newArray[i] = lottoRad[i];
        }
        newArray[ lottoRad.length ] = 5;
        lottoRad = newArray;
    }

    public static void javaArrayList() {

        // Skapa en ny tom lista
        ArrayList<String> bilar = new ArrayList<String>();

        bilar.add("Suzuki");        // Element 0
        bilar.add("Volvo");         // Element 1
        bilar.add("Land Rover");    // Element 2
        bilar.add("Lada");          // Element 3

        // Skriva ut lista till skärmen
        System.out.println(bilar);

        // Skriv ett specifikt element .get(<number>)
        System.out.printf("Det bästa bilmärket är så klart %s\n", bilar.get(0));

        // Ändrar ett specifikt värde med .set(<number>, <new value>)
        bilar.set(3, "Fiat");
        System.out.println(bilar);

        // Ta bort ett specifikt element med .remove(<number>)
        bilar.remove(3);
        System.out.println(bilar);

        System.out.println("For-loop: ");
        for(int i=bilar.size()-1; i>=0; i--) {
            System.out.println(bilar.get(i));
        }

        System.out.println("En annan for-loop: ");
        for(String bil : bilar) {
            System.out.println(bil);
        }

        // Vi kan tömma listan med .clear();
        bilar.clear();
        System.out.println("Nu innehåller listan: " + bilar);
    }

    public static void javaLinkedList() {
        // Skapa en ny tom lista
        LinkedList<String> top10MetalBands = new LinkedList<String>();
        top10MetalBands.add("Metallica");
        top10MetalBands.addLast("Iron Maiden");
        top10MetalBands.addFirst("Rammstein");
        System.out.println(top10MetalBands);

        System.out.printf(
                "Det mest omtyckta metall bandet i JD23 är %s och det minst omtyckta är %s\n",
                top10MetalBands.getFirst(),
                top10MetalBands.getLast()
        );
    }

    public static void javaHashSet() {

        // Ett nytt tomt Set
        HashSet<String> bilar = new HashSet<String>();
        bilar.add("Suzuki");
        bilar.add("Volvo");
        bilar.add("Land Rover");
        bilar.add("Lada");
        bilar.add("Suzuki");
        System.out.println("Bilar " + bilar);

        if(bilar.contains("Lada")) {
            System.out.println("Du äger redan en Lada! Köp inte fler!");
        } else {
            System.out.println("Du äger inte en Lada!");
        }

        System.out.printf("Du äger just nu %d bilmärken\n", bilar.size());

        for (String bil : bilar) {
            if(bil.length() >= 5) {
                System.out.printf("%s har %d tecken\n", bil, bil.length());
            }
        }

    }

    public static void javaHashMap() {

        // Skapa en ny tom Map
        HashMap<String, String> capitalCities = new HashMap<String, String>();
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("Denmark", "Copenhagen");
        capitalCities.put("Sweden", "Stockholm");
        System.out.println(capitalCities);

        System.out.printf("Danmarks huvudstad heter %s\n", capitalCities.get("Denmark"));

        // Skapa en Map som innehåller bilmärken och listor med
        // modeller för de bilmärkena

        HashMap<String, ArrayList<String>> cars = new HashMap<String, ArrayList<String>>();

        ArrayList<String> models = new ArrayList<String>();
        models.add("Samurai");
        models.add("Gand Vitara");
        cars.put("Suzuki", models);

        models = new ArrayList<String>();
        models.add("XC60");
        models.add("240");
        models.add("160");
        cars.put("Volvo", models);
        models = null;
        System.out.println(cars);

        System.out.printf("Suzuki modeller: %s\n", cars.get("Suzuki"));
        System.out.printf("Alla mina bilmärken: %s\n", cars.keySet());
        System.out.printf("Alla min bilmodeller: %s\n", cars.values());

    }

    public static void javaIterators() {

        // Tom lista
        ArrayList<String> pokemonCards = new ArrayList<String>();
        pokemonCards.add("Snorlax");
        pokemonCards.add("Balbasaur");
        pokemonCards.add("Magikarp");

        Iterator<String> itr = pokemonCards.iterator();
        while(itr.hasNext()) {
            String card = itr.next();
            System.out.println("Next card was: " + card);
            if(card.equals("Balbasaur")) {
                itr.remove();
            }
        }
        System.out.println("Hela listan efter iterator-loopen: " + pokemonCards);

    }

}