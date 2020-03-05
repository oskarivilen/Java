
import java.text.DecimalFormat;

public class Asunto {

	private String tyyppi;
	private String osoite;
	private double pintaala;
    private double hinta;
    private String kuvaus;

	public Asunto(String tyyppi, String osoite, double pintaala, double hinta, String kuvaus) {

		this.tyyppi = tyyppi;
		this.osoite = osoite;
		this.pintaala = pintaala;
        this.hinta = hinta;
        this.kuvaus = kuvaus;

	}

	public Asunto() {

	}

	public void setTyyppi(String tyyppi) {
		this.tyyppi = tyyppi;
	}

	public String getTyyppi() {
		return this.tyyppi;
	}

	public void setOsoite(String osoite) {
		this.osoite = osoite;
	}

	public String getOsoite() {
		return this.osoite;
	}

	public void setPintaala(double pintaala) {
		this.pintaala = pintaala;
	}

	public Double getPintaala() {
		return this.pintaala;
	}

	public void setHinta(double hinta) {
		this.hinta = hinta;
	}

	public double getHinta() {
		return this.hinta;
    }
    public void setKuvaus(String kuvaus) {
		this.kuvaus = kuvaus;
	}

	public String getKuvaus() {
		return this.kuvaus;
	}

	public String toString() {
		DecimalFormat df = new DecimalFormat("###.00");
		
        return System.lineSeparator() + "Tyyppi: " + this.tyyppi + "\nOsoite: " + this.osoite + "\nPinta-ala: "
        + df.format(this.pintaala) + "\nHinta: " + df.format(this.hinta) + " euroa" + "\nKuvaus: " + this.kuvaus;
}

}