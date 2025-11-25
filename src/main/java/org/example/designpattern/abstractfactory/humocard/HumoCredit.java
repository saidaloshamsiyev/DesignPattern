package org.example.designpattern.abstractfactory.humocard;

import org.example.designpattern.abstractfactory.card.Card;

/**
 * Conscrete Product: Humo Credit Card
 */
public class HumoCredit implements Card {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Humo Credit Card.");
    }
}
