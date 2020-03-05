import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lotto {
    public static void main(String[] args) {

        Scanner lukija = new Scanner(System.in);

        System.out.print("Anna oikea rivi (7 numeroa + lisänumero): ");
        List<Integer> ekalista = new ArrayList<>();
        int o1= lukija.nextInt();
        int o2= lukija.nextInt();
        int o3= lukija.nextInt();
        int o4= lukija.nextInt();
        int o5= lukija.nextInt();
        int o6= lukija.nextInt();
        int o7= lukija.nextInt();
        int oplus= lukija.nextInt();
        
        ekalista.add(o1);
        ekalista.add(o2);
        ekalista.add(o3);
        ekalista.add(o4);
        ekalista.add(o5);
        ekalista.add(o6);
        ekalista.add(o7);
        ekalista.add(oplus);

        System.out.print("Anna tarkastettava rivi (7 numeroa): ");
        List<Integer> tokalista = new ArrayList<>();
        int t1= lukija.nextInt();
        int t2= lukija.nextInt();
        int t3= lukija.nextInt();
        int t4= lukija.nextInt();
        int t5= lukija.nextInt();
        int t6= lukija.nextInt();
        int t7= lukija.nextInt();

        tokalista.add(t1);
        tokalista.add(t2);
        tokalista.add(t3);
        tokalista.add(t4);
        tokalista.add(t5);
        tokalista.add(t6);
        tokalista.add(t7);

        System.out.println("Lista A: " + ekalista);
        System.out.println("Lista B: " + tokalista);

     
        if(tokalista.contains(oplus)) {
            System.out.println(laskeLeikkaus(ekalista, tokalista) + " oikein ja lisänumero.");
        }else {
            System.out.println(laskeLeikkaus(ekalista, tokalista) + " oikein.");
        }

    }

    static int laskeLeikkaus(List<Integer> ekalista, List<Integer> tokalista) {
        List<Integer> kolmaslista = new ArrayList<>();
        int oikein = 0;
        for (Integer num : tokalista) {
            if (ekalista.contains(num)) {
                oikein++;
            }

        }
       oikein = oikein - 1;
        return oikein;
    }
}
