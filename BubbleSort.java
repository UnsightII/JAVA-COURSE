import java.util.Scanner;
import java.util.Arrays;

public class BubbleSort {
  public static void main(String[]args){
  Scanner input = new Scanner(System.in);
  int size;
  
  System.out.println("Enter the number of strings: ");
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
  }
}
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
