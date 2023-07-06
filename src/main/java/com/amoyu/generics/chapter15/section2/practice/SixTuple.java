package com.amoyu.generics.chapter15.section2.practice;

import com.amoyu.generics.chapter15.section2.FiveTuple;

public class SixTuple<A, B, C, D, E, F> extends FiveTuple<A, B, C, D, E> {
    public final F sixth;

    public SixTuple(A a, B b, C c, D d, E e, F f) {
        super(a, b, c, d, e);
        sixth = f;
    }

    @Override
    public String toString() {
        return "{" + first + ", " + second + ", " + third + ", " +
                fourth + ", " + fifth + ", " + sixth + '}';
    }
}
