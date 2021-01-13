import javax.swing.*;

public class Aufgabe6 {
    public static void main(String[] args) {
        boolean ueberpruefung = true;

        while(ueberpruefung) {
            String name = JOptionPane.showInputDialog(null, "Bitte Namen eingeben");

            if(name.equals("Joel")) {
                System.out.println("Das bin ich!");
                ueberpruefung = false;
            }
            else {
                System.out.println("Das bin ich nicht!");
            }
        }
    }
}
