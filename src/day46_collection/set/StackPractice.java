package day46_collection.set;

import java.util.Stack;

public class StackPractice {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("a");
        stack.push("b");
        stack.push("c");
        System.out.println(stack);
        System.out.println("At the top " + stack.peek());// checks what is on top of stack
        stack.pop();// removes element top of stack and return that
        System.out.println("At the top " + stack.peek());
        System.out.println(stack);

        System.out.println(stack.pop());// return top of stack
        System.out.println(stack);

        System.out.println(stack.get(0));// works because it has index, because it is implement of list

        // but Stack has own methods because as well - peek(), pop(), push() methods(not belongs to other class, only to Stack)

    }
}
