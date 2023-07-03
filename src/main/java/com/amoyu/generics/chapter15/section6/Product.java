package com.amoyu.generics.chapter15.section6;

import com.amoyu.generics.chapter15.section3.Generator;
import com.amoyu.generics.chapter15.section4.Generators;

import java.util.ArrayList;
import java.util.Random;

public class Product {
    private final int id;
    private String desc;
    private double price;

    public Product(int id, String desc, double price) {
        this.id = id;
        this.desc = desc;
        this.price = price;
       // System.out.println(toString());
    }

    public void priceChange(double change){
        this.price = change;
    }

    public String toString(){
        return id +":" + desc + ", price: $" + price;
    }

    public static Generator<Product> generator(){
        return new Generator<Product>() {
            Random random =new Random(47);
            @Override
            public Product next() {
                int i = random.nextInt(1000);
                return new Product(
                        i,
                        "Test",
                        Math.round(random.nextDouble()*1000.0)+0.99);
            }
        };
    }

}


class Shelf extends ArrayList<Product>{
    public Shelf(int nProducts){
        Generators.fill(this,Product.generator(),nProducts);
    }
}

class Aisle extends ArrayList<Shelf>{
    public Aisle(int nShelves,int nProducts){
        for (int i = 0; i < nShelves; i++) {
            add(new Shelf(nProducts));
        }
    }
}

class CheckoutStand{}
class Office{}


class Store extends ArrayList<Aisle>{
    private ArrayList<CheckoutStand> checkouts=new ArrayList<>();
    private Office office=new Office();

    public Store(int nAisles,int nShelves,int nProduces){
        for (int i = 0; i < nAisles; i++) {
            add(new Aisle(nShelves,nProduces));
        }
    }

    public String toString(){
        StringBuffer sb =new StringBuffer();
        for (Aisle a : this) {
            for (Shelf s : a) {
                for (Product product : s) {
                    sb.append(product);
                    sb.append("\n");
                }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(new Store(14,5,10));
    }
}
