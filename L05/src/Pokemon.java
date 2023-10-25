import java.util.Random;

public class Pokemon {

    // Egenskaper
    String name;
    int hp;
    int maxHp;
    int minDamage=0, maxDamage=0;
    String type;    // Jord, Vatten, Eld, Gräs

    // Konstruktor
    public Pokemon(String name, int hp, String type, int maxDamage) {
        this.name = name;
        this.hp = this.maxHp = hp;
        this.type = type;
        this.maxDamage = maxDamage;
    }

    // Metoder

    void attack(int damage) {
        hp -= damage;
        if(hp<=0) {
            hp = 0;
            System.out.println("Your Pokémon is out!");
        }
    }

    void attack(Pokemon foe) {
        Random rnd = new Random();
        int attackValue = foe.minDamage + rnd.nextInt(foe.maxDamage - foe.minDamage + 1);
        System.out.printf("%s attacked %s and caused %d in damage\n", foe.name, name, attackValue);
        attack(attackValue);
    }

    void stats() {
        System.out.printf("%s hp (%d): %d\n", name, maxHp, hp);
    }

    void setType(String newType) {
        // Jord, Vatten, Eld, Gräs
        if(newType == "Jord" || newType == "Eld" || newType == "Vatten" || newType == "Gräs") {
            type = newType;
        }
    }

}
