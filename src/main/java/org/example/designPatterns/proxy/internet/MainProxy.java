package org.example.designPatterns.proxy.internet;

public class MainProxy {
    public static void main(String[] args) {
        Internet internet = new ProxyInternet();
        internet.connectTo("google.com");
        internet.connectTo("xxx.com");
        internet.connectTo("YouToube.com");
        internet.connectTo("ttt.ro");
    }
}
