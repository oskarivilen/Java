import java.text.DecimalFormat;
import java.util.Scanner;

public class KirjaOhjelma {

	public static void main(String[] args) {

		DecimalFormat df = new DecimalFormat("###,###.00");

		Scanner scanner = new Scanner(System.in);
		System.out.print("Anna nimi: ");
		String name = scanner.nextLine();

		System.out.print("Anna isbn: ");
		String isbn = scanner.nextLine();
		System.out.print("Anna hinta: ");
		double price = scanner.nextDouble();
		System.out.print("Anna julkaisuvuosi: ");
		int yearOfPublish = scanner.nextInt();

		Kirja kirja = new Kirja(name, isbn, price, yearOfPublish);

		kirja.toString();

		Kirja kirja2 = new Kirja();

		kirja2.setName(name);
		kirja2.setIsbn(isbn);
		kirja2.setPrice(price);
		kirja2.setYearOfPublish(yearOfPublish);

		System.out.println("Nimi: " + kirja2.getName() + "\nIsbn: " + kirja2.getIsbn() + "\nHinta: "
				+ df.format(kirja2.getPrice()) + "\nJulkaisuvuosi: " + kirja2.getYearOfPublish());

	}

}