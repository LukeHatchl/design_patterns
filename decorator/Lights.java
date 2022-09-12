package decorator;

import java.util.ArrayList;

public class Lights extends TreeDecorator {
    private Tree tree;

    public Lights(Tree tree) {
        super(tree.lines);
        ArrayList<String> decor = FileReader.getLines("decorator/txt/lights.txt");
        integrateDecor(decor);
    }
}
