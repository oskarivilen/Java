import java.util.Scanner;

public class Lento {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.print("Anna lennon numero: ");
        String sana = lukija.nextLine();

        if(sana.contains("AY")) {
            String lennonnumero = sana.substring(2);  
            if(lennonnumero.startsWith("1")) {
                System.out.println("Kaukolento");  
            }else if(lennonnumero.startsWith("2")) {
                System.out.println("Kotimaan lento");
            }else if(lennonnumero.startsWith("3")) {
                System.out.println("Kotimaan lento");
            }else if(lennonnumero.startsWith("4")) {
                System.out.println("Kotimaan lento");
            }else if(lennonnumero.startsWith("5")) {
                System.out.println("Kotimaan lento");
            }else if(lennonnumero.startsWith("6")) {
                System.out.println("Kotimaan lento");  
            }else if(lennonnumero.startsWith("7")) {
                System.out.println("Venäjän lento");  
            }
        }if(!sana.contains("AY")) {
            System.out.println("Ei ole Finnairin lento"); 
        }
 
    } 
}