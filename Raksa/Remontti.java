import java.time.LocalDate;
import java.util.Scanner;
public class Remontti {
    
    LocalDate date = LocalDate.now();  

    private int vuosi;
    private String kuvaus;

    public Remontti() {
       
    }

	public int getVuosi() {
		return this.vuosi;
	}

	public boolean setVuosi(int vuosi) {

        LocalDate ld = LocalDate.now();
        if(vuosi > ld.getYear()) {
            return false;
        }else {
            this.vuosi = vuosi;
            return true;
            
        }
		
    }
    public String getKuvaus() {
		return this.kuvaus;
	}

	public void setKuvaus(String kuvaus) {
        this.kuvaus = kuvaus;
    }
  
        public String toString() {
            return "Vuonna " + getVuosi() + " tehtiin remontti " + getKuvaus();
        }
    }