package org.example.designpattern.factorymethod.card.factorymethod;

import org.example.designpattern.factorymethod.card.Card;

/**
 * Create a Bank interface as the Product in the Factory Method pattern.
 */
public abstract class Bank {

    /**
     * Factory Method
     *
     *
     */
    public abstract Card createCard();


    /**
     * Bussiness Method
     */
    public void issueCard() {
        Card card = createCard();
        card.cardInfo();
    }
}
