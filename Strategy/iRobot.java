package strategy;

import java.util.ArrayList;
import java.util.Arrays;

public class iRobot extends Robot {
    
    public iRobot(String name) {
        super(name);
        setMoveBehavior(new RunBehavior());
        character = new ArrayList<>(Arrays.asList("( )", ">|<", "/ \\"));
    }

    public String toString() {
        return name + " is a iRobot";
    }
    
}
