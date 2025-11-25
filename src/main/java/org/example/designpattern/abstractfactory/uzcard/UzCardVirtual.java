package org.example.designpattern.abstractfactory.uzcard;

import org.example.designpattern.abstractfactory.card.Card;

/**
 * Concrete Uzcard Virtual Card implementation.
 */
public class UzCardVirtual implements Card {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Uzcard Virtual Card.");
    }
}
