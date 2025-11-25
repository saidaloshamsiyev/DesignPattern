package org.example.designpattern.factorymethod.uzcard;

import org.example.designpattern.factorymethod.card.Card;

/**
 * Concrete Product: UzCard
 */
public class UzCard implements Card {
    @Override
    public void cardInfo() {
        System.out.println("UzCard: 8690 **** **** ****");
    }
}

