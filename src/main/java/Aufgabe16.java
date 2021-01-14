import javax.swing.*;

public class Aufgabe16 {

    static boolean erraten = true;
    static boolean twoplayer = false;

    static int versuch;

    static String player1;
    static String player2;

    static int randzahl;

    public static void main(String[] args) {

        randzahl = start();

        while(erraten) {
            ErrateZahl(randzahl, player1);

            if(twoplayer) {
                ErrateZahl(randzahl, player2);
            }
        }
    }

    public static void ErrateZahl(int zahl, String player) {
        int eingabe = Integer.parseInt(JOptionPane.showInputDialog(player + " errate die Zahl"));
        if(eingabe > zahl) {
            System.out.println("Leider falsch, die gesuchte Zahl ist kleiner");
            versuch++;
        }
        else if(eingabe < zahl) {
            System.out.println("Leider falsch, die gesuchte Zahl ist grösser");
            versuch++;
        }
        else {
            if(twoplayer) {
                System.out.println(player + " hat die Zahl erraten!");
            }
            else {
                System.out.println(player + " hat die Zahl mit " + versuch + " Versuchen erraten!");
            }


            String frage = JOptionPane.showInputDialog("Nochmal spielen?");
            if(frage.equals("ja")) {
                randzahl = start();
            }
            else {
                erraten = false;
            }
        }
    }

    public static int start() {
        versuch = 0;
        int randz;

        player1 = JOptionPane.showInputDialog("Player1 Name:");
        String frage = JOptionPane.showInputDialog("Spielst du mit jemand anderes?");
        if (frage.equals("ja")) {
            player2 = JOptionPane.showInputDialog("Player2 Name:");
            twoplayer = true;
        }

        int max = Integer.parseInt(JOptionPane.showInputDialog("Wähle wie gross die grösste Zahl sein kann"));
        randz = (int) (Math.random() * max);
        return randz;
    }
}
