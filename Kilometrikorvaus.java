import java.text.DecimalFormat;
import java.util.Scanner;

public class Kilometrikorvaus {

    public static void main(String[] args) {

        Scanner lukija = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###,###.00");

        int kilometrit = 0;
        while (true) {
            System.out.print("Anna ajetut kilometrit (0 lopettaa): ");
            int luku = Integer.valueOf(lukija.next());

            if (luku != 0) {

                kilometrit = kilometrit + luku;

            }
            if (luku == 0) {

                break;
            }

        }
        double korvaus = kilometrit * 0.43;
        System.out.println("");
        System.out.println("");
        System.out.println("Yhteensä " + kilometrit + " kilometriä");
        System.out.println("Korvaus on " + df.format(korvaus) + " euroa");
    }
}