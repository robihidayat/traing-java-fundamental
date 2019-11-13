package com.doku.wallet.seven;

import java.util.Date;

/**
 * @author robihidayat
 */
public class MagicNumber {


    public static void main(String[] args) {
        Model model = new Model();
        sevenParameter("name", "age", "color", new Date(), new Date(), "additional", false);
        modelParameter(model);
    }

    static void sevenParameter(String name,
                               String age,
                               String color,
                               Date starDate,
                               Date endDate,
                               String additional,
                               boolean status){

        System.out.println(name);
        System.out.println(age);
        System.out.println(color);
        System.out.println(starDate);
        System.out.println(endDate);
        System.out.println(additional);
        System.out.println(status);
    }

    static void modelParameter(Model model){
        System.out.println(model.toString());
    }


}
