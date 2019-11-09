package com.doku.wallet.solid.open.notsolid;

/**
 * @author robihidayat
 */
public class Booking {

    private Payment payment;

    public Booking(Payment payment) {
        this.payment = payment;
    }

    private void makeBooking(String paymentType){

        if(paymentType.equals("CREDIT")){
            System.out.println("do payment with credit card");
            payment.creditCard();
        }

        if (paymentType.equals("WALLET")){
            System.out.println("do payment with wallet");
            payment.wallet();
        }

        if (paymentType.equals("DEBIT")){
            System.out.println("do payment with debit card");
            payment.debitCard();

        }

    }
}
