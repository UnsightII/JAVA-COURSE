
import java.util.Scanner;
import java.util.Stack;

public class StackBracket {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Balance Bracket: ");
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
