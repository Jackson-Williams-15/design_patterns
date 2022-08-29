package strategy;
import java.util.ArrayList;

/**
 * Creates a Parent class of a Robot.
 * @author Jackson Williams
 * 
 */
public abstract class Robot {
    protected String name;
    protected ArrayList<String> character = new ArrayList<String>();
    protected MoveBehavior moveBehavior;

    /**
     * New instance of a robot with intended name.
     * @param name name of the robot.
     */
public Robot(String name) {
    this.name = name;
}

/**
 * this sets up the move behavior of all different robots.
 * @param moveBehavior the move behavior of the robot
 */
public void setMoveBehavior(MoveBehavior moveBehavior) {
    this.moveBehavior = moveBehavior;
}

/**
 * moves the robot character
 */
public void move() {
    moveBehavior.move(character);
}

/**
 * gets the name of robot
 * @return the name of robot.
 */
public String getName() {
    return this.name;
}

/**
 * creates an abstract string
 */
public abstract String toString();
}
