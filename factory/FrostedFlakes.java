package factory;

import java.util.ArrayList;

public class FrostedFlakes extends Cereal { 
    /**
     * sets the name and price along with the toy options for frosted flakes
     */
    public FrostedFlakes() {
        super("Frosted Flakes", 2.99);
        toys.add("Spider man Tattoo");
        toys.add("Barbie Tattoo");
        toys.add("Snap Bracelet");
        toys.add("Happy Feet Figurine");
    }

    /**
     * returns a string saying what cereal is being prepared along with the steps specific to frosted flakes
     */
    public String prepare() {
        ArrayList<String> steps = new ArrayList<>();
        steps.add("Preparing the " + name);
        steps.add("- Gather the grain");
        steps.add("- Shape into flakes");
        steps.add("- Sprinkle with frosting");
        return String.join("\n\t", steps)+"\n";
    }
}
