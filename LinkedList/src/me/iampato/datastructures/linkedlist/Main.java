package me.iampato.datastructures.linkedlist;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        var linkedList = new LinkedList();
        linkedList.addLast("B");
        System.out.println(Arrays.toString(linkedList.toArray()));
        linkedList.addLast("C");
        System.out.println(Arrays.toString(linkedList.toArray()));
        linkedList.addLast("D");
        System.out.println(Arrays.toString(linkedList.toArray()));
        linkedList.addLast("E");
        System.out.println(Arrays.toString(linkedList.toArray()));
        linkedList.addFirst("A");
        System.out.println(Arrays.toString(linkedList.toArray()));
        linkedList.removeFirst();
        System.out.println(Arrays.toString(linkedList.toArray()));
        linkedList.removeLast();
        System.out.println(Arrays.toString(linkedList.toArray()));
        //
        System.out.println(linkedList.indexOf("C"));
        System.out.println(linkedList.contains("D"));
        System.out.println(linkedList.contains("A"));
    }
}
