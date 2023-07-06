package com.amoyu.generics.chapter15.section3.practice;

import com.amoyu.generics.chapter15.section3.Generator;

import java.util.Iterator;
import java.util.Random;

public class practice8 {
    public static void main(String[] args) {
        CharacterGenerator gen = new CharacterGenerator();
        for (int i = 0; i < 7; i++) {
            System.out.println(gen.next());
        }
        for (StoryCharacter p : new CharacterGenerator(7)) {
            System.out.println(p);
        }
    }

}

class StoryCharacter {
    private static long counter = 0;
    private final long id = counter++;

    public String toString() {
        return getClass().getSimpleName() + " " + id;
    }
}

class GoodGuy extends StoryCharacter {
    @Override
    public String toString() {
        return super.toString() + "is a good guy";
    }
}

class BadGuy extends StoryCharacter {
    @Override
    public String toString() {
        return super.toString() + "is a bad guy";
    }
}

class Morton extends BadGuy {
}

class Frank extends BadGuy {
}

class Harmonica extends GoodGuy {
}

class Cheyenne extends GoodGuy {
}


class CharacterGenerator implements Generator<StoryCharacter>, Iterable<StoryCharacter> {


    private Class[] types = {Morton.class, Frank.class, Harmonica.class, Cheyenne.class};

    private static Random random = new Random(47);

    private int size = 0;

    public CharacterGenerator() {
    }

    public CharacterGenerator(int size) {
        this.size = size;
    }

    @Override
    public StoryCharacter next() {
        try {
            return (StoryCharacter) types[random.nextInt(types.length)].newInstance();
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Iterator<StoryCharacter> iterator() {
        return new CharacterIterator();
    }


    class CharacterIterator implements Iterator<StoryCharacter> {

        int count = size;


        @Override
        public boolean hasNext() {
            return count > 0;
        }

        @Override
        public StoryCharacter next() {
            count--;
            return CharacterGenerator.this.next();
        }

        public void remove() { // Not implemented
            throw new UnsupportedOperationException();
        }
    }
}