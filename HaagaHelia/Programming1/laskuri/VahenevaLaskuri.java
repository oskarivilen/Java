

public class VahenevaLaskuri {
    private int arvo;   // oliomuuttuja joka muistaa laskurin arvon

    public VahenevaLaskuri(int arvoAlussa) {
        this.arvo = arvoAlussa;
    }

    public void tulostaArvo() {
        System.out.println("arvo: " + this.arvo);
    }

    public void vahene() {
        // kirjoita tänne metodin toteutus
        // laskurin arvon on siis tarkoitus vähentyä yhdellä
        if(this.arvo > 1) {
            this.arvo = this.arvo - 1; 
        }
    }
    public void nollaa() {
     this.arvo = 0;
    }

    // ja tänne muut metodit
}