package com.amoyu.generics.chapter15.section4.practice;

import com.amoyu.generics.chapter15.section3.Coffee;
import com.amoyu.generics.chapter15.section3.CoffeeGenerator;
import com.amoyu.generics.chapter15.section3.Generator;

import java.util.*;

public class practice13 {

    public static <T> Collection<T> fill(Collection<T> coll, Generator<T> gen, int n){
        for (int i = 0; i < n; i++) {
            coll.add(gen.next());
        }
        return coll;
    }

    public static <T> List<T> fill(List<T> coll, Generator<T> gen, int n){
        for (int i = 0; i < n; i++) {
            coll.add(gen.next());
        }
        return coll;
    }

    public static <T> LinkedList<T> fill(LinkedList<T> coll, Generator<T> gen, int n){
        for (int i = 0; i < n; i++) {
            coll.add(gen.next());
        }
        return coll;
    }


    public static <T> Queue<T> fill(Queue<T> coll, Generator<T> gen, int n){
        for (int i = 0; i < n; i++) {
            coll.add(gen.next());
        }
        return coll;
    }

    public static <T> Set<T> fill(Set<T> coll, Generator<T> gen, int n){
        for (int i = 0; i < n; i++) {
            coll.add(gen.next());
        }
        return coll;
    }

    public static void main(String[] args) {
        Collection<Coffee> fill = fill(new ArrayList<>(), new CoffeeGenerator(), 5);
        Collection<Coffee> linkedFill = fill(new LinkedList<>(), new CoffeeGenerator(), 5);
        Collection<Coffee> arrayFill = fill(new ArrayList<>(), new CoffeeGenerator(), 5);
        for (Coffee p358Coffee : fill) {
            System.out.println(p358Coffee);
        }
    }
}
