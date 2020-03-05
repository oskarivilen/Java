
import java.util.Calendar;
import java.util.Scanner;

public class Pvm {
    
    private int paiva;
    private int kuukausi;
    private int vuosi;

    public Pvm() {
        Calendar nyt = Calendar.getInstance();
       this.paiva = nyt.get(Calendar.DAY_OF_MONTH);
       this.kuukausi = nyt.get(Calendar.MONTH) + 1;
       this.vuosi = nyt.get(Calendar.YEAR);
    }

	public Pvm(String pvm) {
        String rivi = pvm;
        String[] pvmKirjaus = new String[3];
        pvmKirjaus = rivi.split("\\.");
        this.paiva = Integer.parseInt(pvmKirjaus[0]);
        this.kuukausi = Integer.parseInt(pvmKirjaus[1]);
        this.vuosi = Integer.parseInt(pvmKirjaus[2]);
	}

	public int getPaiva() {
        return this.paiva;
		
    }
    public int getKuukausi() {
        return this.kuukausi;
		
    }
    public int getVuosi() {
        return this.vuosi;
		
    }
    public void setPaiva(int paiva) {
       this.paiva = paiva;
		
    }
    public void setKuukausi(int kuukausi) {
        this.kuukausi = kuukausi;
		
    }
    public void setVuosi(int vuosi) {
        this.vuosi = vuosi;
		
    }
  
        public String toString() {
           String palautus = paiva + "." + kuukausi + "." + vuosi;
           return palautus;
        }
    }