package strategy;

/**
 * creates a robot that is a human.
 * @author Jackson Williams
 * 
 */
public class HumanRobot extends Robot {

    /**
     * creates a human robot with a specific name and adds the character model.
     * @param name the name of the human robot.
     */
    public HumanRobot(String name) {
        super(name);
moveBehavior = new WalkBehavior();
character.add(" 0");
character.add("-|-");
character.add("/ \\");
    }

      /**
     * creates a string representation of a human robot.
     * @return string name of the human robot to let users know what kind of robot it is.  
     */
    public String toString() {
return name + " is a human robot";

    }
}
