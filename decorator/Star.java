package decorator;

import java.util.ArrayList;

public class Star extends TreeDecorator {
    private Tree tree;

    public Star(Tree tree) {
        super(tree.lines);
        ArrayList<String> decor = FileReader.getLines("decorator/txt/star.txt");
        integrateDecor(decor);
    }
    
}
