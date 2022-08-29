package strategy;
import java.util.ArrayList;

public abstract class Robot {
    protected String name;
    protected ArrayList<String> character;
    protected MoveBehavior moveBehavior;

    public Robot(String name) {
        this.name = name;
    }

    public void setMoveBehavior(MoveBehavior moveBehavior) {
        this.moveBehavior = moveBehavior;
    }

    public void move() {
        moveBehavior.move(character);
    }

    public String toString() {

        return name + " is a Robot";

    }

    public String getName() {
        return name;
    }
}
