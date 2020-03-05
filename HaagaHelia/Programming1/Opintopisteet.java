import java.text.DecimalFormat;
import java.util.Scanner;

public class Opintopisteet {

    public static void main(String[] args) {

        Scanner lukija = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###,###.00");

        int kierto = 1;
        int op = 0;
        int vahintaan = 0;

        System.out.print("Anna lukukausien määrä: ");

        int kausi = Integer.valueOf(lukija.next());
        System.out.println("");
        vahintaan = 30 * kausi;
        while (kausi >= kierto) {
            System.out.print("Anna " + kierto + ". lukukauden opintopisteesi: ");
            int kysely = Integer.valueOf(lukija.next());
            op = op + kysely;

            kierto++;

            if (kausi == 0) {
                break;
            }

        }
        System.out.println("");
        System.out.println("Sinulla pitäisi olla tähän mennessä " + vahintaan + " opintopistettä.");
        System.out.println("Sinulla on " + op + " opintopistettä.");
        if (op < vahintaan) {
            System.out.println("Olet jäljessä tavoitteesta.");
        } else if (op == vahintaan) {
            System.out.println("Olet tavoitteessa.");
        } else if (op > vahintaan) {
            System.out.println("Olet edellä tavoitteesta.");
        }
        int puuttuu = 210 - op;
        System.out.println("Tutkinnosta puuttuu vielä " + puuttuu + " opintopistettä.");
    }
}