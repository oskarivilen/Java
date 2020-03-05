import java.util.Scanner;

public class RekisterinumeronTarkastus {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        while (true) {
            System.out.print("Syötä rekisterinumero (q-kirjain lopettaa): ");
            String sana = lukija.nextLine();
            sana = sana.toLowerCase();
            if (sana.contains("q")) {
                break;

            }
            if (sana.matches("[a-zåäö]{2,3}-[0-9]{1,}")) {

                System.out.println(sana.toUpperCase() + " on kelvollinen rekisterinumero.");
            }
            if (!sana.matches("[a-zåäö]{2,3}-[0-9]{1,}")) {
                System.out.println(sana.toUpperCase() + " ei ole kelvollinen rekisterinumero.");
            }
        }
    }
}