package learndesignpatterns.observer;

public interface Observable {
    void creatObserver(Observer observer);

    void removeObserver();

    void updateObserver(String moveName);
}
