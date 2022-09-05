package observer;

import java.util.Random;

public class Dad implements Observer {
    Subject baby;
    Random rand = new Random();

    public Dad(Subject baby) {
        this.baby = baby;
        baby.registerObserver(this);
    }

    public void update(Cry cry) {
        String [] arr = {"Dad puts a pillow over his head", "Dad nudges mom", "Dad screams .... aaaaa"};
        int select = rand.nextInt(arr.length);
        System.out.println(arr[select]);
    }
    
}
