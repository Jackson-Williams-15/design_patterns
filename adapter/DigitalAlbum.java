package adapter;
/**
 * digital album
 * @author Jackson Williams
 */
public interface DigitalAlbum {
    public String playFromBeginning();
    public  String playSong(int num);
    public String prevSong();
    public String nextSong();
    public String stop();
    public String pause();
}
