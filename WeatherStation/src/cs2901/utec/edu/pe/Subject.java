package cs2901.utec.edu.pe;

import java.util.ArrayList;
import java.util.List;

public interface Subject {
    List<Observer> observers = new ArrayList<Observer>();

    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}

