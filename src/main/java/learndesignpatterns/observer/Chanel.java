package learndesignpatterns.observer;

import java.util.ArrayList;
import java.util.List;


public class Chanel implements Observable {
    private List<Observer> subscribers;

    public Chanel() {
        subscribers = new ArrayList<>();
    }

    @Override
    public void creatObserver(Observer observer) {
        subscribers.add(observer);
    }

    @Override
    public void removeObserver() {

    }

    @Override
    public void updateObserver(String moveName) {
        for (Observer subscriber:subscribers){
            subscriber.notification(moveName);
        }

    }
}
