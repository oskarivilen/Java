import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Scanner;

public class SanojenVaihtaminen {
    public static void main(String[] args) {

        Scanner lukija = new Scanner(System.in);
        System.out.println("Kirjoita lause:");
        String lause = lukija.nextLine();
        String[] sanat = lause.split(" ");

        System.out.println("Mitkä sanat vaihdetaan keskenään?");
        int eka= lukija.nextInt();
        int toka= lukija.nextInt();

        String ekaSana = sanat[eka];
        String tokaSana = sanat[toka];

        sanat[eka] = tokaSana;
        sanat[toka] = ekaSana;

        String tulos = String.join(" ", sanat);
        System.out.println(tulos);

       

        System.out.println();

    }
}