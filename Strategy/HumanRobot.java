package strategy;

import java.util.ArrayList;
import java.util.Arrays;

public class HumanRobot extends Robot{

    /**
     * Sets the moveBehavior for HumanRobot to run
     * Assigns the proper ArrayList for the HumanRobot to character
     * @param name The name of the HumanRobot
     */
    public HumanRobot(String name) {
        super(name);
        setMoveBehavior(new WalkBehavior());
        character = new ArrayList<>(Arrays.asList(" 0", "-|-", "/ \\"));
    }

    /**
     * Returns a string with the name of the robot and the type, HumanRobot
     */
    public String toString() {
        return name + " is a HumanRobot";
    }
    
}
