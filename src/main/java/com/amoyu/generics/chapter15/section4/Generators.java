package com.amoyu.generics.chapter15.section4;

import com.amoyu.generics.chapter15.section3.Coffee;
import com.amoyu.generics.chapter15.section3.CoffeeGenerator;
import com.amoyu.generics.chapter15.section3.Generator;

import java.util.*;

public class Generators {
    public static <T> Collection<T> fill(Collection<T> coll, Generator<T> gen, int n){
        for (int i = 0; i < n; i++) {
            coll.add(gen.next());
        }
        return coll;
    }

    public static void main(String[] args) {
        Collection<Coffee> fill = fill(new ArrayList<>(), new CoffeeGenerator(), 5);
        for (Coffee p358Coffee : fill) {
            System.out.println(p358Coffee);
        }
    }
}
