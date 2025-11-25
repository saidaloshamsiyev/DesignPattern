package org.example.designpattern.abstractfactory;

import org.example.designpattern.abstractfactory.card.Card;
import org.example.designpattern.abstractfactory.card.factory.CardFactory;
import org.example.designpattern.abstractfactory.humocard.HumoCredit;
import org.example.designpattern.abstractfactory.humocard.HumoDebit;
import org.example.designpattern.abstractfactory.humocard.HumoVirtual;
import org.example.designpattern.abstractfactory.humocard.factory.HumoFactory;
import org.example.designpattern.abstractfactory.uzcard.UzCardVirtual;
import org.example.designpattern.abstractfactory.uzcard.UzcardCredit;
import org.example.designpattern.abstractfactory.uzcard.UzcardDebit;
import org.example.designpattern.abstractfactory.uzcard.factory.UzcardFactory;

/**
 * @author Saidalo Shamsiyev
 */
public class TestingFactory {
    public static void main(String[] args) {

        CardFactory factory = new HumoFactory();

        Card credit = factory.createCredit();
        Card virtual = factory.createVirtual();
        Card debit = factory.createDebit();


        credit.pay(1000);
        virtual.pay(1000);
        debit.pay(1000);

        /**
         * Abstract Factory Pattern bo'lmasa quyidagicha yozilishi kerak edi
         */

//        String type = "Uzcard";
//
//        Card credit;
//        Card debit;
//        Card virtual;
//
//        if (type.equalsIgnoreCase("Uzcard")) {
//
//            credit = new UzcardCredit();
//
//            debit = new UzcardDebit();
//
//            virtual = new UzCardVirtual();
//
//        } else if (type.equalsIgnoreCase("Humo")) {
//
//            credit = new HumoCredit();
//
//            debit = new HumoDebit();
//
//            virtual = new HumoVirtual();
//
//        } else {
//
//            throw new IllegalArgumentException("Unsupported card type: " + type);
//
//        }
//
//
//        credit.pay(1000);
//        debit.pay(2000);
//        virtual.pay(3000);

    }
}
