package Project;
import java.util.Scanner;

public class BankWithdraw{
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    int choose;
    double totalBalance = 1000;

    System.out.println("***************");
    System.out.println("BANKING PROGRAM");
    System.out.println("***************");

    do{
      System.out.println("1.Show Balance");
      System.out.println("2.Deposit");
      System.out.println("3.Withdraw");
      System.out.println("4.Exit"); 
      System.out.println("***************");
      System.out.print("Enter your choice (1-4): ");
      choose = input.nextInt();

      switch(choose){
        case 1:
          showBalance(totalBalance);
          break;

        case 2:
          totalBalance = deposit(totalBalance);
          showBalance(totalBalance);
          break;

        case 3:
          totalBalance = withdraw(totalBalance);
          showBalance(totalBalance);
          
          break;

        case 4:
          System.out.print("Exiting...");
          break;

        default:
          System.out.println("Invalid output.Pls Try again!");
          break;
      }
    }while(choose !=4);
    input.close();

  }

  public static void showBalance(double balance){
    System.out.println("***************");
    System.out.println("Your balance: "+ balance);
    System.out.println("***************");
  }

  public static double deposit(double balance){
    Scanner inputDeposit = new Scanner(System.in); 
    double inDeposit;

    System.out.print("Deposit: ");
    inDeposit = inputDeposit.nextDouble();

    return balance + inDeposit;
  }

  public static double withdraw(double balance){
  Scanner inputWithdraw = new Scanner(System.in); 
  double inWithdraw;

  System.out.print("Withdraw: ");
  inWithdraw = inputWithdraw.nextDouble();
    if(inWithdraw > balance){
      System.out.println("***************");
      System.out.println("Not enough balance");
    }else{
      return balance - inWithdraw;
    }
    return balance;
  }
}