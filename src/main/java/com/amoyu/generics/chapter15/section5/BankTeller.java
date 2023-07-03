package com.amoyu.generics.chapter15.section5;

import com.amoyu.generics.chapter15.section4.Generators;

import java.util.*;

public class BankTeller {
    public static void serve(Teller t, Customer c) {
        System.out.println(t + " serves " + c);
    }

    public static void main(String[] args) {
        Random random = new Random(47);
        Queue<Customer> line = new LinkedList<>();
        Generators.fill(line,Customer.generator(),15);
        List<Teller> tellers = new ArrayList<>();
        Generators.fill(tellers,Teller.generator(),4);
        for (Customer customer : line) {
            serve(tellers.get(random.nextInt(tellers.size())),customer);
        }
    }
}
