

import java.util.Scanner;
public class PainoSovellus {
    public static void main(String[] args) {
        PainoSovellus lahto = new PainoSovellus();
        lahto.tulostaValikko();
    }
    
	public  void tulostaValikko() {

        Scanner lukija = new Scanner(System.in);
        
        int syote = -1;
        while(syote != 0){
            System.out.println("Valikko");
            System.out.println("0) Lopeta");
            System.out.println("1) Lisää painokirjaus menneelle päivälle");
            System.out.println("2) Tulosta painokuvaaja");
            System.out.println("3) Lisää painokirjaus tälle päivälle");
            System.out.println("Anna valintasi (0, 1, 2 tai 3):");
        syote = lukija.nextInt();
        lukija.nextLine();
         if (syote == 0) {
            System.exit(0);
        }else if (syote == 1) {
       
            System.out.println("Anna paino (muodossa 9.9.2019,85): ");
            String paino = lukija.nextLine();
            TiedostoTyokalut tiedostoTyokalut = new TiedostoTyokalut();
            tiedostoTyokalut.kirjoita(paino, "painotcvs.txt");
        
        }else if(syote == 2) {
            Piirturi.tulostaPainoKuvaaja();
        }else  if (syote == 3) {
            
          
            System.out.println("Anna paino (muodossa 9.9.2019,85): ");
            String paino = lukija.nextLine();
            TiedostoTyokalut tiedostoTyokalut = new TiedostoTyokalut();
            tiedostoTyokalut.kirjoita(paino, "painotcvs.txt");
        }
        }
		
    }
  
    
}