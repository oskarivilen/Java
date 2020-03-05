package autot;
/**
 * Tallenna tämä luokka itsellesi Auto.java-nimiseen tiedostoon.
 */
public class Auto {

    /*
     * Nämä muuttujat ovat jokaiselle autolle yksilölliset ja ne säilyvät koko olion
     * olemassaolon ajan.
     */
    private String merkki;
    private int kilometrit;

    /**
     * Tällä konstruktorilla alustetaan olion muuttujiin new-luontikäskyssä annetut
     * arvot.
     * 
     * 
     */
    public Auto(String merkki) {
        this.merkki = merkki;
        this.kilometrit = 0;
    }

    /**
     * Tällä julkisella metodilla tarjotaan ulkopuolisille luokille mahdollisuus
     * muuttaa auton matkamittaria.
     * 
     * Kasvatettava kilometrimäärä kokonaislukuna
     */
    public void aja(int kilometrit) {
        this.kilometrit += kilometrit;
    }

    /**
     * toString-metodin avulla olioista voidaan muodostaa automaattisesti loogisia
     * merkkijonoesityksiä.
     */
    @Override
    public String toString() {
        return this.merkki + ", " + this.kilometrit + " km.";
    }
}