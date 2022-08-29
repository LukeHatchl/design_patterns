package strategy;

import java.util.ArrayList;
import java.util.Arrays;

public class HumanRobot extends Robot{

    public HumanRobot(String name) {
        super(name);
        setMoveBehavior(new WalkBehavior());
        character = new ArrayList<>(Arrays.asList(" 0", "-|-", "/ \\"));
    }

    public String toString() {
        return name + " is a HumanRobot";
    }
    
}
