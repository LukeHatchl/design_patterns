package strategy;

import java.util.ArrayList;

public class CrawlBehavior extends MoveBehavior {

    /**
     * Passes in the parameters for move that moves the character at the pace of a crawl
     */
    public void move(ArrayList<String> character) {
        super.move(character, 1);
    }    
}
