package com.amoyu.generics.chapter15.section8;

import java.lang.reflect.Array;

public class GenericArrayWithTypeToke<T> {
    private T[] array;
    public GenericArrayWithTypeToke(Class<T> type, int size) {
        array = (T[]) Array.newInstance(type, size);
    }

    public void put(int size,T item){
        array[size] = item;
    }

    public T get(int size){
        return array[size];
    }

    public T[] rep(){
        return array;
    }

    public static void main(String[] args) {
        GenericArrayWithTypeToke<String> withTypeToke = new GenericArrayWithTypeToke<>(String.class, 10);
        for (int i = 0; i < 10; i++) {
            withTypeToke.put(i,i+"");
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(withTypeToke.get(i));
        }

        String[] rep = withTypeToke.rep();
        for (String s : rep) {
            System.out.println(s);
        }

    }
}
