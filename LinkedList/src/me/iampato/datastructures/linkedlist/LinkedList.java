package me.iampato.datastructures.linkedlist;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class LinkedList {
    private class Node {
        private String value;
        private Node nextNode;

        public Node(String v) {
            value = v;
        }
    }

    private Node first;
    private Node last;

    // addFirst
    public void addFirst(String value) {
        var node = new Node(value);
        // check if the first node is empty
        if (first == null) {
            first = last = node;
        } else {
            // 10 -> 20
            // we want to add 5, we need to link 5 to the current 1st node then
            // assign a new first node
            // 5(node) -> 10(first) -> 20
            node.nextNode = first;
            first = node;
        }
    }

    // addLast
    public void addLast(String value) {
        var node = new Node(value);
        // check if list is empty
        if (first == null) {
            first = last = node;
        } else {
            // 10 -> 20
            // we want to add 30, we need to link 30 to the last node(20) then
            // assign a new last node(30)
            // 10 -> 20(current last) -> 30(new last)
            last.nextNode = node;
            last = node;
        }
    }

    // size
    public int size() {
        int length = 0;
        var current = first;
        while (current != null) {
            length++;
            current = current.nextNode;
        }
        return length;
    }

    // to array
    public String[] toArray() {
        String[] array = new String[size()];
        int index = 0;
        var current = first;
        while (current != null) {
            array[index] = current.value;
            index++;
            current = current.nextNode;
        }
        return array;
    }

    // removeFirst
    public void removeFirst() {
        // "A" -> "B" -> "C"
        // check first node is empty
        if (last == null || first == null) {
            throw new NoSuchElementException();
        }
        // there is only one item
        if(first == last){
            first = last = null;
            return;
        }
        // "B" needs to be the first element
        // So get B
        var secondNode = first.nextNode;
        first = secondNode;
    }

    // removeLast
    public void removeLast() {
        // "A" -> "B" -> "C" -> "D"
        // check first node is empty
        if (last == null || first == null) {
            throw new NoSuchElementException();
        }
        // there is only one item
        if(first == last){
            first = last = null;
            return;
        }

        // we need to find "C" and we know "D"
        // the relationship is the nextNode for C is equal to D
        // iterate
        // now we have "C" in secondLastNode
        // we need to set secondLastNode nextNode to null
        // then set last node to secondLastNode
        var secondLastNode = getPreviousNode(last);
        secondLastNode.nextNode = null;
        last = secondLastNode;
    }

    private Node getPreviousNode(Node e) {
        var current = first;
        while (current != null) {
            if (current.nextNode == e) {
                break;
            } else {
                current = current.nextNode;
            }
        }
        return current;
    }

    // indexOf
    public int indexOf(String item) {
        int index = 0;
        var current = first;
        while (current != null) {
            if (current.value == item) {
                return index;
            } else {
                index++;
                current = current.nextNode;
            }
        }
        return -1;
    }

    // contains
    public boolean contains(String item) {
        return indexOf(item) != -1;
    }
}
