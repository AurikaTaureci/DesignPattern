package org.example.designPatterns.observerEmag;


public interface Subject {

    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
