package factory;

import java.util.ArrayList;

public class FruitLoops extends Cereal {
    /**
     * sets the name and price along with the toy options for fruit loops
     */
    public FruitLoops() {
        super("Fruit Loops", 1.89);
        toys.add("Paw Patrol Stickers");
        toys.add("Bat Man ring");
        toys.add("Silly Putty");
        toys.add("Tiny Car");
    }

    /**
     * returns a string saying what cereal is being prepared along with the steps specific to fruit loops
     */
    public String prepare() {
        ArrayList<String> steps = new ArrayList<>();
        steps.add("Preparing the " + name);
        steps.add("- Gather the grain");
        steps.add("- Shape into circles");
        steps.add("- Randomly color circles");
        steps.add("- Let circles dry");
        return String.join("\n\t", steps)+"\n";
    }
}
