package strategy;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * The Crazy Robot moving program
 */
public class CrazyWorld {
    private static final String YES = "y";
    private static final String NO = "n";
    private Scanner reader;

    public CrazyWorld() {
        reader = new Scanner(System.in);
    }

    /**
     * Runs the program, letting the user pick which character to move
     */
    public void run() {
        ArrayList<Robot> robots = new ArrayList<Robot>();
        robots.add(new DogRobot("Baily"));
        robots.add(new HumanRobot("Sally"));
        robots.add(new iRobot("Scary"));

        while (true) {
            displayCharacters(robots);
            System.out.print("Who would you like to move: ");
            String characterName = reader.nextLine().toLowerCase().trim();

            if (!moveRobot(robots, characterName)) {
                System.out.println(characterName + " isn't in our robot list");
            }

            if (!playAgain()) {
                break;
            }
        }

        reader.close();
        System.out.println("Goodbye");

    }

    /**
     * Moves the robot forward
     * 
     * @param robots        The list of robots
     * @param characterName The name of the robot to move
     * @return true if the robot moves and false otherwise
     */
    private boolean moveRobot(ArrayList<Robot> robots, String characterName) {
        for (Robot robot : robots) {
            if (robot.getName().equalsIgnoreCase(characterName)) {
                robot.move();
                return true;
            }
        }
        return false;
    }

    /**
     * Displays the robots and their names
     * 
     * @param robots The list of robots
     */
    private void displayCharacters(ArrayList<Robot> robots) {
        System.out.println("You have the following 3 characters");
        for (Robot robot : robots) {
            System.out.println(robot);
        }
    }

    /**
     * Asks the user if they would like to continue
     * If they enter yes, it returns true, otherwise it returns false
     * 
     * @return True if they want to play again, and false otherwise
     */
    private boolean playAgain() {
        while (true) {
            System.out.print("Do you want to continue (Y)es or (N)o: ");
            String command = reader.nextLine().toLowerCase().trim();

            if (command.equals(YES)) {
                return true;
            } else if (command.equals(NO)) {
                return false;
            } else {
                System.out.println("Sorry, that's not a valid command");
            }
        }
    }

    public static void main(String[] args) {
        CrazyWorld world = new CrazyWorld();
        world.run();
    }
}
