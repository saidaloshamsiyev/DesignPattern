package org.example.designpattern.abstractfactory.humocard.factory;

import org.example.designpattern.abstractfactory.card.Card;
import org.example.designpattern.abstractfactory.card.factory.CardFactory;
import org.example.designpattern.abstractfactory.humocard.HumoCredit;
import org.example.designpattern.abstractfactory.humocard.HumoDebit;
import org.example.designpattern.abstractfactory.humocard.HumoVirtual;

/**
 * Conscrete Factory for Humo Cards
 */
public class HumoFactory implements CardFactory {
    @Override
    public Card createDebit() {
        return new HumoDebit();
    }

    @Override
    public Card createCredit() {
        return new HumoCredit();
    }

    @Override
    public Card createVirtual() {
        return new HumoVirtual();
    }
}
