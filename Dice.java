import java.util.Scanner;
public class Dice {
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    int roll;
    int randomValue;

    System.out.println("************************");
    System.out.print("Enter how many roll: ");
    roll = input.nextInt();

    for(int i = 0;i<roll;i++){
      randomValue = (int)(Math.random() * 6) + 1;
      System.out.println("The roll no "+(i+1));
      showDice(randomValue);
      System.out.println();
    }
    input.close();

  }
  public static void showDice(int random){
    switch(random){
      case 1:
        System.out.println("===============");
        System.out.println("||           ||");
        System.out.println("||     *     ||");
        System.out.println("||           ||");
        System.out.println("===============");
        break;
      case 2:
        System.out.println("===============");
        System.out.println("||         * ||");
        System.out.println("||           ||");
        System.out.println("|| *         ||");
        System.out.println("===============");
        break;
      case 3:
        System.out.println("===============");
        System.out.println("||         * ||");
        System.out.println("||     *     ||");
        System.out.println("|| *         ||");
        System.out.println("===============");
        break;
      case 4:
        System.out.println("===============");
        System.out.println("|| *       * ||");
        System.out.println("||           ||");
        System.out.println("|| *       * ||");
        System.out.println("===============");
        break;
      case 5:
        System.out.println("===============");
        System.out.println("|| *       * ||");
        System.out.println("||     *     ||");
        System.out.println("|| *       * ||");
        System.out.println("===============");
        break;
      case 6:
        System.out.println("===============");
        System.out.println("|| *       * ||");
        System.out.println("|| *       * ||");
        System.out.println("|| *       * ||");
        System.out.println("===============");
        break;
    }
  }
}
