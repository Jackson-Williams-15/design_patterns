package strategy;

/**
 * Creates a robot that is a dog.
 * @author Jackson Williams
 * 
 */
public class DogRobot extends Robot {

    /**
     * creates a robot dog with specific name and adds the character model.
     * @param name the name of the dog robot.
     */
    public DogRobot(String name) {
        super(name);
        character.add("++0");
        moveBehavior = new CrawlBehavior();
    }

    /**
     * creates a string representation of a dog robot.
     * @return string name of the dog robot to let users know what kind of robot it is.  
     */
    public String toString() {
       return name + " is a dog robot";
            }
}
