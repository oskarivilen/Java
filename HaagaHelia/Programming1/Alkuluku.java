import java.util.Scanner;

public class Alkuluku {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.print("Syötä jokin positiivinen kokonaisluku: ");

        int luku = Integer.valueOf(lukija.next());
        if (luku <= 1)
        {
            System.out.print("Luku " + luku + " ei ole alkuluku.");
        }
        if (luku == 2) {
            System.out.print("Luku " + luku + " on alkuluku.");
        } else {
            int t = 2;
            while (((luku % t) != 0) && (t <= luku / 2)) {
                t++;
            }
            if (luku % t == 0) {
                System.out.print("Luku " + luku + " ei ole alkuluku.");
            } else {
                System.out.print("Luku " + luku + " on alkuluku.");
            }
        }
    }
}