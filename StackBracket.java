
import java.util.Scanner;
import java.util.Stack;

public class StackBracket {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();

        String postfix = "";
        System.out.print("Enter an infix: ");
        String infix = input.nextLine().toUpperCase();

        for (char c : infix.toCharArray()) {

            if (Character.isLetterOrDigit(c)) {
                postfix += c;
            }

            else if (c == '(') {
                stack.push(c);
            }

            else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfix += stack.pop();
                }
                stack.pop(); // remove '('
            }

            else { // operator
                while (!stack.isEmpty() && precedence(stack.peek()) >= precedence(c)) {
                    postfix += stack.pop();
                }
                stack.push(c);
            }
        }

        // pop remaining operators
        while (!stack.isEmpty()) {
            postfix += stack.pop();
        }

        System.out.println("Postfix: " + postfix);
    }

    public static int precedence(char c) {
        if (c == '+' || c == '-') return 1;
        if (c == '*' || c == '/') return 2;
        return -1;
    }
}
        /*System.out.print("Enter a Balance Bracket: ");
        String bracket = input.nextLine();

        if (isBalance(bracket)) {
            System.out.println("VALID");
        } else {
            System.out.println("INVALID");
        }

        input.close();
    }

    public static boolean isBalance(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {

            if (c == '{' || c == '[' || c == '(') {
                stack.push(c);
            } 
            else if (c == '}' || c == ']' || c == ')') {

                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.peek();

                if ((c == ')' && top == '(') ||
                    (c == ']' && top == '[') ||
                    (c == '}' && top == '{')) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
    /*PALYNDROME
    for(char c : word.toCharArray()){
      stack.push(c);
    }

    for(char c : word.toCharArray()){
      if(c != stack.pop()){
        isPalindrome = false;
        break;
      }
    }

    if(isPalindrome){
      System.out.println("Words are Palindrome!");
    }else{
      System.out.println("Words are not Palindrom!");
    }
    */

    /*REVERSE WORD 
    String word;

    System.out.print("Enter a word: ");
    word = input.nextLine();
    
    for(int i = 0;i<word.length();i++){
      stack.push(word.charAt(i));
    }
    System.out.println(stack);
    System.out.print('[');

    for(int i = 0;i<word.length();i++){
      System.out.print(stack.pop());
      if(i < word.length() - 1){
        System.out.print(", ");
      }
    }
    System.out.println(']');*/
