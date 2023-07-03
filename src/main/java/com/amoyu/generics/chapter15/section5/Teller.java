package com.amoyu.generics.chapter15.section5;

import com.amoyu.generics.chapter15.section3.Generator;

public class Teller {
    private static long counter = 1;
    private final long id = counter ++ ;

    public String toString(){
        return "Teller " + id;
    }

    private Teller(){}

    public static Generator<Teller> generator(){
        return new Generator<Teller>() {
            @Override
            public Teller next() {
                return new Teller();
            }
        };
    }
}
