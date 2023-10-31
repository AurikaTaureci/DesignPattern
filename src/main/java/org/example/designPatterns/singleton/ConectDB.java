package org.example.designPatterns.singleton;

//implementarea Lazy
public class ConectDB {

    String name;
    int time;
    //1. constuctor private
    private ConectDB(){}

    // 2. instanta clasei private
    private static ConectDB SINGLETON; // zona de memorie statica

    // 3. creez o metoda care instantiaza clasa daca instanta este null
    public static ConectDB getInstance(){
        if(SINGLETON==null){
            SINGLETON= new ConectDB();
        }
            return SINGLETON;
        }
    }

