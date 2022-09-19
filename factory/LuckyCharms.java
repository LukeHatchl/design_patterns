package factory;

import java.util.ArrayList;

public class LuckyCharms extends Cereal {
    /**
     * sets the name and price along with the toy options for lucky charms
     */
    public LuckyCharms() {
        super("Lucky Charms", 1.55);
        toys.add("My Little Pony Stickers");
        toys.add("Elsa ring");
        toys.add("Play doe");
        toys.add("Tiny truck");
    }

    /**
     * returns a string saying what cereal is being prepared along with the steps specific to lucky charms
     */
    public String prepare() {
        ArrayList<String> steps = new ArrayList<>();
        steps.add("Preparing the " + name);
        steps.add("- Gather the grain");
        steps.add("- Shape into Xs and Os");
        steps.add("- Create marshmallow shapes");
        steps.add("- Mix grain and marshmallows");
        return String.join("\n\t", steps)+"\n";
    }
}
