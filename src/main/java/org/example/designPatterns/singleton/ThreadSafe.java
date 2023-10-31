package org.example.designPatterns.singleton;

// implementare inner -static thread-safe
public class ThreadSafe {

    String denumire;
    int nr_angajati;
    String adresa;
    //1. constructor private
    private ThreadSafe(){}

    //2. clasa inner static
    private static final class SingletonHolder{
        private static ThreadSafe SINGLETON = new ThreadSafe();
    }

    //3. getInscance
    public static ThreadSafe getInstance(){
        return SingletonHolder.SINGLETON;
    }

}
