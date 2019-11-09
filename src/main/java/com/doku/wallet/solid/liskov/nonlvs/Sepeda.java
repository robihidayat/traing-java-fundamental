package com.doku.wallet.solid.liskov.nonlvs;

/**
 * @author robihidayat
 */
public class Sepeda extends Kendaraan {

    @Override
    public void pindahGigi(int gigi) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void laju() {
        jarakTempuh += 20;
    }
}
