package org.example.designPatterns.strategy;

import lombok.Data;

@Data
public class DebitCard {

    private int amount = 1000;
    private final CardType cardType;
    private final String number;
    private final String expirationDate;
    private final String cvv;
}
