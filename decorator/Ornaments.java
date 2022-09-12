package decorator;

import java.util.ArrayList;

public class Ornaments extends TreeDecorator {
    private Tree tree;

    /**
     * Passes the array list lines for the instance of tree, then 
     * gets the lines from oenaments text file and stores them in array list 
     * decor to decorate the tree with ornaments.
     * @param tree the tree that is being passed to the tree decorator ornaments.
     */
    public Ornaments(Tree tree) {
        super(tree.lines);
        ArrayList<String> decor = FileReader.getLines("decorator/txt/ornaments.txt");
        integrateDecor(decor);
    }
}
