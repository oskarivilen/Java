import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TiedostoTyokalut {
    public void kirjoita(String teksti, String tiedosto) {
        try {
            PrintWriter luoja = new PrintWriter(new FileWriter(
                new File(tiedosto), true), true);
                luoja.println(teksti);
                luoja.close();
        }catch (IOException ex) {
            System.out.println("Tiedostoa luodessa virhe");
        }
    }
    public PainoMittaus[] lue() {
        PainoMittaus[] painot = new PainoMittaus[400];

        try {
            Scanner lukija = new Scanner(new File("painotcvs.txt"));
            int laskuri = 0;

            while(lukija.hasNext()) {
                String rivi = lukija.nextLine();
                PainoMittaus mittaus = new PainoMittaus();
                String[] arvot = new String[2];
                arvot = rivi.split(",");
                mittaus.setPvm(new Pvm(arvot[0]));
                mittaus.setPaino(Integer.parseInt(arvot[1]));
                painot[laskuri] = mittaus;
                laskuri++;
            }
        }catch (FileNotFoundException e) {
            System.out.println("Ei tiedostoa");
        }
        return painot;
    }
}