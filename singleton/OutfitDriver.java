package singleton;

import java.util.Scanner;

/**
 * The UI code for our outfit picking program
 */
public class OutfitDriver {
	private static final String YES = "y";
	private static final String NO = "n";
	Scanner reader;

	/**
	 * Creates a new Driver and initalizes the Scanner
	 */
	public OutfitDriver() {
		reader = new Scanner(System.in);
	}

	/**
	 * Displays the outfit program flow
	 * Will shows outfits based on the season of the users choice
	 */
	public void runCreator() {
		OutfitCreator outfitCreator = OutfitCreator.getInstance();

		System.out.println("\n***** Welcome to our outfit creator! ***** ");

		while (true) {
			Season season = getSeason();
			System.out.println("\nYou can wear: ");
			System.out.println(outfitCreator.getOutfit(season));

			if (runAgain()) {
				break;
			}
		}
		System.out.println("Have a fashinable day!");
	}

	/**
	 * Will ask the user if they are satisfied with their answer
	 * 
	 * @return true if the user is satisfied and false otherwise
	 */
	private boolean runAgain() {
		while (true) {
			System.out.print("\nAre you satisfied with your answer (Y)es or (N)o: ");
			String result = reader.nextLine().trim();

			if (result.equals(YES)) {
				return true;
			} else if (result.equals(NO)) {
				return false;
			} else {
				System.out.println("Invalid input");
			}

		}
	}

	/**
	 * Will ask the user for the current season
	 * 
	 * @return the Season the user selected
	 */
	private Season getSeason() {
		while (true) {
			System.out.println("\nEnter the Season: ");
			displaySeasons();
			int result = Integer.parseInt(reader.nextLine().trim());

			if (result < 1 || result > Season.values().length) {
				System.out.println("Sorry, this is not a valid number");
				continue;
			}

			return Season.values()[result - 1];
		}
	}

	/**
	 * Loops through and displays all the seasons in a menu
	 */
	private void displaySeasons() {
		int counter = 1;

		for (Season season : Season.values()) {
			String seasonText = season.toString();
			System.out.println(
					counter + " " + seasonText.substring(0, 1).toUpperCase() + seasonText.substring(1).toLowerCase());
			counter++;
		}
	}

	public static void main(String[] args) {
		OutfitDriver driver = new OutfitDriver();
		driver.runCreator();

	}
}

