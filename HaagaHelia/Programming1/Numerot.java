import java.util.ArrayList;
import java.util.List;

public class Numerot {
    public static void main(String[] args) {
        ArrayList<Integer> arvot = new ArrayList<>();
        
        arvot.add(3);
        arvot.add(2);
        arvot.add(6);
        arvot.add(1);
        System.out.println(pienin(arvot));
        System.out.println(suurin(arvot));
        System.out.println(summa(arvot));

       
        
    }

    public static int pienin(List<Integer> arvot) {
        int pienin = arvot.get(0);
        int indeksi = 0;
        while (indeksi < arvot.size()) {
            int luku = arvot.get(indeksi);
            if (pienin > luku) {
                pienin = luku;
            }
            indeksi = indeksi + 1;
        }
        return pienin;
    }
    

    public static int suurin(List<Integer> arvot) {
        int suurin = arvot.get(0);
        int indeksi = 0;
        while (indeksi < arvot.size()) {
            int luku = arvot.get(indeksi);
            if (suurin < luku) {
                suurin = luku;
            }
            indeksi = indeksi + 1;
        }
        return suurin;
    }
    public static int summa(List<Integer> arvot) {
        int summa = 0;
        for (Integer luku : arvot) {
            summa = summa+ luku;     
        }
        return summa;
    }
    
}