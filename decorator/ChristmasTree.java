package decorator;

public class ChristmasTree extends Tree {
    /**
     * Grabs the lines from tree text file and passes them to the super(Tree)
     */
    public ChristmasTree() {
        super(FileReader.getLines("decorator/txt/tree.txt"));
    }
}
