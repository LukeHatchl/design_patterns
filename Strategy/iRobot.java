package strategy;

import java.util.ArrayList;
import java.util.Arrays;

public class iRobot extends Robot {
    
    /**
     * Sets the moveBehavior for iRobot to run
     * Assigns the proper ArrayList for the iRobot to character
     * @param name The name of the iRobot
     */
    public iRobot(String name) {
        super(name);
        setMoveBehavior(new RunBehavior());
        character = new ArrayList<>(Arrays.asList("( )", ">|<", "/ \\"));
    }

    /**
     * Returns a string with the name of the robot and the type, iRobot
     */
    public String toString() {
        return name + " is a iRobot";
    }
    
}
