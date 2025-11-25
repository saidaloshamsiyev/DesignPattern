package org.example.designpattern.abstractfactory.uzcard;

import org.example.designpattern.abstractfactory.card.Card;

/**
 * Concrete Product: Uzcard Credit Card
 */
public class UzcardCredit implements Card {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Uzcard Credit Card.");
    }
}
