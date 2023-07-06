package com.amoyu.generics.chapter15.section2.practice;


import com.amoyu.generics.chapter15.section2.FiveTuple;

public class practice3 {
    public static void main(String[] args) {
        SixTuple sixTuple= new SixTuple<>("a","b","c","d","e",55);
        System.out.println(sixTuple.first);
        System.out.println(sixTuple);
    }


}

