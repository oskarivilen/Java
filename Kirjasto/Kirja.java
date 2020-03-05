
public class Kirja {

	private String name;
	private String isbn;
	private double price;
	private int yearOfPublish;

	public Kirja(String name, String isbn, double price, int yearOfPublish) {

		this.name = name;
		this.isbn = isbn;
		this.price = price;
		this.yearOfPublish = yearOfPublish;

	}

	public Kirja() {

	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getIsbn() {
		return this.isbn;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Double getPrice() {
		return this.price;
	}

	public void setYearOfPublish(int yearOfPublish) {
		this.yearOfPublish = yearOfPublish;
	}

	public int getYearOfPublish() {
		return this.yearOfPublish;
	}

	public String toString() {
		System.out.println(System.lineSeparator() + "Kirja [nimi=" + Kirja.this.getName() + ", isbn="
				+ Kirja.this.getIsbn() + ", hinta=" + Kirja.this.getPrice() + ", vuosi=" + Kirja.this.getYearOfPublish()
				+ "]" + System.lineSeparator());
		return null;
	}

}