package strategy;

import java.util.ArrayList;

public class WalkBehavior extends MoveBehavior {
    
    /**
     * Passes in the parameters for move that moves the character at the pace of a walk
     */
    public void move(ArrayList<String> character) {
        super.move(character,2);
        
    }    
}
