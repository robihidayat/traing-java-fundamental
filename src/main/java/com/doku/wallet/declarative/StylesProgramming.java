package com.doku.wallet.declarative;

import java.util.*;

/**
 * @author robihidayat
 */
public class StylesProgramming {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Dory");
        names.add("Gill");
        names.add("Bruce");
        names.add("Nemo");
        names.add("Darla");
        names.add("Marlin");
        names.add("Jacques");

        imperative(names);
        declarative(names);
        declarativeInStream(names);
        declarativeInStream2(names);

    }


    static void imperative(List<String> names){
        //Find if Nemo is in the list
        //imperative
        boolean found = false;
        for(String name: names) {
            if(name.equals("Nemo")) {
                found = true;
                break;
            }
        }
        if(found)
            System.out.println("Nemo found");
        else
            System.out.println("Nemo not found");
    }


    static void declarative(List<String> names){
        //Find if Nemo is in the list
        //declative
        if(names.contains("Nemo"))
            System.out.println("Nemo found");
        else
            System.out.println("Nemo not found");
    }

    static void declarativeInStream(List<String> names){

        System.out.println(names.stream()
                .filter(e->e.equals("Dry"))
                .count());
    }

    static void declarativeInStream2(List<String> names){

        System.out.println(names.stream()
                .filter(e->e.contains("Nemo"))
                .findFirst()
                .orElse("Nemo not found"));
    }


}
