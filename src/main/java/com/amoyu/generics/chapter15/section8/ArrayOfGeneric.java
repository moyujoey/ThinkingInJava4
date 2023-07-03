package com.amoyu.generics.chapter15.section8;

public class ArrayOfGeneric {
    static final int SIZE = 100;
    static Generic<Integer>[] gia;

    public static void main(String[] args) {
        // gia = (Generic<Integer> []) new Object[SIZE];
        gia = (Generic<Integer>[]) new Generic[SIZE];
        System.out.println(gia.getClass().getSimpleName());
        gia[0] = new Generic<Integer>();
        //gia[1] = new Object();
        //gia[2] = new Generic<Double>();

    }

}
