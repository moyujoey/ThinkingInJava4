package com.amoyu.generics.chapter15.section4;

import com.amoyu.generics.chapter15.section3.Generator;

public class BasicGenerator<T> implements Generator<T> {
    private Class<T> type;

    public BasicGenerator(Class<T> type) {
        this.type = type;
    }

    @Override
    public T next() {
        try {
            return type.newInstance();
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    public static <T> Generator<T> create(Class<T> type) {
        return new BasicGenerator<T>(type);
    }

    public static void main(String[] args) {
        Generator<String> stringGenerator = BasicGenerator.create(String.class);
        System.out.println(stringGenerator.next());
    }
}
