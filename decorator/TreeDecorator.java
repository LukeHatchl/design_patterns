package decorator;

import java.util.ArrayList;

public abstract class TreeDecorator extends Tree {

    /**
     * Constructor for Tree decorator
     * Passes the lines of file to the super
     * @param lines array list containing the lines of text 
     * file being used
     */
    public TreeDecorator(ArrayList<String> lines) {
        super(lines);
    }
    
    /**
     * Decorates the tree by taking the characters in 
     * the decorator text file and replacing them in their 
     * corresponding line and column in the original lines
     * arraylist
     * @param decor array list containing the lines of the decorator
     * text file being used.
     */
    protected void integrateDecor(ArrayList<String> decor) {
        for(int i = 0; i < decor.size();i++) {
            StringBuilder myString = new StringBuilder(lines.get(i));
            for(int j = 0; j < decor.get(i).length(); j++) {
                if(decor.get(i).charAt(j) != ' ') {
                    char c = decor.get(i).charAt(j);
                    myString.setCharAt(j, c);
                }
            }
            lines.set(i, myString.toString());
            System.out.println(i);
        }
    }
}
