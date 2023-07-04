package com.amoyu.generics.chapter15.section2.practice;

import com.amoyu.generics.chapter15.section2.Holder3;

public class practice1 {
    public static void main(String[] args) {
        Holder3<Pet> h = new Holder3<>(new Pet());
        Pet pet = h.get();
        h.set(new Cat());
        Pet pet1 = h.get();
        h.set(new Dog());
        Pet pet2 = h.get();
        System.out.println(pet);
        System.out.println(pet1);
        System.out.println(pet2);

    }
}

class Pet{
    public String toString() {
        return "Pet";
    }
}

class Cat extends Pet{
    @Override
    public String toString() {
        return "Cat";
    }
}

class Dog extends Pet{
    @Override
    public String toString() {
        return "Dog";
    }
}

