package cs2901.utec.edu.pe;

public interface Subject {
    void registerObserver();
    void removeObserver();
    void notifyObservers();
}
