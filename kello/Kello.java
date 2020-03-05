import java.text.DecimalFormat;
public class Kello {

    private int tunnit;
    private int minuutit;
    
    
    public Kello(int tunnit, int minuutit) {
        if(tunnit > 23 || tunnit < 0 || minuutit < 0 || minuutit > 59) {
            throw new IllegalArgumentException("Virheellinen kellonaika");
        }
        
        this.tunnit = tunnit;
        this.minuutit = minuutit;
    }
     
    public void setMinuutit(int minuutit) {
        if(minuutit < 0 || minuutit > 59) {
            throw new IllegalArgumentException("Virheellinen kellonaika");
        }
        
		this.minuutit = minuutit;
	}

	public int getMinuutit() {
		return this.minuutit;
    }
    public void setTunnit(int tunnit) {
        if(tunnit > 23 || tunnit < 0) {
            throw new IllegalArgumentException("Virheellinen kellonaika");
        }
        
		this.tunnit = tunnit;
	}

	public int getTunnit() {
		return this.tunnit;
    }
    
    public void lisaaMinuutit(int mins) {
        if(mins < 0 ) {
            throw new IllegalArgumentException("Virheellinen kellonaika");
        }
        
       this.minuutit =  this.minuutit + mins;
       
        if (this.minuutit > 59) {
            this.tunnit = this.tunnit + 1;
            this.minuutit = this.minuutit - 60;

            if (this.tunnit > 23) {
                this.tunnit = 0;
            }
        }
    }
     
    public String toString() {
        
      if(this.tunnit < 10 && this.minuutit < 10) {
            return String.format("%01d", this.tunnit) + ":" + String.format("%02d", this.minuutit);
        }else if (this.tunnit < 10) {
            return String.format("%01d", this.tunnit) + ":" + this.minuutit;
        }else if (this.minuutit < 10) {
            return this.tunnit + ":" + String.format("%02d", this.minuutit);
        }else {
            return this.tunnit + ":" + this.minuutit;
        }
    }
}

