// Reverse a string using a stack (Stack).
package streams_api.example_question.stack;

import java.util.Stack;

public class Example3 {
    public static String reverseString(String string){
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < string.length(); i++) {
            stack.push(string.charAt(i));
        }
        StringBuilder stringBuilder = new StringBuilder();
        while(!stack.isEmpty()){
            stringBuilder.append(stack.pop());
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String[] strings = {"Virat","Dhoni","Rohit"};
        for(String string : strings){
            System.out.println(string +" -> "+reverseString(string));
        }
    }
}
