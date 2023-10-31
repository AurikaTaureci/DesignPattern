package org.example.designPatterns.singleton;

public class MainClass {
    public static void main(String[] args) {
         //ConectDB conectDB = new ConectDB(); -> nu se poate instantia constructorul private

        ConectDB conectDB =ConectDB.getInstance();
        conectDB.name="Oracle";
        ConectDB conectDB1 = ConectDB.getInstance();
        //conectDB1.name ="Java";
        System.out.println(conectDB1.name);

        ThreadSafe threadSafe = ThreadSafe.getInstance();
        System.out.println(threadSafe.denumire="Birde");

    }
}
