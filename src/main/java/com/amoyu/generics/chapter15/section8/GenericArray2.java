package com.amoyu.generics.chapter15.section8;

public class GenericArray2<T> {
    private Object[] array;

    public GenericArray2(int size) {
        this.array = new Object[size];
    }

    public void put(int index,int item){
        array[index] = item;
    }

    public T get(int index){
        return (T)array[index];
    }
    public T[] rep(){
        return (T[])array;
    }

    public static void main(String[] args) {
        GenericArray2<Integer> array2 = new GenericArray2(10);
        for (int i = 0; i < 10; i++) {
            array2.put(i,i);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(array2.get(i)+" ");
        }
        System.out.println();
        try{
            Integer[] rep = array2.rep();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
