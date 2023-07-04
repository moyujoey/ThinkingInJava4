package com.amoyu.generics.chapter15.section2.practice;

import com.amoyu.generics.chapter15.section2.RandomList;

public class practice6 {
    private static void dump(RandomList<?> rl) {
        for(int i = 0; i < 11; i++){
            System.out.print(rl.select() + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        RandomList<String> rs = new RandomList<>();
        for(String s: ("The quick brown fox jumped over " +
                "the lazy brown dog").split(" ")){
            rs.add(s);
        }
        dump(rs);
        RandomList<Integer> ri = new RandomList<>();
        for(int i=0;i<11;i++){
            ri.add(i);
        }
        dump(ri);
        RandomList<Double> rc = new RandomList<>();
        for(int i=0;i<11;i++){
            rc.add((double)i);
        }
        dump(rc);
    }
}
