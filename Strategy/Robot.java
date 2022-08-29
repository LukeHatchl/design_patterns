package strategy;
import java.util.ArrayList;

public abstract class Robot {
    protected String name;
    protected ArrayList<String> character;
    protected MoveBehavior moveBehavior;

    /**
     * Constructor for Robot
     * Assigns this instance of name to generic parameter name
     * @param name The name of the robot
     */
    public Robot(String name) {
        this.name = name;
    }

    /**
     * Assigns this instance of moveBehavior to the generic parameter moveBehavior
     * @param moveBehavior The type of moveBehavior for the robot
     */
    public void setMoveBehavior(MoveBehavior moveBehavior) {
        this.moveBehavior = moveBehavior;
    }

    /**
     * Calls the move method to move the character across the screen
     */
    public void move() {
        moveBehavior.move(character);
    }

    /**
     * Returns a string with the name of the default robot and the type of robot it is
     */
    public String toString() {

        return name + " is a Robot";

    }

    /**
     * Returns the name of the robot
     */
    public String getName() {
        return name;
    }
}
