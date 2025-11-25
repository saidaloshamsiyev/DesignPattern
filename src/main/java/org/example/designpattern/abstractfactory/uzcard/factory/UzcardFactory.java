package org.example.designpattern.abstractfactory.uzcard.factory;

import org.example.designpattern.abstractfactory.card.Card;
import org.example.designpattern.abstractfactory.card.factory.CardFactory;
import org.example.designpattern.abstractfactory.uzcard.UzCardVirtual;
import org.example.designpattern.abstractfactory.uzcard.UzcardCredit;
import org.example.designpattern.abstractfactory.uzcard.UzcardDebit;

/**
 * Concrete Factory for Uzcard cards.
 */
public class UzcardFactory implements CardFactory {
    @Override
    public Card createDebit() {
        return new UzcardDebit();
    }

    @Override
    public Card createCredit() {
        return new UzcardCredit();
    }

    @Override
    public Card createVirtual() {
        return new UzCardVirtual();
    }
}
