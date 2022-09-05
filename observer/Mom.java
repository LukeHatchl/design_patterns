package observer;

public class Mom implements Observer {
    Baby baby;

    public Mom(Baby baby) {
        this.baby = baby;
        baby.registerObserver(this);
    }

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
