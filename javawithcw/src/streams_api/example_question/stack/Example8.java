// Sort a stack using only push() and pop() operations.
package streams_api.example_question.stack;

import java.util.Stack;

public class Example8 {
    public static void main(String[] args) {
        SortedStack<Integer> stack = new SortedStack<>();
        stack.push(54);
        stack.push(35);
        stack.push(48);
        stack.push(96);
        stack.push(102);
        stack.push(5);
        stack.display();

    }
}

class SortedStack<T extends Comparable<T>> {
    Stack<T> stack = new Stack<>();

    public void push(T data) {
        Stack<T> tempStack = new Stack<>();
        while (!stack.isEmpty() && (stack.peek().compareTo(data) <= 0)) {
            tempStack.push(stack.pop());
        }
        stack.push(data);
        while (!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }
    }

    public T pop() {
        if (stack.isEmpty()) {
            System.err.println("Underflow Occurred no element present in stack.");
            return null;
        } else {
            return stack.pop();
        }
    }

    public T peek() {
        if (stack.isEmpty()) {
            System.err.println("Underflow Occurred no element present in stack.");
            return null;
        } else {
            return stack.peek();
        }
    }


    public void display(){
        Stack<T> tempStack = new Stack<>();
        while(!stack.isEmpty()){
            System.out.println(stack.peek());
            tempStack.push(stack.pop());
        }
        while (!tempStack.isEmpty()){
            stack.push(tempStack.pop());
        }
    }
}

