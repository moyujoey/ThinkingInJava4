package com.amoyu.generics.chapter15.section4.practice;

import com.amoyu.generics.chapter15.section3.Generator;
import com.amoyu.generics.chapter15.section4.BasicGenerator;
import com.amoyu.generics.chapter15.section4.CountedObject;

public class practice14 {
    public static void main(String[] args) {
        Generator<CountedObject> gen = BasicGenerator.create(CountedObject.class);
        Generator<CountedObject> gen2 = new BasicGenerator<>(CountedObject.class);
        for (int i = 0; i < 5; i++) {
            System.out.println(gen.next());
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(gen2.next());
        }
    }
}
