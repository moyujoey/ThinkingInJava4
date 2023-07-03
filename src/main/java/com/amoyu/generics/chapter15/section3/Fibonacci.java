package com.amoyu.generics.chapter15.section3;

public class Fibonacci implements Generator<Integer> {
    private int count = 0;

    public Integer next(){
        return fib(count++);
    }

    private Integer fib(int i) {
        if(i <2 ){
            return 1;
        }
        return fib(i-2) + fib(i-1);
    }

    public static void main(String[] args) {
        Fibonacci p360Fibonacci = new Fibonacci();
        for (int i = 0; i < 18; i++) {
            System.out.println(p360Fibonacci.next()+" ");
        }
    }
}
