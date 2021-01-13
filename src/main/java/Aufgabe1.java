public class Aufgabe1 {
    public static void main(String[] args) {

        int a = -1;
		double b = 10.0;
		// Dies ist ein Kommentar
        double resultat = a + b;
        String text = "Das Resultat ist: " + a + " + " + b + " = " + resultat;

        if (resultat < 10.0) {
            System.out.println("Gratulation!");
        }
        else {
            System.out.println(text);
		}
    }
}

