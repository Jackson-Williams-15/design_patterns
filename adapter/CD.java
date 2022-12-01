package adapter;
import java.util.ArrayList;
import java.util.Iterator;
/**
 * CD player
 * @author Jackson Williams
 */
public class CD implements DigitalAlbum {

    private ArrayList<String> songs = new ArrayList<String>();
    private int currentIndex;

     /**
     * plays the song from the beginning of cassette
     * @return the current song playing, but if it reaches the end then it must rewind
     */ 
    public CD(ArrayList<String> songs) {
        this.songs = songs;
    }

    /**
     * plays the song from the beginning of CD
     * @return returns the first song in array list
     */
    public String playFromBeginning() {
       
       return "playing song: 1" + songs.get(currentIndex); 
    }

    /**
     * plays the song from the CD
     * @return the song playing and the number of the song
     */
    public String playSong(int num) {
        if(currentIndex >= 0){
        for (int i = 0; i < songs.size(); i++){
            return "Playing song: " + currentIndex + " " + songs.get(currentIndex++);
        }
    }
        return "not a valid song number";
    }

    /**
     * goes to the previous song in the CD
     * @return returns the previous index in the array list of songs
     */
    public String prevSong() {
        return "skipping back to " + songs.get(currentIndex--);
    }

    /**
     * goes to the next song in the CD
     * @return returns the next index in the songs
     */
    public String nextSong() {
        return "playing song " + songs.get(currentIndex);
    }

    /**
     * stops the CD playing
     * @return returns the string
     */
    public String stop() {
        return "stopping";
    }

    /**
     * pauses the cd
     * @return returns the string 
     */
    public String pause() {
        return "pausing";
    }
    
}
