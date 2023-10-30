package org.example.designPatterns.observerEmag;

public interface Observer {

    void subscribe(Subject subject);
    void unSubscribe(Subject subject);
    void update(String news);
}
