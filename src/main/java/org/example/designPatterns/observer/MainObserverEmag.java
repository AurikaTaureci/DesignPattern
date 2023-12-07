package org.example.designPatterns.observer;
//Observer: modalitate de a notifica o serie de clase
public class MainObserverEmag {

    public static void main(String[] args) {

        User user1 = new User("Andrei");
        User user2 = new User("Marian");
        User user3 = new User("Daniela");


        EmagSubject emagSubject = new EmagSubject();
        user1.subscribe(emagSubject);
        user2.subscribe(emagSubject);
        user3.subscribe(emagSubject);

        emagSubject.setNews("Buna ziua, Black Friday la eMAG are loc in data de 10 noiembrie 2023.");
        emagSubject.notifyObservers();

        user2.unSubscribe(emagSubject);
        emagSubject.setNews("mai sunt 11 zile pana la Black Friday. ");
        emagSubject.notifyObservers();
    }
}
