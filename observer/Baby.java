package observer;

import java.util.ArrayList;
import java.util.Random;

public class Baby implements Subject{
    String name;
    ArrayList<Observer> observers = new ArrayList<>();
    Random rand = new Random();

    public Baby(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void receiveLove() {
        String [] arr = {" feels appreciated and loved.", " pushes everyone away and continues to cry."};
        int select = rand.nextInt(arr.length);
        System.out.println(name + arr[select]);
    }

    public void eat() {
        String [] arr = {" has a happy full tummy.", " throws all his food on the floor."};
        int select = rand.nextInt(arr.length);
        System.out.println(name + arr[select]);
    }

    public void getChanged() {
        System.out.println(name + " is having a diaper change.");
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(Cry cry) {
        for(Observer observer : observers) {
            observer.update(cry);
        }
    }
    
    public void angryCry() {
        System.out.println("Waaaaaaaaaa! Charlie is feeling abandoned and angry.");
        notifyObservers(Cry.ANGRY);
    }

    public void hungryCry() {
        System.out.println("Neh Neh Neh! Charlie is starving!!!!");
        notifyObservers(Cry.HUNGRY);
    }

    public void wetCry() {
        System.out.println("Aaaaaaaa! Charlie is WET!");
        notifyObservers(Cry.WET);
    }
}
