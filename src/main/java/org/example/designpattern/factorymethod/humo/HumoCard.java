package org.example.designpattern.factorymethod.humo;

import org.example.designpattern.factorymethod.card.Card;

/**
 * Concrete Product: Humo Card
 */
public class HumoCard implements Card {
    @Override
    public void cardInfo() {
        System.out.println("Humo created: 5614 **** **** 1234");
    }
}
