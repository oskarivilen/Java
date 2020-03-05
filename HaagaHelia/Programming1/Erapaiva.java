import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Erapaiva {
    public static void main(String[] args) {

        Scanner lukija = new Scanner(System.in);
        DateTimeFormatter formaatti = DateTimeFormatter.ofPattern("yyyy-mm-dd");

        System.out.print("Anna laskun päivämäärä (vvvv-kk-pp) :");

        String paiva = lukija.nextLine();

        LocalDate date = LocalDate.parse(paiva);

        LocalDate era = date.plusDays(14);

        System.out.println("Eräpäivä on " + era);

    }
}