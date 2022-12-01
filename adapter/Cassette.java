package adapter;
import java.util.ArrayList;
/**
 * cassette player
 * @author Jackson Williams
 */
public class Cassette implements AnalogAlbum{
    private ArrayList<String> songs = new ArrayList<String>();
    private int currentIndex;

    /**
     * constructor for the cassette
     * @param songs list of songs
     */
    public Cassette(ArrayList<String> songs){
        this.songs = songs;
    }

    /**
     * plays the song from the beginning of cassette
     * @return the current song playing, but if it reaches the end then it must rewind
     */    
    public String play() {
        if(currentIndex >= 0){
            for (int i = 0; i < songs.size(); i++){ 
            return "Playing song: " + currentIndex + " " + songs.get(currentIndex++);
            }
        }
            return "At the end of the cassette you need to rewind"; 
        }

    /**
    * rewinds to a previous song on the cassette 
    * @return returns a string and the previous index 
    */ 
    public String rewind() {
        return "rewinding to " + currentIndex--;
    }

    /**
     * fast forwards to the next song in index
     * @return returns the string withe next index/ song being fastforwarded to
     */ 
    
    public String ffwd() {
        return "forward to song " + currentIndex++;
    }

     /**
     * stops cassette
     * @return returns string indicating stop
     */ 
    public String stopEject() {
        return "Stopping cassette and ejecting";
    }

    /**
     * pauses the cassette
     * @return returns the string 
     */     public String pause() {
        return "pausing";
    }


}
