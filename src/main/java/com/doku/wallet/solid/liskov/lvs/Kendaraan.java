package com.doku.wallet.solid.liskov.lvs;

/**
 * @author robihidayat
 */
public abstract class Kendaraan {

    protected int jarakTempuh = 0;


    public abstract void laju();


    public int getJarakTempuh(){
        return this.jarakTempuh;
    }

}
