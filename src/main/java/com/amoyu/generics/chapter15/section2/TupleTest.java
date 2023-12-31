package com.amoyu.generics.chapter15.section2;

public class TupleTest {
    static TwoTuple<String,Integer> f(){
        return new TwoTuple<String,Integer>("hi",47);
    }

    static TwoTuple f2(){
        return new TwoTuple("hi",47);
    }

    static ThreeTuple<Amphibian,String,Integer> g(){
        return new ThreeTuple<>(new Amphibian(),"hi",47);
    }

    public static FourTuple<Vehicle, Amphibian, String, Integer> h() {
        return new FourTuple<>(new Vehicle(), new Amphibian(), "hi", 47);
    }

    public static FourTuple<String,String, String, String> s() {
        return new FourTuple<>("new Vehicle()", "new Amphibian()", "hi", "47");
    }

    static FiveTuple<Vehicle,Amphibian,String,Integer,Double> k(){
        return new FiveTuple<>(new Vehicle(),new Amphibian(),"hi",47,11.1);
    }

    public static void main(String[] args) {
        TwoTuple<String, Integer> ttsi = f();
        System.out.println(ttsi);
        System.out.println(f2());
        System.out.println(g());
        System.out.println(h());
        System.out.println(k());
    }
}
