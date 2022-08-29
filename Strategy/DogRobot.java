package strategy;

import java.util.ArrayList;
import java.util.Arrays;

public class DogRobot extends Robot{

    /**
     * Sets the moveBehavior for DogRobot to run
     * Assigns the proper ArrayList for the DogRobot to character
     * @param name The name of the DogRobot
     */
    public DogRobot(String name) {
        super(name);
        setMoveBehavior(new CrawlBehavior());
        character = new ArrayList<>(Arrays.asList("++o"));
    }

    /**
     * Returns a string with the name of the robot and the type, DogRobot
     */
    public String toString() {
        return name + " is a DogRobot";
    }
    
}
