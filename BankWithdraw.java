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
      System.out.println("Show Balance");
      System.out.println("Deposit");
      System.out.println("Withdraw");
      System.out.println("Exit"); 
      System.out.println("***************");
      System.out.print("Enter your choice (1-4): ");
      choose = input.nextInt();

      switch(choose){
        case 1:
          System.out.println("***************");
          System.out.println("Your balance: "+ totalBalance);
          System.out.println("***************");
          break;

        case 2:
          totalBalance = deposit(totalBalance);
          System.out.println("***************");
          System.out.println("Total Balance: "+totalBalance);
          System.out.println("***************");
          break;

        case 3:
          totalBalance = withdraw(totalBalance);
          System.out.println("***************");
          System.out.println("Total Balance: "+totalBalance);
          
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