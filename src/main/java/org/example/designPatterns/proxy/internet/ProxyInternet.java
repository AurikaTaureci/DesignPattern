package org.example.designPatterns.proxy.internet;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet{


    private  static List<String> forbiddenSites = new ArrayList<>();

    static{
        forbiddenSites.add("xxx.com");
        forbiddenSites.add("ttt.ro");
    }
    private final Internet internet = new RealInternet();

    @Override
    public void connectTo(String host) {

        if (forbiddenSites.contains(host)) {
            System.out.println("Access Denied to " + host);
            return;
        }
        internet.connectTo(host);
    }
}
