import java.util.Scanner;
import java.util.Stack;

public class StackBracket {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    Stack<Character> stack = new Stack<>();
    
    char[] bracket = {'{','[','(',')',']','}'};
    char top;

    for(int i = 0;i<bracket.length;i++){
      if(bracket[i] == '{' || bracket[i] == '[' || bracket[i] == '('){
        stack.push(bracket[i]); 
      }

      else{
        if(stack.isEmpty()){
          System.out.println("It does not matches!");
          return;
        }
        top = stack.peek();

        if(!stack.isEmpty()){

          if(bracket[i] == ')' && stack.peek() == '(' ||
            bracket[i] == ']' && stack.peek() == '[' ||
            bracket[i] == '}' && stack.peek() == '{'){
            stack.pop();
          }else{
            System.out.println("It does not matches!");
            return; 
          }

        }
      }
    }

    if (stack.isEmpty()) {
      System.out.println("It matches!");
    } else {
      System.out.println("It does not match!");
    }
    
    System.out.println(stack);

    input.close();
  }
}