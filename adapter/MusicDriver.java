package adapter;

import java.util.ArrayList;
import java.util.List;

public class MusicDriver {

	public void RunMusicDriver() {
		ArrayList<String> songs = new ArrayList<>(List.of("A hard Day's Night", "I should Have Known Better",
				"If I Fell", "I'm Happy Just To Dance With You", "And I Love Her"));
		AnalogAlbum beatlesTape = new Cassette(songs);

		ArrayList<String> songs2 = new ArrayList<>(
				List.of("Hello", "Hey Now!", "She's Electric", "Wonderwall", "Champagne Supernova"));

		DigitalAlbum oasisCD = new CD(songs2);
		AnalogAlbum oasisTape = new AnalogAdapter(oasisCD);

		System.out.println("*********** Displaying a Beatles Cassett ***************");
		runAnalogAlbumFeatures(beatlesTape);

		System.out.println("\n*********** Displaying an Oasis CD ***************");
		runAnalogAlbumFeatures(oasisTape);
	}

	private void runAnalogAlbumFeatures(AnalogAlbum album) {
		System.out.println(album.play());
		System.out.println(album.play());
		System.out.println(album.ffwd());
		System.out.println(album.play());
		System.out.println(album.play());
		System.out.println(album.rewind());
		System.out.println(album.rewind());
		System.out.println(album.rewind());
		System.out.println(album.play());

	}

	public static void main(String[] args) {
		MusicDriver mDriver = new MusicDriver();
		mDriver.RunMusicDriver();

	}
}
