package org.example.designpattern.abstractfactory.uzcard;

import org.example.designpattern.abstractfactory.card.Card;

/**
 * Concrete Uzcard Debit Card implementation.
 */
public class UzcardDebit implements Card {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Uzcard Debit Card.");
    }
}
