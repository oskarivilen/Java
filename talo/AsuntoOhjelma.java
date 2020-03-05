import java.text.DecimalFormat;
import java.util.Scanner;

public class AsuntoOhjelma {

	public static void main(String[] args) {

		DecimalFormat df = new DecimalFormat("###,###.00");

		Scanner scanner = new Scanner(System.in);
		System.out.print("Anna asunnon tyyppi: ");
		String type = scanner.nextLine();

		System.out.print("Anna osoite: ");
		String address = scanner.nextLine();
		System.out.print("Anna pinta-ala: ");
		double square = scanner.nextDouble();
		System.out.print("Anna hinta: ");
        double price = scanner.nextDouble();
        System.out.print("Anna kuvaus: ");
		String detail = scanner.nextLine();

		Asunto asunto = new Asunto(type,address,square,price,detail);

	

        System.out.println(asunto.toString());

	}

}