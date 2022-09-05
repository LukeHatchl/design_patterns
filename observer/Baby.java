package observer;

import java.util.ArrayList;
import java.util.Random;

public class Baby implements Subject{
    String name;
    ArrayList<Observer> observers = new ArrayList<>();
    Random rand = new Random();

    /**
     * Assigns this instance of name to the variable name
     * @param name this instance of the baby's name
     */
    public Baby(String name) {
        this.name = name;
    }

    /**
     * Gets the baby's name
     * @return returns the baby's name
     */
    public String getName() {
        return name;
    }

    /**
     * Randomly displays baby's output after receiving love
     */
    public void receiveLove() {
        String [] arr = {" feels appreciated and loved.", " pushes everyone away and continues to cry."};
        int select = rand.nextInt(arr.length);
        System.out.println(name + arr[select]);
    }

    /**
     * Randomly displays baby's output after being fed
     */
    public void eat() {
        String [] arr = {" has a happy full tummy.", " throws all his food on the floor."};
        int select = rand.nextInt(arr.length);
        System.out.println(name + arr[select]);
    }

    /**
     * Displays the baby is having a diaper change
     */
    public void getChanged() {
        System.out.println(name + " is having a diaper change.");
    }

    /**
     * Adds and observer to the ArrayList
     * @param observer the name of the observer being added 
     */
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * Removes observer from the ArrayList
     * @param observer the name of the observer being removed
     */
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    /**
     * Notifies the observers that the baby is crying
     * @param cry type of cry being emitted by the baby
     */
    public void notifyObservers(Cry cry) {
        for(Observer observer : observers) {
            observer.update(cry);
        }
    }
    
    /**
     * Displays output for when the baby is angry
     */
    public void angryCry() {
        System.out.println("Waaaaaaaaaa! Charlie is feeling abandoned and angry.");
        notifyObservers(Cry.ANGRY);
    }

    /**
     * Displays output for when the baby is hungry
     */
    public void hungryCry() {
        System.out.println("Neh Neh Neh! Charlie is starving!!!!");
        notifyObservers(Cry.HUNGRY);
    }

    /**
     * Displays output for when the baby is wet
     */
    public void wetCry() {
        System.out.println("Aaaaaaaa! Charlie is WET!");
        notifyObservers(Cry.WET);
    }
}
