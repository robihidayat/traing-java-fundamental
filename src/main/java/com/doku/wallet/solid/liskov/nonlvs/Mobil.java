package com.doku.wallet.solid.liskov.nonlvs;

/**
 * @author robihidayat
 */
public class Mobil extends Kendaraan {

    @Override
    public void pindahGigi(int gigi) {
        super.gigi = gigi;
    }

    @Override
    public void laju() {
        jarakTempuh += 60;
    }
}
