package com.amoyu.generics.chapter15.section4.practice;

import com.amoyu.generics.chapter15.section2.TwoTuple;
import com.amoyu.generics.chapter15.section4.New;

import java.util.List;
import java.util.Map;

public class practice12 {
    static void f(List<TwoTuple<Character,String>> list) {
        list.add(new TwoTuple<>('c',"C"));
        System.out.println(list);
    }
    static void g(Map<Integer,String> map) {
        map.put(1,"a");
        map.put(2,"b");
        System.out.println(map);
    }

    public static void main(String[] args) {
        g(New.map());
        f(New.list());
    }

}
