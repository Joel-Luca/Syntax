public class Aufgabe4 {
    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++) {
            String reihe = Integer.toString(i);
            System.out.print("\n" + reihe + "-er Reihe:");
            for(int j = 1; j <= 10; j++) {
                String resultat = Integer.toString(j * i);
                System.out.print(" " + resultat);
            }
        }
    }
}
