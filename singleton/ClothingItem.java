package singleton;

import java.util.ArrayList;

public class ClothingItem {
    String name;
    ClothingPart part;
    String color;
    ArrayList<Season> seasons = new ArrayList<>();

    public ClothingItem(String name, ClothingPart part, String color) {
        this.name = name;
        this.part = part;
        this.color = color;
    }

    public boolean hasSeason(Season season) {
        return true;
    }

    public void addSeason(Season season) {

    }

    public String toString() {
        return ;
    }
    
}
