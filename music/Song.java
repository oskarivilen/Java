
public class Song {

    private String title;
    private Artist artist;
    private int year; 
    private int length;
    
    
    public String getTitle() {
        return this.title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public Artist getArtist() {
        return this.artist;
    }
    public void setArtist(Artist artist) {
        this.artist = artist;
        
    }
    public int getYear() {
        return this.year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getLength() {
        return this.length;
    }
    public void setLength(int length) {
        this.length = length;
    }
    @Override
    public String toString() {
        if(artist == null) {
            return this.title;
        }else {
        return this.title + " by " + this.artist;
        }
    }
}
