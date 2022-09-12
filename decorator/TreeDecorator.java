package decorator;

import java.util.ArrayList;

public abstract class TreeDecorator extends Tree {

    public TreeDecorator(ArrayList<String> lines) {
        super(lines);
    }
    
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
