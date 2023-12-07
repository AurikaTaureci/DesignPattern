
package org.example.designPatterns.strategy;

public class PaymentByPayPal implements PaymentStrategy {

    private PayPal payPal;
    @Override
    public void collectPaymentDetails() {

        payPal=new PayPal("PayPal Mail","PayPal Password");
        System.out.println("Collecting PayPal Account Details...");
    }

    @Override
    public boolean validatePaymentDetails() {

        System.out.printf("Validating PayPal Info: "+payPal);
        return true;
    }

    @Override
    public void pay(int amount) {

        System.out.println("Paying " + amount + " using PayPal");
    }

}

