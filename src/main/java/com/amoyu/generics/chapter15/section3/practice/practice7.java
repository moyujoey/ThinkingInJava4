package com.amoyu.generics.chapter15.section3.practice;

import com.amoyu.generics.chapter15.section3.Fibonacci;

import java.util.Iterator;

public class practice7 {
    public static void main(String[] args) {
        for(int i:new IterableFibonacci(18)){
            System.out.print(i + " ");
        }
        System.out.println("");
    }

}

class IterableFibonacci implements Iterable<Integer> {
    private Fibonacci fib = new Fibonacci();
    private int n;
    public IterableFibonacci(int count){
        n = count;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return n>0;
            }

            @Override
            public Integer next() {
                n--;
                return fib.next();
            }
            public void remove() { // Not implemented
                throw new UnsupportedOperationException();
            }
        };
    }
}

