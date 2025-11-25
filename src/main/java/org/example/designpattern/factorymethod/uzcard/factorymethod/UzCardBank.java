package org.example.designpattern.factorymethod.uzcard.factorymethod;

import org.example.designpattern.factorymethod.card.factorymethod.Bank;
import org.example.designpattern.factorymethod.card.Card;
import org.example.designpattern.factorymethod.uzcard.UzCard;

/**
 * Concrete Creator for UzCard Bank.
 */
public class UzCardBank extends Bank {

    @Override
    public Card createCard() {
        return new UzCard();
    }
}
