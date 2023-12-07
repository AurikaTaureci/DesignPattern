package org.example.designPatterns.proxy.internet;

public class RealInternet implements Internet{
    @Override
    public void connectTo(String host) {
        System.out.println("opened connection to..." +host);
    }
}
