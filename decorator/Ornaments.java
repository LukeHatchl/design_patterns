package decorator;

import java.util.ArrayList;

public class Ornaments extends TreeDecorator {
    private Tree tree;

    public Ornaments(Tree tree) {
        super(tree.lines);
        ArrayList<String> decor = FileReader.getLines("decorator/txt/ornaments.txt");
        integrateDecor(decor);
    }
}
