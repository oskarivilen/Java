
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Tällä luokalla luetaan verkosta CSV-tiedostoa, joka sisältää kaupunkien nimet
 * ja väkiluvun pilkulla eroteltuna: https://git.io/Jv3N3
 * 
 * Tietolähde: Luettelo Suomen kaupungeista, Wikipedia.
 * https://fi.wikipedia.org/wiki/Luettelo_Suomen_kaupungeista. Lisenssi: CC
 * BY–SA 3.0
 */
public class KaupungitVerkosta {

    /*
     * URL-luokka heittää ns. poikkeuksia virhetilanteissa, kuten verkkoyhteyden
     * epäonnistuessa. Tämän vuoksi joudumme määrittelemään main-metodiin lisäksi
     * "throws Exception".
     */
    public static void main(String[] args) throws Exception {
        URL csvTiedosto = new URL("https://git.io/Jv3N3");

        // Luetaan Scannerin avulla netistä ladattua tietovirtaa System.in sijasta:
        Scanner lukija = new Scanner(csvTiedosto.openStream(), "utf-8");

        // Tiedoston ensimmäinen rivi sisältää vain otsikkotiedot. Niitä ei tarvita.
        String ekaRivi = lukija.nextLine();
        List<String> over = new ArrayList<String>();
        // Käydään läpi rivejä, kunnes Scanner kertoo rivien loppuneen:
        while (lukija.hasNextLine()) {
            String rivi = lukija.nextLine();

            // Katkaistaan rivi pilkun kohdalta:
            int loppuindeksi = rivi.indexOf(",");
            String kaupunki = rivi.substring(0, loppuindeksi);
            String vakilukuString = rivi.substring(loppuindeksi + 1);
           
            int vakiluku = Integer.parseInt(vakilukuString);

            if (vakiluku >= 10000) {
                over.add(kaupunki);

            }
            

        }
        Collections.sort(over);
            for (String city : over) {

                System.out.println(city);

            }

        lukija.close(); // sulkee yhteyden
    }
}