public class Aufgabe14 {
    public static void main(String[] args) {
        for(int i = 1; i < 6; i++) {
            for(int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for(int x = 0; x < (i * 2 - 1); x++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
