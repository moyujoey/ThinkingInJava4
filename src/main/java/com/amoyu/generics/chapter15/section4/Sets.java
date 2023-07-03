package com.amoyu.generics.chapter15.section4;

import java.util.HashSet;
import java.util.Set;

public class Sets {

    //并集
    public static <T> Set<T> union(Set<T> one,Set<T> two){
        Set<T> result = new HashSet<>(one);
        result.addAll(two);
        return  result;
    }


    //交集
    public static <T> Set<T> intersection(Set<T> a,Set<T> b){
        Set<T> result =new HashSet<>(a);
        result.retainAll(b);
        return result;
    }

    //差集
    public static <T> Set<T> difference(Set<T> superset,Set<T> subset){
        Set<T> result = new HashSet<>(superset);
        result.removeAll(subset);
        return result;
    }

    public static <T> Set<T> complement(Set<T> a,Set<T> b){
        return difference(union(a,b),intersection(a,b));
    }
}