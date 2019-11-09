package com.doku.wallet.solid.liskov.nonlvs;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author robihidayat
 */
class SepedaTest {

    @Test
    void test() {
        ArrayList<Kendaraan> o = new ArrayList<>();
        o.add(new Sepeda());
        o.add(new Mobil());
        o.add(new Mobil());
        SepedaTest.tryMethod(o);
    }

    private static void tryMethod(List<Kendaraan> k) {
        for(Kendaraan kend:k) {
            kend.pindahGigi(2);
            kend.laju();
        }
    }
}