package decorator;

import java.util.ArrayList;

public abstract class Tree {
    protected ArrayList<String> lines = new ArrayList<>();
    
    public Tree(ArrayList<String> lines) {
        this.lines = lines;
    }

    public String toString() {
        String ret = "";
        for (int i = 0; i < lines.size(); i++) {
            ret += lines.get(i) + "\n";
        }
        return ret;
    }
}
