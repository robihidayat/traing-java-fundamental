package com.doku.wallet.solid.liskov.nonlvs;

/**
 * @author robihidayat
 */
public abstract class Kendaraan {

    protected int jarakTempuh = 0;
    protected int gigi = 0;

    public abstract void pindahGigi(int gigi);

    public abstract void laju();

    public int getGigi() {
        return this.gigi;
    }

    public int getJarakTempuh(){
        return this.jarakTempuh;
    }
}
