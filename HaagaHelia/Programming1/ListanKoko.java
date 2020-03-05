
import java.util.ArrayList;
import java.util.Scanner;

public class ListanKoko {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Syötä sanoja listalle. Tyhjä tai yhdysviiva (-) lopettaa:");
        int maara = 0;
        ArrayList<String> lista = new ArrayList<>();
        while (true) {
            String luettu = lukija.nextLine();
            if (luettu.equals("-")) {
                break;
            }
            lista.add(luettu);
            maara++;
        }
        System.out.println("Yhteensä: " + maara);
    }
}
