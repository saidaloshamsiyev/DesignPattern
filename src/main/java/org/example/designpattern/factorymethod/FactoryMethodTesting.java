package org.example.designpattern.factorymethod;

import org.example.designpattern.factorymethod.card.Card;
import org.example.designpattern.factorymethod.card.factorymethod.Bank;
import org.example.designpattern.factorymethod.humo.HumoCard;
import org.example.designpattern.factorymethod.uzcard.UzCard;
import org.example.designpattern.factorymethod.uzcard.factorymethod.UzCardBank;

public class FactoryMethodTesting {
    public static void main(String[] args) {

        Bank uzcard = new UzCardBank();
        uzcard.issueCard();

    }

    /**
     * Agar Factory Method ishlatilmasa shu usul orqali card yaratish mumkin
     * lekin bu  har safar yangi card turi qo'shilganda
     * bu usulga o'zgartirish kiritish kerak bo'ladi
     * <p>
     * Bu OCP VA SRP va TIGHT COUPLING ga zid
     *
     * @param type
     * @return type ga qarab card yaratadi
     */
    public Card createCard(String type) {
        if (type.equalsIgnoreCase("Humo")) {
            return new HumoCard();
        } else if (type.equalsIgnoreCase("UzCard")) {
            return new UzCard();
        } else {
            throw new IllegalArgumentException("Unknown card type: " + type);
        }
    }

}
