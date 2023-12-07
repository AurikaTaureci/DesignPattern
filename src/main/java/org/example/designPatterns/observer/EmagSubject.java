package org.example.designPatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class EmagSubject implements Subject{
    private String news;
    private List<Observer> observerList= new ArrayList<>();


    @Override
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observerList.forEach(o->o.update(news));
    }

    public void setNews(String news) {
        this.news = news;
    }
}
