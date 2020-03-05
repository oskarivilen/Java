import java.util.ArrayList;
import java.util.List;

public class Playlist {

    ArrayList<Song> songs;

    public Playlist() {
        this.songs = new ArrayList<Song>();
    }
    public void addSong(Song song) {
        this.songs.add(song);
    }
    public Song getSong(int index) {
        if(index <= songs.size()) {
            return songs.get(index);
        }else {
        return null; 
        }
    }
    public int getTotalLength() {
        int summa = 0;
        for (int i = 0; i < songs.size();i++) {
            Song s = songs.get(i);
            int pituus = s.getLength();
            summa += pituus;
        }
        return summa;
    }
      
        public String toString() {
            String rows = "";
            for(int i = 0; i < songs.size();i++) {
                String row = (i + 1) + ": " + songs.get(i);
                rows = rows + row +  "\n";
            }
            return rows;
        }
    }