package singleton;

import java.util.ArrayList;
import java.util.Random;

public class OutfitCreator {
    private ArrayList<ClothingItem> tops = new ArrayList<>();
    private ArrayList<ClothingItem> bottoms = new ArrayList<>();
    private ArrayList<ClothingItem> wholes = new ArrayList<>();
    private Random rand = new Random();
    private static OutfitCreator outfitCreator;

    private OutfitCreator() {}

    public static OutfitCreator getInstance() {
        if (outfitCreator == null) {
			System.out.println("Creating a chocolate boiler");
			outfitCreator = new OutfitCreator();
		}
		return outfitCreator;
    }

    public String getOutfit(Season season) {
        String ret = "";
        
    }
}
