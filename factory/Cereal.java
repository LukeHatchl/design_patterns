package factory;

import java.util.ArrayList;
import java.util.Random;

public abstract class Cereal {
    protected String name;
    protected double price;
    protected ArrayList<String> toys = new ArrayList<>();

    /**
     * sets this instance of name and price equal to the initial variables 
     * @param name name of the cereal
     * @param price price of the cereal
     */
    public Cereal(String name, double price) {
        this.name = name;
        this.price = price;
    }

    /**
     * prepares the cereal
     * @return a string saying the cereal is being prepared and what cereal it is
     */
    public String prepare() {
        return "Preparing the " + name + "\n";
    }

    /**
     * boxes the cereal
     * @return a string saying the cereal being boxed and detailed steps as to how the boxing is done
     */
    public String boxCereal() {
        Random rand = new Random();
        return "Boxing the " + name + "\n\t- Drawing fun pictures of " + name + " on the box\n\t- Pouring the " + name + " into the box\n\t- Adding the suprise " + toys.get(rand.nextInt(toys.size())) + "\n";
    }

    /**
     * puts the price tag on the ceral box
     * @return a string saying the price of the cereal and what cereal it corresponds to
     */
    public String priceCereal() {
        return "Putting the price tag of $" + price + " on the " + name + " box\n";
    }
    
}
