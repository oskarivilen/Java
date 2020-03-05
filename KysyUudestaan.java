
import java.util.InputMismatchException;
import java.util.Scanner;

public class KysyUudestaan {
    public static void main(String[] args) {

        Scanner lukija = new Scanner(System.in);
        
        boolean ok = false;

        while(ok == false) {
            try{
                System.out.print("Syötä kokonaisluku:");
                int luku = lukija.nextInt();
                System.out.print("Syötit luvun " + luku + ".");
                ok = true;
            }catch (InputMismatchException e) {
                System.out.println("Virheellinen luku!");
                lukija.nextLine();
            }

        }
        lukija.close();
    }
}