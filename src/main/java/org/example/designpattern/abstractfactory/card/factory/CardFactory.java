package org.example.designpattern.abstractfactory.card.factory;

import org.example.designpattern.abstractfactory.card.Card;

/**
 * Abstract Factory
 */
public interface CardFactory {
    Card createDebit();

    Card createCredit();

    Card createVirtual();
}
