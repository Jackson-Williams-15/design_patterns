package adapter;
/**
 * Adapter foor cd to cassette
 * @author Jackson Williams
 */
public class AnalogAdapter implements AnalogAlbum{
    private DigitalAlbum album;

    /**
     * constructor for the adapter
     * @param album album of songs
     */
    public AnalogAdapter(DigitalAlbum album){
        this.album = album;
    }
    
    /**
     * calls the playSong method from CD 
     * @return returns the instance album calling the method 
     */
    public String play() {
        return album.playSong(0);
    }

     /**
     * calls the prevSong method from CD 
     * @return returns the instance album calling the method 
     */
    public String rewind() {
        return album.prevSong();
    }

     /**
     * calls the nextSong method from CD 
     * @return returns the instance album calling the method 
     */
    public String ffwd() {
        return album.nextSong();
    }

     /**
     * calls the stop method from CD 
     * @return returns the instance album calling the method 
     */
    public String stopEject() {
        return album.stop();
    }

     /**
     * calls the pause method from CD 
     * @return returns the instance album calling the method 
     */
    public String pause() {
        return album.pause();
    }
    
}
