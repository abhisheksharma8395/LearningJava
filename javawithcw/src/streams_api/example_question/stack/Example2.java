// Check if a given expression has balanced parentheses using a stack.
package streams_api.example_question.stack;


import java.util.Stack;

public class Example2 {
    public static boolean isValidParenthesis(String string){
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < string.length(); i++) {
            if(string.charAt(i) == '(' || string.charAt(i) == '{' || string.charAt(i) == '[') stack.push(string.charAt(i));
            else if (!stack.isEmpty() && ((stack.peek() == '(' && string.charAt(i) == ')') ||
                    (stack.peek() == '{' && string.charAt(i) == '}') || (stack.peek() == '[' && string.charAt(i) == ']'))) {
                stack.pop();
            }
            else return false;
        }
        if(stack.isEmpty()) return true;
        return false;
    }

    public static void main(String[] args) {
        String[] strings = {"(())","([])","(({()}))",")()"};
        for(String string : strings){
            System.out.println(string+" : "+isValidParenthesis(string));
        }
    }
}
