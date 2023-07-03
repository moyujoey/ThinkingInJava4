package com.amoyu.generics.chapter15.section2;

public class FourTuple<A, B, C, D> extends ThreeTuple {
    public final D fourth;

    public FourTuple(A a, B b, C c, D d) {
        super(a, b, c);
        this.fourth = d;
    }

    public String toString() {
        return "(" + first + "," + second + "," + third + "," + fourth + ")";
    }
}
