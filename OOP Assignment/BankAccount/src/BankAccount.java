import java.util.Scanner;

public class BankAccount  {
   private int AccountNumber;
   private float balance;
   private String ownerName;




    public  BankAccount(String ownerName,float balance,int AccountNumber){
    this.ownerName=ownerName;
    this.balance=balance;
    this.AccountNumber=AccountNumber;
   }


    public float balance()
    {
    System.out.println("Balance on the account number :"+ AccountNumber + " is :R"+balance);
    return balance;
    }
    public void add(double amount)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Add deposit amount of: ");
        amount= sc.nextDouble();
        balance= (float) (amount + balance);
    }
    public double subtract(double WithdrawalAmount)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the amount you want to withdraw");
        WithdrawalAmount= sc.nextDouble();
        balance = (float) (balance() - WithdrawalAmount);
        return balance;
    }
}
