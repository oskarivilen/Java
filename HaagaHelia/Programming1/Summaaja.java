
import java.util.InputMismatchException;
import java.util.Scanner;

public class Summaaja {
    public static void main(String[] args) {

        Scanner lukija = new Scanner(System.in);
       
       
        int summa = 0;
        boolean loop = true;
        while(loop) {
            try{
                System.out.print("Syötä seuraava luku (0 lopettaa): ");
                int luku = lukija.nextInt();
                summa = summa + luku;
                if(luku == 0) {
                    System.out.print("Lukujen summa on " + summa + ".");
                    break;
                } 
               
            }catch (InputMismatchException e) {
                System.out.println("Virheellinen luku!");
                lukija.nextLine();
            }

        }
        

    }
}