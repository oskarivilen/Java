import java.util.Scanner;
public class RemonttiOhjelma {

	public static void main(String[] args) {

		
        Remontti remontti = new Remontti();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Anna vuosi: ");
        int year = scanner.nextInt();
        
        remontti.setVuosi(year);
        

        if(remontti.setVuosi(year) == true) {
            scanner.nextLine();
            System.out.print("Anna kuvaus: ");
            String desc = scanner.nextLine();
            remontti.setKuvaus(desc);
            System.out.println(remontti.toString());
        }else {
            System.out.println("Vuosi ei voi olla tulevaisuudessa");
        }
       

	}

}