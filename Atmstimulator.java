import java.util.Scanner;

public class Atmstimulator{
    public static void main(String args[]) {
        int balance = 5000, withdraw, deposit;
        int pinno=5656;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to PN ATM ! Please insert your card");
        System.out.println("Enter your pin:");
          int password=sc.nextInt();
        while (true) {
          if(password==pinno){
            System.out.println("*Automated Teller Machine*");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4.Change Pin");
            System.out.println("5. EXIT");
            System.out.print("Choose the operation you want to perform:");
          }
          else{
             System.out.println("Incorrect pin.Enter valid pin");
            }
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter money to be withdrawn:");

                    withdraw = sc.nextInt();

                    if (balance >= withdraw) {
                        balance = balance - withdraw;
                        System.out.println("Please collect your money");
                    } else {
                        System.out.println("Insufficient Balance");
                    }
                    System.out.println("");
                    break;

                case 2:

                    System.out.print("Enter money to be deposited:");

                    deposit = sc.nextInt();

                    balance = balance + deposit;
                    System.out.println("Your Money has been successfully deposited");
                    System.out.println("");
                    break;

                case 3:
                    System.out.println("Balance : " + balance);
                    System.out.println("");
                    break;

                case 4:
                System.out.println("Enter ur pin");
                   password=sc.nextInt();
                if(password==pinno){
                    System.out.println("enter new pin");
                    int user=sc.nextInt();
                    System.out.println("Your pin has been changed");
                }else{
                    System.out.println("Incorrect pin.Enter valid pin");
                }
                break;
                case 5:
                    
                    System.exit(0);
                default:
                    
                    System.out.println("Invalid Choice");
            }
        }
    }
  }



