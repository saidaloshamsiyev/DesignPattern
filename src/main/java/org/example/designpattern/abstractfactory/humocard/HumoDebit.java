package org.example.designpattern.abstractfactory.humocard;

import org.example.designpattern.abstractfactory.card.Card;

/**
 * Concrete Product: Humo Debit Card
 */
public class HumoDebit implements Card {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Humo Debit Card.");
    }
}
