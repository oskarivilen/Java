import java.time.LocalDate;
import java.util.Scanner;
public class PainoMittaus {
    
    LocalDate date = LocalDate.now();  

    private Pvm paivamaara;
    private int paino;

    public PainoMittaus() {
       
    }
    public PainoMittaus(Pvm paivamaara, int paino) {
       this.paivamaara = paivamaara;
       this.paino = paino;
    }

	public int getPaino() {
		return this.paino;
	}

	public void setPaino(int paino) {
        this.paino = paino;
		
    }
    public Pvm getPvm() {
		return this.paivamaara;
	}

	public void setPvm(Pvm paivamaara) {
        this.paivamaara = paivamaara;
    }
  
        
    }