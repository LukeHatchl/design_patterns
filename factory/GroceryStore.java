package factory;

public class GroceryStore {

    /**
     * makes a cereal
     * @param type the type of cereal being made
     * @return an instance of cereal after it has been made
     */
    public Cereal createCereal(String type) {
        Cereal cereal;

        if(type.equals("frosted flakes")) {
            cereal = new FrostedFlakes();
        } else if(type.equals("fruit loops")) {
            cereal = new FruitLoops();
        } else if (type.equals("lucky charms")) {
            cereal = new LuckyCharms();
        } else {
            throw new IllegalArgumentException("We do not make or sell " + type);
        }

        cereal.prepare();
        cereal.boxCereal();
        cereal.priceCereal();

        return cereal;
    }
}
