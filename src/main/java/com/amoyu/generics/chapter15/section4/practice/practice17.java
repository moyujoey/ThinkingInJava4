package com.amoyu.generics.chapter15.section4.practice;

import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;

public class practice17 {
    public enum Numbers{
        ONE,TWO,THREE,FOUR,FIVE,SIX
    }

    public static void main(String[] args) {
        Set<Numbers> set1 = EnumSet.range(Numbers.ONE,Numbers.THREE);
        Set<Numbers> set2 = EnumSet.range(Numbers.ONE,Numbers.TWO);
        System.out.println("set1：" + set1);
        System.out.println("set2：" + set2);
        System.out.println("union(set1,set2)：" + Sets.union(set1,set2));
        System.out.println("intersection(set1,set2)：" + Sets.intersection(set1,set2));
        System.out.println("difference(set1,set2)：" + Sets.difference(set1,set2));
        System.out.println("complement(set1,set2)：" + Sets.complement(set1,set2));
    }
}

class Sets{
    @SuppressWarnings("unchecked")
    protected static <T> Set<T> copy(Set<T> s) {
        if(s instanceof EnumSet)
            return ((EnumSet)s).clone();
        return new HashSet<T>(s);
    }

    //并集
    public static <T> Set<T> union(Set<T> a, Set<T> b) {
        Set<T> result = copy(a);
        result.addAll(b);
        return result;
    }
    //交集
    public static <T> Set<T> intersection(Set<T> a, Set<T> b) {
        Set<T> result = copy(a);
        result.retainAll(b);
        return result;
    }
    //差集
    public static <T> Set<T> difference(Set<T> superset, Set<T> subset) {
        Set<T> result = copy(superset);
        result.removeAll(subset);
        return result;
    }
    //包含除了交集以外的所有元素
    public static <T> Set<T> complement(Set<T> a, Set<T> b) {
        return difference(union(a, b), intersection(a, b));
    }
}
