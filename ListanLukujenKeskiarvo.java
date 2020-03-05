
import java.util.ArrayList;
import java.util.Scanner;

public class ListanLukujenKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        ArrayList<Integer> lista = new ArrayList <>();
        int luku = 0;
        double summa = 0;
        double arvo = 0;
        int mittaus = 1;
        int pienin = 0;
        while (true) {
            System.out.print("Syötä mittaus " + mittaus + "/10: ");
            int luettu = Integer.valueOf(lukija.nextLine());

           
            if(luettu >= 20 || luettu <= -140) {
                System.out.println("Anna lämpötila väliltä -140 - +20!");
                continue;
            }
            else if(mittaus < 10 && luettu <= 20 && luettu >= -140) {
                mittaus++;
               
                summa = summa + luettu;
                luku++;
                if(pienin > luettu) {
                    luettu = pienin;
                }
                
            }
            else if(mittaus >= 9) {
                break;
            }
            lista.add(luettu);
        }
        System.out.println("");
        for (int luettu : lista) {
            
        }
        arvo = summa / luku;
        // keskiarvo kuntoon ja suurin seka pienin
        System.out.println("Keskiarvo: " + arvo);
        System.out.println("pienin : " + pienin);
    }

}
