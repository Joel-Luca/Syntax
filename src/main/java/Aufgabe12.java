public class Aufgabe12 {
    public static void main(String[] args) {
        //a)
        int[] zahlen = new int[5];
        zahlen[0] = 0;
        zahlen[1] = 1;
        zahlen[2] = 2;
        zahlen[3] = 3;
        zahlen[4] = 4;
        for (int zahl : zahlen) {
            System.out.println(zahl);
        }

        //b)
        int[] zahlen2 = new int[100];
        for (int i = 0; i < 100; i++) {
            zahlen2[i] = i;
        }
        for(int zahl : zahlen2) {
            System.out.println(zahl);
        }

        //c)
        int summe = 0;
        for(int zahl : zahlen2) {
            summe += zahl;
        }
        System.out.println(summe);

        //d)
        for(int zahl : zahlen2) {
            if(zahl % 2 == 0) {
                zahl++;
            }
            else {
                zahl--;
            }
            System.out.println(zahl);
        }
    }
}
