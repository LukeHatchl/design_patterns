package observer;

public class Mom implements Observer {
    Baby baby;

    /**
     * Constructor for the observer mom
     * @param baby instance of the baby whe nthe program is running
     */
    public Mom(Baby baby) {
        this.baby = baby;
        baby.registerObserver(this);
    }

    /**
     * Displays mom's message based on the babies cry
     * @param cry the type of cry being emitted by the baby
     */
    public void update(Cry cry) {
        if (cry == Cry.ANGRY) {
            System.out.println("Mom hugs " + baby.getName());
            baby.receiveLove();
        }
        else if (cry == Cry.HUNGRY) {
            System.out.println("Mom feeds " + baby.getName());
            baby.eat();
        }
        else if (cry == Cry.WET) {
            System.out.println("Mom changes " + baby.getName());
            baby.getChanged();
        }
    }
}
