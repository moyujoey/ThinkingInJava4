package com.amoyu.generics.chapter15.section2.practice;

public class practice2 {
    public static void main(String[] args) {
        Holder<String> holder = new Holder<>("a", "b", "c");
        System.out.println(holder.getA());
        System.out.println(holder.getB());
        System.out.println(holder.getC());
        holder.setA("f");
        System.out.println(holder.getA());

    }
}

class Holder<T>{
    private T a,b,c;

    public Holder(T a, T b, T c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public T getA() {
        return a;
    }

    public void setA(T a) {
        this.a = a;
    }

    public T getB() {
        return b;
    }

    public void setB(T b) {
        this.b = b;
    }

    public T getC() {
        return c;
    }

    public void setC(T c) {
        this.c = c;
    }
}