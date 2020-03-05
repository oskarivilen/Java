import java.text.DecimalFormat;
import java.util.Scanner;

public class Kotitalousvahennys {

    public static void main(String[] args) {

        Scanner lukija = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.00");

        double tyokorvaus = 0;
        double omavastuu = 0;
        while (true) {
            System.out.print("Anna työkorvauksen määrä (0 lopettaa): ");
            double luku = lukija.nextDouble();

            if (luku != 0 && luku < 4800) {

                tyokorvaus = tyokorvaus + luku;
                omavastuu = omavastuu + 100;
            }
            if (luku == 0) {

                break;
            }

        }
        double vahennys = tyokorvaus * 50 / 100.0 - omavastuu;
        vahennys = vahennys - omavastuu;
        if(vahennys < 0) {
            vahennys = 0;
        }

        System.out.println("");
        System.out.println("");
        System.out.println("Kotitalousvähennyksen määrä on " + df.format(vahennys) + " euroa");
    }
}