import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class BubbleSort {
  public static void main(String[]args){
  Scanner input = new Scanner(System.in);
  Queue<Character>queue = new LinkedList<Character>();
  String word;
  boolean isRunning = true;
  int choice;
  char letter;

  System.out.print("Enter a word: ");
  word = input.nextLine();

  for(char c : word.toCharArray()){
    queue.add(c);
  }
  while(isRunning){
    System.out.println("Menu:");
    System.out.println("1. Enqueue");
    System.out.println("2. Dequeue");
    System.out.println("3. Display");
    System.out.println("4. Exit");
    System.out.print("Enter your choice: ");
    choice = input.nextInt();
    
    switch(choice){
      case 1:
        System.out.print("Enter a letter to add: ");
        letter = input.next().charAt(0);
        queue.add(letter);
        break;
      case 2:
        if(!queue.isEmpty()){
          queue.remove();
        }else{
          System.out.println("Error. Queue is Empty!");
        }
        break;
      case 3:
        System.out.print("Container array list: ");
        for(char c : queue){
          System.out.print(c+" ");
        }
        System.out.println();
        break;
      case 4:
        isRunning = false;
        break;  
      }

  }
  input.close();
  }
}
  
  /*System.out.println("Enter the number of strings: ");
  size = input.nextInt();
  input.nextLine();

  String[] word = new String[size];
  for(int i = 0;i<word.length;i++){
    System.out.print("Enter string #"+(i+1)+": ");
    word[i] = input.nextLine();
    }

  Arrays.sort(word,String.CASE_INSENSITIVE_ORDER);

  System.out.println("\nSorted strings:");
  for(String s : word){
    System.out.println(s);
    }
    input.close();
  }
}*/
/*int[] array = {3,1,2,4,5};

    bubbleSort(array);

    for(int i : array){
      System.out.println(" "+i);
    }
  }

  public static void bubbleSort(int array[]){
    for(int i = 0;i< array.length -1;i++){
      for(int j = 0;j < array.length - i - 1;j++){
        if(array[j]<array[j+1]){
          int temp = array[j];
          array[j] = array[j+1];
          array[j+1] = temp; 
        }
      }
    }*/
