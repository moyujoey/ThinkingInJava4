package com.amoyu.generics.chapter15.section8;


class Building{}
class House extends Building{}


public class ClassTypeCapture <T>{
    Class<T> kind;

    public ClassTypeCapture(Class<T> kind) {
        this.kind = kind;
    }

    public boolean f(Object arg){
        return kind.isInstance(arg);
    }

    public static void main(String[] args) {
        ClassTypeCapture<Building> cct1 = new ClassTypeCapture<>(Building.class);
        System.out.println(cct1.f(new Building()));
        System.out.println(cct1.f(new House()));


        ClassTypeCapture<House> cct2 = new ClassTypeCapture<>(House.class);
        System.out.println(cct2.f(new Building()));
        System.out.println(cct2.f(new House()));
    }
}
