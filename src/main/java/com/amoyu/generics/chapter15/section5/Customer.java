package com.amoyu.generics.chapter15.section5;

import com.amoyu.generics.chapter15.section3.Generator;

public class Customer {
    private static long counter =1;
    private final long id = counter++ ;
    private Customer(){}

    public String toString(){
        return "Customer " + id;
    }


    public static Generator<Customer> generator(){
        return new Generator<Customer>() {
            @Override
            public Customer next() {
                return new Customer();
            }
        };
    }
}
