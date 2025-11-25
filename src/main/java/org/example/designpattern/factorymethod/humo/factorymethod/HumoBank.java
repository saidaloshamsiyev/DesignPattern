package org.example.designpattern.factorymethod.humo.factorymethod;

import org.example.designpattern.factorymethod.card.factorymethod.Bank;
import org.example.designpattern.factorymethod.card.Card;
import org.example.designpattern.factorymethod.humo.HumoCard;

/**
 * Concrete Creator for Humo Cards.
 */
public class HumoBank extends Bank {

    @Override
    public Card createCard() {
        return new HumoCard();
    }
}
