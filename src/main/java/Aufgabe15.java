import java.util.Arrays;
import java.util.Random;

public class Aufgabe15 {

    static Random rand = new Random();

    public static void main(String[] args) {

        int anzahl = 10;
        int bound = 100;

        int[] zahlen = new int[anzahl];

        for(int i = 0; i < zahlen.length; i++) {
            zahlen[i] = rand.nextInt(bound);
        }

        int max = 0;
        int min = bound;
        int summe = 0;
        int anzahlgeraderzahlen = 0;
        for(int zahl : zahlen) {
            System.out.println(zahl);

            if(zahl > max) {
                max = zahl;
            }

            if(zahl < min) {
                min = zahl;
            }

            summe += zahl;

            if(zahl % 2 == 0) {
                anzahlgeraderzahlen++;
            }
        }

        System.out.println("Die grösste Zahl ist: " + max);
        System.out.println("Die kleinste Zahl ist " + min);
        System.out.println("Die Summe aller Zahlen ist " + summe);
        System.out.println("Der Durchschnitt ist " + (summe / anzahl));

        int counter = 0;
        int[] geradezahlen = new int[anzahlgeraderzahlen];
        for(int zahl : zahlen) {
            if(zahl % 2 == 0) {
                geradezahlen[counter] = zahl;
                counter++;
            }
        }

        for(int zahl : geradezahlen) {
            System.out.println(zahl);
        }
    }
}
