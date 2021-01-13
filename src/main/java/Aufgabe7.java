public class Aufgabe7 {
    public static void main(String[] args) {
        for(int i = 1; i <= 25; i++) {
            String zahl = Integer.toString(i);
            String resultat = Double.toString(Math.pow(i, 2));
            System.out.println(zahl + "^2 = " + resultat);
        }
    }
}
