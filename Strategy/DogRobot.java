package strategy;

import java.util.ArrayList;
import java.util.Arrays;

public class DogRobot extends Robot{

    public DogRobot(String name) {
        super(name);
        setMoveBehavior(new CrawlBehavior());
        character = new ArrayList<>(Arrays.asList("++o"));
    }

    public String toString() {
        return name + " is a DogRobot";
    }
    
}
