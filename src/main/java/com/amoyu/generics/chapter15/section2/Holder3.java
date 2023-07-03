package com.amoyu.generics.chapter15.section2;

public class Holder3<T> {

    private T a;

    public Holder3(T a) {
        this.a = a;
    }

    public void set(T a){
        this.a = a;
    }

    public T get(){
        return a;
    }

    public static void main(String[] args) {
        Holder3<Automobile> h3 = new Holder3<>(new Automobile());
        Holder3<String> strH3 = new Holder3<>("");
        Holder3<Integer> intH3 = new Holder3<>(11);
        //
        Holder3<Automobile> holder3 = new Holder3<>(new Automobile());
        Automobile automobile = h3.get();
        String s = strH3.get();
        Integer integer = intH3.get();
        //h3.set("");
        //h3.set(1);
        h3.set(new Automobile());
    }
}


