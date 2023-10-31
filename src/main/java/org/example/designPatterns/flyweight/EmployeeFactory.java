package org.example.designPatterns.flyweight;

import java.util.HashMap;

public class EmployeeFactory {

    private static HashMap<String, Employee> hashMap = new HashMap<String, Employee>();
    public static Employee getEmployee(String type) {
        Employee p = null;
        if(hashMap.get(type) != null) {
            p = hashMap.get(type);
        } else {
            switch(type) {
                case "Developer":
                    System.out.println("Developer Created");
                    p = new Developer();
                    break;
                case "Tester":
                    System.out.println("Tester Created");
                    p = new Tester();
                    break;
                default:
                    System.out.println("No Such Employee");
            }

            hashMap.put(type, p);
        }
        return p;
    }
}

