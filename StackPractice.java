import java.util.Scanner;
import java.util.Stack;

public class StackPractice {
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);

    Stack <Character> stack = new Stack<>();

    String name;
    int choose;
    char letter;

    System.out.print("Enter your name: ");
    name = input.nextLine();

    for(int i = 0;i<name.length();i++){
        stack.push(name.charAt(i));
    }
    System.out.println(stack);
    
    //CHOOSE MENU
    do{
      System.out.println("Menu:");
      System.out.println("1. Push.");
      System.out.println("2. Pop.");
      System.out.println("4. Exit");
      System.out.print("Enter : ");
      choose = input.nextInt();
      switch (choose){
        case 1:
          System.out.print("Enter a character: ");
          letter = input.next().charAt(0);

          stack.push(letter);
          System.out.println();
          break;
        case 2:
          if(!stack.isEmpty()){
            stack.pop();
            break;
          }else{
            System.out.println("The stack is empty.Try again!");
          }
        case 4:
          break;
        default:
          System.out.println("Error.Pls try again");
          break;
      }
        System.out.println(stack);
    }while(choose != 4);
    input.close();
  }
}
