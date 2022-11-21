package state;

public class TVDriver {

	public void runTV() {
		TV tv = new TV();
		System.out.println(tv.pressHomeButton());
		System.out.println(tv.pressNetflixButton());
		System.out.println(tv.pressMovieButton());
		System.out.println(tv.pressTVButton());
		System.out.println(tv.pressHuluButton());
		System.out.println(tv.pressMovieButton());
		System.out.println(tv.pressTVButton());
		System.out.println(tv.pressHomeButton());
	}

	public static void main(String[] args) {
		TVDriver tvDriver = new TVDriver();
		tvDriver.runTV();
	}
}

