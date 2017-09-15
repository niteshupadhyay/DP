package net.media.training.designpattern.observer;
import java.util.*;
/**
 * Created by nitesh.u on 20/07/17.
 */
public class SunSubject {

    private List<Observer> observers = new ArrayList<Observer>();
    private int state;

    public int getState() {
        return state;
    }



    public void registerObserver(Observer observer){
        observers.add(observer);
    }

    public void removeObserver(Observer observer){
        observers.remove(observer);
    }

    public void set(){
        for (Observer observer : observers) {
            observer.notifySunSet();
        }
    }

    public void rise(){
        for (Observer observer : observers) {
            observer.notifySunRise();
        }
    }
}
