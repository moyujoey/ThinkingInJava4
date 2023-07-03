package com.amoyu.generics.chapter15.section9;

import java.awt.*;

public class BasicBounds {
    public static void main(String[] args) {
        Solid<Bounded> boundedSolid = new Solid<>(new Bounded());
        boundedSolid.color();
        boundedSolid.getY();
        boundedSolid.weight();
    }
}

interface HasColor{
    java.awt.Color getColor();
};
class Colored<T extends HasColor>{
    T item;
    T getItem(){
        return item;
    }
    java.awt.Color color(){
        return item.getColor();
    }
}

class Dimension{
    public int x,y,z;
}


class ColorDimension<T extends Dimension & HasColor>{
    T item;

    public ColorDimension(T item) {
        this.item = item;
    }

    T getItem(){
        return item;
    }

    java.awt.Color color(){
        return item.getColor();
    }

    int getX(){
        return item.x;
    }
    int getY(){
        return item.y;
    }
    int getZ(){
        return item.z;
    }
}

interface Weight{
    int weight();
}

class Solid<T extends Dimension & HasColor & Weight>{
    T item;

    public Solid(T item) {
        this.item = item;
    }

    T getItem(){
        return item;
    }

    java.awt.Color color(){
        return item.getColor();
    }

    int getX(){
        return item.x;
    }
    int getY(){
        return item.y;
    }
    int getZ(){
        return item.z;
    }

    int weight(){
        return item.weight();
    }

}

class Bounded extends Dimension implements HasColor,Weight{

    @Override
    public Color getColor() {
        return null;
    }

    @Override
    public int weight() {
        return 0;
    }
}
