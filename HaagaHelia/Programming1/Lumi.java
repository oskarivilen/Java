
import java.util.Scanner;

public class Lumi {

    public static void main(String[] args) {

        Scanner lukija = new Scanner(System.in);

        int lumipankki = 0;
        int kaikki = 0;
        while (true) {

            System.out.print("Anna nimi: ");
            String nimi = lukija.next();

            if (nimi.equalsIgnoreCase("Lumi")) {
                lumipankki++;
                kaikki++;
            } else if (!nimi.contains("LOPPU")) {
                kaikki++;
            }

            if (nimi.contains("LOPPU")) {

                System.out.println("Nimi oli" + kaikki + " kappaletta.");
                System.out.println("Nimi Lumi esiintyi " + lumipankki + " kertaa.");
                break;
            }
        }

    }
}