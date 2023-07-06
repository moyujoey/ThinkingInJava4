package com.amoyu.generics.chapter15.section4.practice;

import com.amoyu.generics.chapter15.section2.practice.SixTuple;


public class practice16 {
    static SixTuple f(){
        return new SixTuple(1,1.0,'c',"str",true,new Integer(4));
    }

    public static void main(String[] args) {
        System.out.println(f());
    }
}
