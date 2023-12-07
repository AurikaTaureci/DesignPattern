package org.example.designPatterns.observer;

public class User implements Observer{
    private final String name;

    public User(String name) {
        this.name = name;
    }


    @Override
    public void subscribe(Subject subject) {
        subject.addObserver(this);

    }

    @Override
    public void unSubscribe(Subject subject) {
        subject.removeObserver(this);
        System.out.println("Unsubscribing "+ name);

    }

    @Override
    public void update(String news) {
        System.out.println(name+ " a primit notificarea: "+ news);
    }
}
