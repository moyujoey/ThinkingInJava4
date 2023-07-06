package com.amoyu.generics.chapter15.section4.practice;


public class practice10 {

    public static <A,B,String> void f(A a, B b, String str){
        System.out.println(a.getClass().getSimpleName());
        System.out.println(b.getClass().getSimpleName());
        System.out.println(str.getClass().getSimpleName());
    }

    public static void main(String[] args) {
        practice10.f(55.6,55,"666");
    }
}

