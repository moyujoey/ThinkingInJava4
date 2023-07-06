package com.amoyu.generics.chapter15.section4.practice;

import com.amoyu.generics.chapter15.section2.TwoTuple;
import com.amoyu.generics.chapter15.section4.TupleTest2;

public class practice15 {

    public static void main(String[] args) {
        TwoTuple<String, Integer> f = TupleTest2.f();
        TwoTuple<String, Integer> f2 = TupleTest2.f2();
        System.out.println(f);
        System.out.println(f2);
    }
}
