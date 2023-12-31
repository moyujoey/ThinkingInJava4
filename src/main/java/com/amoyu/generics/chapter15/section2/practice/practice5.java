package com.amoyu.generics.chapter15.section2.practice;

public class practice5 {

    public static void main(String[] args) {
        LinkedStack<String> lss = new LinkedStack<>();
        for(String s : "ww oo pp".split(" ")){
            lss.push(s);
        }
        String s;
        while((s = lss.pop()) != null){
            System.out.println(s);
        }
    }
}
class LinkedStack<T>{
    private class Node {
        T item;
        Node next;
        Node() { item = null; next = null; }
        Node(T item, Node next) {
            this.item = item;
            this.next = next;
        }
        boolean end() { return item == null && next == null; }
    }

    private Node top = new Node();
    public void push(T item) { top = new Node(item, top); }
    public T pop() {
        T result = top.item;
        if(!top.end())
            top = top.next;
        return result;
    }

}