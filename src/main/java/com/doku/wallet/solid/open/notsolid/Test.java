package com.doku.wallet.solid.open.notsolid;

/**
 * @author robihidayat
 *
 */
public class Test {

    protected static String test;

    static Payment booking = new Payment();


     static void test() {
         final String test;
        Payment payment = new Payment();
        booking.debitCard();
        test = "sas";
    }

    public void test2() {
        Payment payment = new Payment();
        booking.debitCard();
        test();
    }

    public static void main(String[] args) {
         Thread thread = new Thread(() -> System.out.println(test));
         thread.start();
        test();



    }

}
