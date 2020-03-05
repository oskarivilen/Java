import java.util.ArrayList;

public class poistaViimeinen {

    public static void main(String[] args) {
        
        ArrayList<String> merkkijonot = new ArrayList<>();

        merkkijonot.add("Eka");
        merkkijonot.add("Toka");
        merkkijonot.add("Kolmas");
        
        System.out.println(merkkijonot);
        
        poistaViimeinen(merkkijonot);
        
        
        System.out.println(merkkijonot);
        
    }
    
    public static String poistaViimeinen(ArrayList<String> merkkijonot) {

        if(merkkijonot.size() > 0) {
            return merkkijonot.remove(merkkijonot.size()-1);
        }

        return null;
    }
}

    
    