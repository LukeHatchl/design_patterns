package decorator;

import java.util.ArrayList;

public abstract class Tree {
    protected ArrayList<String> lines = new ArrayList<>();
    
    /**
     * Assigns this instance of lines to the generic array list lines.
     * @param lines Array list that stores the lines in text file tree.
     */
    public Tree(ArrayList<String> lines) {
        this.lines = lines;
    }

    /**
     * Prints out each item in the array list lines as one string
     * @return the string of the lines in tree text file made by the loop.
     */
    public String toString() {
        String ret = "";
        for (int i = 0; i < lines.size(); i++) {
            ret += lines.get(i) + "\n";
        }
        return ret;
    }
}
