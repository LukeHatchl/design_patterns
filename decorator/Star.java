package decorator;

import java.util.ArrayList;

public class Star extends TreeDecorator {
    private Tree tree;

    /**
     * Passes the array list lines for the instance of tree, then 
     * gets the lines from star text file and stores them in array list 
     * decor to decorate the tree with a star.
     * @param tree the tree that is being passed to the tree decorator star
     */
    public Star(Tree tree) {
        super(tree.lines);
        ArrayList<String> decor = FileReader.getLines("decorator/txt/star.txt");
        integrateDecor(decor);
    }
    
}
