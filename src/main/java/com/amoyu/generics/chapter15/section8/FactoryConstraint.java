package com.amoyu.generics.chapter15.section8;

public class FactoryConstraint {
    interface FactoryI<T>{
        T create();
    }

    public static void main(String[] args) {
        new Foo2<>(new IntegerFactory());
        new Foo2<>(new Widget.Factory());
    }

}

class Foo2<T>{
    private T x;


    public <F extends FactoryConstraint.FactoryI<T>> Foo2(F factory){
        x = factory.create();
    }
}


class IntegerFactory implements FactoryConstraint.FactoryI<Integer>{

    @Override
    public Integer create() {
        return new Integer(0);
    }
}

class Widget{
    public static class Factory implements FactoryConstraint.FactoryI<Widget>{

        @Override
        public Widget create() {
            return new Widget();
        }
    }
}