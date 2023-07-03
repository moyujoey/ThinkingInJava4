package com.amoyu.generics.chapter15.section6;

import com.amoyu.generics.chapter15.section2.Amphibian;
import com.amoyu.generics.chapter15.section2.FourTuple;
import com.amoyu.generics.chapter15.section2.TupleTest;
import com.amoyu.generics.chapter15.section2.Vehicle;

import java.util.ArrayList;

public class TupleList<A,B,C,D> extends ArrayList<FourTuple<A,B,C,D>> {

    public static void main(String[] args) {
        TupleList<Vehicle, Amphibian, String, Integer> tl = new TupleList<>();
        TupleList<String, String, String, String> ss = new TupleList<>();
        tl.add(TupleTest.h());
        tl.add(TupleTest.h());
        ss.add(TupleTest.s());
        ss.add(TupleTest.s());
        for (FourTuple<Vehicle, Amphibian, String, Integer> i : tl) {
            System.out.println(i);
        }

        for (FourTuple<String, String, String, String> s : ss) {
            System.out.println(s);
        }
    }
}
