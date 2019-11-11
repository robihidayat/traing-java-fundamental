package com.doku.wallet.solid.intersegregation.not;

/**
 * @author robihidayat
 */
public class OnlineCashPayment implements InteracePayment {

    @Override
    public void savePaymentDetails() {

    }

    @Override
    public void saveCardDetails() {
        // this function not relevant with cash payment, because cash payment dosent have any card
    }
}
