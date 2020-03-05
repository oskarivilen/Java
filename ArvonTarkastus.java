
import java.util.InputMismatchException;
import java.util.Scanner;

public class ArvonTarkastus {
    public static void main(String[] args) {

        Scanner lukija = new Scanner(System.in);
        
        
                System.out.print("Syötä luku väliltä 0-23: ");
                int luku = lukija.nextInt();
               
               
            if( luku < 0 || luku > 23) {
                throw new IllegalArgumentException("Virheellinen luku!");
               
            }else {
                System.out.print("Luku " + luku + " on sallittu");
            }
            
                
            }

        
       
    }
