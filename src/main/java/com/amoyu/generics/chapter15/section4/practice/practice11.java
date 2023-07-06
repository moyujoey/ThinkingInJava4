package com.amoyu.generics.chapter15.section4.practice;

import com.amoyu.generics.chapter15.section4.New;
import net.mindview.util.TwoTuple;

import java.util.LinkedList;
import java.util.Map;

public class practice11 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = New.linkedList();
        linkedList.add("6");
        linkedList.add("7");
        System.out.println(linkedList);
        Map<String, TwoTuple<String,Object>> map = New.map();
        map.put("two", new TwoTuple<>("aa", "bb"));
        TwoTuple<String, Object> tuple = map.get("two");
        System.out.println(tuple.toString());
    }
}
