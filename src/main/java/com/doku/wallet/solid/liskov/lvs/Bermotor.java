package com.doku.wallet.solid.liskov.lvs;

/**
 * @author robihidayat
 */
public class Bermotor extends Kendaraan {

    protected int gigi = 0;

    public void pindahGigi(int gigi) {
        this.gigi = gigi;
    }

    public int getGigi() {
        return this.gigi;
    }

    @Override
    public void laju() {

    }
}
