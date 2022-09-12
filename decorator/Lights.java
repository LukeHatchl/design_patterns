package decorator;

import java.util.ArrayList;

public class Lights extends TreeDecorator {
    private Tree tree;

    /**
     * Passes the array list lines for the instance of tree, then 
     * gets the lines from lights text file and stores them in array list 
     * decor to decorate the tree with lights.
     * @param tree the tree that is being passed to the tree decorator lights
     */
    public Lights(Tree tree) {
        super(tree.lines);
        ArrayList<String> decor = FileReader.getLines("decorator/txt/lights.txt");
        integrateDecor(decor);
    }
}
