import javax.swing.*;

public class Aufgabe10 {
    public static void main(String[] args) {
        double zahl1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Bitte gib eine Zahl ein"));
        double zahl2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Bitte gib eine zweite Zahl ein"));
        String operator = JOptionPane.showInputDialog(null, "Bitte gib einen Operator ein");

        switch (operator) {
            case("+"):
                String res1 = Double.toString(zahl1 + zahl2);
                System.out.println(zahl1 + " + " + zahl2 + " ergibt " + res1);
                break;
            case("-"):
                String res2 = Double.toString(zahl1 - zahl2);
                System.out.println(zahl1 + " - " + zahl2 + " ergibt " + res2);
                break;
            case("*"):
                String res3 = Double.toString(zahl1 * zahl2);
                System.out.println(zahl1 + " * " + zahl2 + " ergibt " + res3);
                break;
            case("/"):
                String res4 = Double.toString(zahl1 / zahl2);
                System.out.println(zahl1 + " / " + zahl2 + " ergibt " + res4);
                break;
            default:
                System.out.println("Da ist etwas schief gelaufen :(");
        }
    }
}
