package Strings;

import java.util.Scanner;
import java.util.Stack;

public class checkParanthesis {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter expression: ");
        String input = sc.nextLine();
        Stack<Character> stack = new Stack<>();
        boolean isValid = true;
        for (char ch : input.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else if (ch == ')' || ch == ']' || ch == '}') {
                if (stack.isEmpty()) {
                    isValid = false;
                    break;
                }
                char top = stack.pop();
                if ((ch == ')' && top != '(') || (ch == ']' && top != '[') || (ch == '}' && top != '{')) {
                    isValid = false;
                    break;
                }
            }
        }
        if (!stack.isEmpty()) {
            isValid = false;
        }
        System.out.println("Output: " + isValid);
        sc.close();
    }
}
