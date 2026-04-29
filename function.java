import java.util.Scanner;
public class function {
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    int size;
    int result;

    System.out.print("Enter how many number: ");
    size = input.nextInt();

    System.out.print("Enter the "+size+" number: ");
    int[] array = new int[size];
    for(int i = 0;i<array.length;i++){
      array[i] = input.nextInt();
    }

    result = sum(array);

    System.out.println("The sum of all number is: "+result);
    input.close();
  }
  public static int sum(int[] array){
    int sum = 0;
    for(int i = 0;i<array.length;i++){
      sum += array[i];
    }
    return sum;
  }
}
