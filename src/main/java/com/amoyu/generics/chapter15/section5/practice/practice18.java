package com.amoyu.generics.chapter15.section5.practice;

import com.amoyu.generics.chapter15.section3.Generator;
import com.amoyu.generics.chapter15.section4.Generators;

import java.util.*;

public class practice18 {
    public static void eat(BigFish bf, LittleFish lf) {
        System.out.println(bf + " eat " + lf);
    }

    public static void main(String[] args) {
        Random rand = new Random(47);
        List<LittleFish> littleF = new LinkedList<LittleFish>();
        Generators.fill(littleF, LittleFish.generator(), 15);
        List<BigFish> bigF = new ArrayList<BigFish>();
        Generators.fill(bigF, BigFish.generator(), 3);
        for(LittleFish lf : littleF)
            eat(bigF.get(rand.nextInt(bigF.size())), lf);
    }
}

class LittleFish {
    private static long counter = 1;
    private final long id = counter++;
    private LittleFish() {}
    public String toString() { return "LittleFish " + id; }
    public static Generator<LittleFish> generator() {
        return new Generator<LittleFish>() {
            public LittleFish next() { return new LittleFish(); }
        };
    }
}

class BigFish {
    private static long counter = 1;
    private final long id = counter++;
    private BigFish() {}
    public String toString() { return "BigFish " + id; }
    public static Generator<BigFish> generator(){
        return  () -> new BigFish();
    }

}
