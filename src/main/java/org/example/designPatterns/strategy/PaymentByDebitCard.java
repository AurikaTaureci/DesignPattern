package org.example.designPatterns.strategy;

public class PaymentByDebitCard implements PaymentStrategy{

    private DebitCard debitCard;
    @Override
    public void collectPaymentDetails() {
        debitCard = new DebitCard(CardType.MASTER_CARD," 3711 1111 1111 115","09/25","057");
        System.out.println("Collecting Debit Card ...");
    }

    @Override
    public boolean validatePaymentDetails() {
        System.out.println("Validating Card Info: "+ debitCard);
        return true;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paying "+amount+" using Debit Card");
    }
}
