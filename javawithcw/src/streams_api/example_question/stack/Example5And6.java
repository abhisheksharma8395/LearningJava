//  Given a stack of integers, find the minimum element in constant time.
//  Implement a stack that supports the getMin() operation in O(1) time.



package streams_api.example_question.stack;

import java.util.Stack;

public class Example5And6 {
    public static void main(String[] args) {
        StackOperation<Integer> stackOperation = new StackOperation<>();
        stackOperation.push(7);
        System.out.println(stackOperation.getMin());
        stackOperation.push(9);
        System.out.println(stackOperation.getMin());
        stackOperation.push(14);
        System.out.println(stackOperation.getMin());
        stackOperation.push(6);
        System.out.println(stackOperation.getMin());
        stackOperation.push(12);
        System.out.println(stackOperation.getMin());
        stackOperation.pop();
        System.out.println(stackOperation.getMin());
        stackOperation.pop();
        System.out.println(stackOperation.getMin());
        stackOperation.pop();
        System.out.println(stackOperation.getMin());

    }
}

class StackOperation<T extends Comparable<T>>{
    Stack<T> stack = new Stack<>();
    Stack<T> minStack = new Stack<>();

    public void push(T data){
        if(stack.isEmpty()){
            stack.push(data);
            minStack.push(data);
        }
        else{
            if(data.compareTo(minStack.peek()) <= 0){
                minStack.push(data);
            }
            else{
                minStack.push(minStack.peek());
            }
            stack.push(data);
        }
    }

    public T pop(){
        if(stack.isEmpty()){
            System.err.println("Underflow Occurred no element present in stack.");
            return null;
        }
        else{
            minStack.pop();
            return stack.pop();
        }
    }

    public T peek(){
        if(stack.isEmpty()){
            System.err.println("Underflow Occurred no element present in stack.");
            return null;
        }
        else{
            return stack.peek();
        }
    }

    public T getMin(){
        if(minStack.isEmpty()){
            System.err.println("Underflow Occurred no element present in stack.");
            return null;
        }
        else{
            return minStack.peek();
        }
    }

}
