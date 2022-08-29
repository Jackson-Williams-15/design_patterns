package strategy;

/**
 * creates a scary iRobot.
 * @author Jackson Williams
 * 
 */
public class iRobot extends Robot {

     /**
     * creates an iRobot with a specific name and adds the character model.
     * @param name the name of the  iRobot.
     */
    public iRobot(String name) {
        super(name);
        character.add("()");
        character.add(">|<");
        character.add("/ \\");
        moveBehavior = new RunBehavior();
    }

     /**
     * creates a string representation of a iRobot.
     * @return string name of the iRobot to let users know what kind of robot it is.  
     */
    public String toString() {
       return name + " is an iRobot";
            }
}
  