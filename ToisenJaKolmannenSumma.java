
import java.util.ArrayList;
import java.util.Scanner;

public class ToisenJaKolmannenSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);


        System.out.print("Syötä kokonaislukuja listalle (0 lopettaa):");
        ArrayList<Integer> luvut = new ArrayList<>();
        while (true) {
            int luku = Integer.valueOf(lukija.nextLine());
            if (luku == 0) {
                break;
            }
            
            luvut.add(luku);
            
        }

        System.out.println(luvut.get(2) + luvut.get(1));
        
    }
}
