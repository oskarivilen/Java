import java.util.Scanner;

public class AlkuTulostin {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.print("Kirjoita sana: ");
        String sana = lukija.nextLine();
        String osa = "";
        int pituus = sana.length();
        for (int i = 0; i < pituus; ++i) {
          char kirjain = sana.charAt(i);
          osa = osa + kirjain;

            System.out.println(osa);
        }
    }
}
