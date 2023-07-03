package com.amoyu.generics.chapter15.section8;

public class GenericArray<T> {

    private T[] array;

    public GenericArray(int size) {
        this.array =(T[]) new Object[size];
    }

    public void put(int index, T item){
        array[index] = item;
    }

    public T get(int index){
        return array[index];
    }

    public T[] rep(){
        return array;
    }
    public static void main(String[] args) {
        GenericArray<Integer> gai = new GenericArray<>(10);
        Integer[] rep = gai.rep();
        Object[] oa = gai.rep();
    }

}
