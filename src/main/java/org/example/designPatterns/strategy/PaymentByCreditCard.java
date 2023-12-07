package org.example.designPatterns.strategy;

public class PaymentByCreditCard implements PaymentStrategy {

   private CreditCard card;

    @Override
    public void collectPaymentDetails() {

        card = new CreditCard(" 3711 1111 1111 114", "12/24", "003");
        System.out.println("Collecting Card Details...");
    }

    @Override
    public boolean validatePaymentDetails() {

        System.out.println("Validating Card Info: " + card);
        return true;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paying " + amount + " using Credit Card");

    }

}

