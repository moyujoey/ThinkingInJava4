package com.amoyu.generics.chapter15.section6.practice;

import com.amoyu.generics.chapter15.section3.Generator;
import com.amoyu.generics.chapter15.section4.Generators;

import java.util.ArrayList;
import java.util.Random;

public class practice19 {
    public static void main(String[] args) {
        System.out.println(new CargoShip(3,2));
    }
}

class Product {
    private final int id;
    private String description;
    private int weight;

    public Product(int IDnumber, String descr, int weight) {
        id = IDnumber;
        description = descr;
        this.weight = weight;
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", weight=" + weight +
                '}';
    }

    public static Generator<Product> generator =
            new Generator<Product>() {
                private Random rand = new Random(47);

                @Override
                public Product next() {
                    return new Product(rand.nextInt(1000), "货物", rand.nextInt(1000));
                }
            };
}

class Warehouse extends ArrayList<Product> {
    public Warehouse(int nProduct){
        Generators.fill(this,Product.generator,nProduct);
    }
}

class CargoShip extends ArrayList<Warehouse>{
    public CargoShip(int nWarehouse,int nProduct){
        for(int i=0;i<nWarehouse;i++){
            add(new Warehouse(nProduct));
        }
    }

    @Override
    public String toString() {
        int count = 1;
        StringBuilder result = new StringBuilder();
        for(Warehouse w:this){
            result.append("Warehouse" + (count++));
            result.append("\n");
            for(Product p:w){
                result.append("  " + p);
                result.append("\n");
            }
        }
        return result.toString();
    }
}