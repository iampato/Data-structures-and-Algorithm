package me.iampato.datastructures.stacks;

public class Stacks {
    private int top;
    private int[] list;

    public Stacks(int maxValue){
        // we can later grow the list
        list = new int[maxValue];
        top = -1;
    }

    public boolean isEmpty(){
        return top == -1;
    }
    public void push(int value){
        
    }
}
