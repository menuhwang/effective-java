package ch2.item7;

import java.util.Arrays;

public class Stack {
    private static final int DEFAULT_INIT_CAPACITY = 16;
    private Object[] elements;
    private int size = 0;

    Stack() {
        elements = new Object[DEFAULT_INIT_CAPACITY];
    }

    void push(Object o) {
        elements[size++] = o;
    }

    Object pop() {
//        return elements[--size];
        Object result = elements[--size];
        elements[size] = null;
        return result;
    }

    int size() {
        return size;
    }

    void print() {
        System.out.println(Arrays.toString(elements));
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.push("D");

        System.out.println(stack.size());
        stack.print();

        stack.pop();
        stack.pop();

        System.out.println(stack.size());
        stack.print();
    }
}
