package Stack;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Stack;

public class StackUndo {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    Stack<String> stack = new Stack<>();
    int choice;
    String add;

    while (true) {
      System.out.println("**********");
      System.out.println("Stack: " + stack);
      System.out.println("1. Undo");
      System.out.println("2. Add");
      System.out.println("3. Exit");
      System.out.print("Pick your choice: ");

      try{
          choice = input.nextInt();
          input.nextLine();
        }catch(InputMismatchException e){
          System.out.println("Invalid input. Try again.");
          input.nextLine();
          continue;
        }

      System.out.println("**********");

      if (choice == 1) {
        if (!stack.isEmpty()) {
          stack.pop();
        }else{
          System.out.println("Stack is Empty!");
        }

      } else if (choice == 2) {
        System.out.print("Add a word: ");
        add = input.nextLine();
        stack.push(add);

      } else if (choice == 3) {
        System.out.println("Exiting...");
        break;

      } else {
        System.out.println("Invalid input.Try Again!");
      }
    }

    input.close();
  }
}