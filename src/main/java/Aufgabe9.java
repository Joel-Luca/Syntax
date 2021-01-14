import javax.swing.*;

public class Aufgabe9 {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog(null, "Bitte gib deinen Namen ein");
        double gewicht = Double.parseDouble(JOptionPane.showInputDialog(null, "Bitte gib dein Gewicht ein(kg)"));
        double groesse = Double.parseDouble(JOptionPane.showInputDialog(null, "Bitte gib deine Körpergrösse ein(m)"));
        String bmi = Double.toString(gewicht / groesse);
        System.out.println(name + ", dein BMI ist " + bmi);
    }
}
