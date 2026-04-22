import java.util.Scanner;
import java.util.Stack;

public class StackAct {
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    Stack<Character> stack = new Stack<>();
    String word;
    boolean isPalindrome = true;

    System.out.print("Enter a word: ");
    word = input.nextLine();

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
    input.close();
  }
}
