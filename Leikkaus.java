import java.util.ArrayList;
import java.util.List;

public class Leikkaus {
    public static void main(String[] args) {

        List<Integer> ekalista = new ArrayList<>();
        ekalista.add(3);
        ekalista.add(2);
        ekalista.add(6);
        ekalista.add(-1);
        ekalista.add(5);
        ekalista.add(1);

        List<Integer> tokalista = new ArrayList<>();
        tokalista.add(3);
        tokalista.add(2);
        tokalista.add(9);
        tokalista.add(-1);
        tokalista.add(7);
        tokalista.add(8);
        System.out.println("Lista A: " + ekalista);
        System.out.println("Lista B: " + tokalista);

        System.out.println("Listojen A ja B leikkaus: " + laskeLeikkaus(ekalista, tokalista));

    }

    static List laskeLeikkaus(List<Integer> ekalista, List<Integer> tokalista) {
        List<Integer> kolmaslista = new ArrayList<>();

        for (Integer num : tokalista) {
            if (ekalista.contains(num)) {
                kolmaslista.add(num);
            }

        }
        
        return kolmaslista;
    }
}
