/*The Strategy Design Pattern defines a family of algorithms,
encapsulating each one, and making them interchangeable */

package org.example.designPatterns.strategy;

public class MainApp {

    public static void main(String[] args) {

        PaymentService paymentService = new PaymentService();

        paymentService.setStrategy(new PaymentByCreditCard());
        paymentService.processOrder(100);

        System.out.println("==========================================");

        paymentService.setStrategy(new PaymentByPayPal());
        paymentService.processOrder(200);

        System.out.println("==========================================");
        paymentService.setStrategy(new PaymentByDebitCard());
        paymentService.processOrder(215);

    }

}
