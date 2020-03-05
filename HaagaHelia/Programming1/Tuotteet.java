
import java.text.DecimalFormat;
import java.util.Scanner;

public class Tuotteet {

    public static void main(String[] args) {

        Scanner lukija = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###,###.00");

        System.out.print("Annan tuotenumero: ");
        int numero = Integer.valueOf(lukija.next());
        System.out.print("Anna tuotteen nimi: ");
        String nimi = lukija.next();
        System.out.print("Anna tuotteen hinta: ");
        String hinta = lukija.next();
        System.out.print("Anna tuotteen kuvaus: ");
        String kuvaus = lukija.next();

        kuvaus = kuvaus.trim();
        nimi = nimi.trim();
        nimi = nimi.toUpperCase();

        System.out.println("Numero: " + numero);
        System.out.println("Nimi: " + nimi);
        System.out.println("Hinta: " + hinta);
        System.out.println("Kuvaus: " + kuvaus);

    }
}