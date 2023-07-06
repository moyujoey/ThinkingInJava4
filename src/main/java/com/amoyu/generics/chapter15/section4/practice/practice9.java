package com.amoyu.generics.chapter15.section4.practice;

public class practice9 {
    public static void main(String[] args) {
        GenericMethods gm = new GenericMethods();
        gm.f(" ",6,new GenericMethods());
    }
}

class GenericMethods{
    public <A,B,C> void f(A a, B b, C c){
        System.out.println(a.getClass().getSimpleName());
        System.out.println(b.getClass().getSimpleName());
        System.out.println(c.getClass().getSimpleName());
    }
}
