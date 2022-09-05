package observer;

import java.util.Random;

public class Dad implements Observer {
    Subject baby;
    Random rand = new Random();

    /**
     * Constructor for the observer dad
     * @param baby instance of the baby whe nthe program is running
     */
    public Dad(Subject baby) {
        this.baby = baby;
        baby.registerObserver(this);
    }

    /**
     * Randomly outputs dads response to baby crying
     * @param cry the type of cry being emitted by the baby
     */
    public void update(Cry cry) {
        String [] arr = {"Dad puts a pillow over his head", "Dad nudges mom", "Dad screams .... aaaaa"};
        int select = rand.nextInt(arr.length);
        System.out.println(arr[select]);
    }
    
}
