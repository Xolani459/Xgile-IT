import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class AccountManager extends BankAccount {
    private String ownerName;
    private int AccountNumber;
    private float balance=0;
    private static  int AccNumCount=0;
    public AccountManager(String ownerName, float balance, int AccountNumber) {
        super(ownerName,balance,AccountNumber);
        this.ownerName=ownerName;
        this.balance=balance;
        this.AccountNumber=AccountNumber;
    }

    public void CreateAcc()
    {
        int AccountNum;
        float Balance;
        String OwnerName;
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the account number for the user:");
        AccountNum= sc.nextInt();
        System.out.println("What is the balance on the account number for the user:");
        Balance= (float)sc.nextInt();
        System.out.println("Please enter the Name for the user:");
        OwnerName= sc.nextLine();

        ArrayList<BankAccount> ba=new ArrayList<BankAccount>();

    }
    public static  int getAccNumCount()
    {
        return AccNumCount;
    }
    public  static void  setAccNumCount()
    {
        AccountManager.AccNumCount=AccNumCount;
    }
    public static  void IncrementAccNumCount()
    {
        AccNumCount++;
    }
    public static  void decrementAccNumCount()
    {
        AccNumCount--;
    }
    public void Delete()
    {
        int Index;
        Scanner sc=new Scanner(System.in);
        System.out.println("Delete account number at index :");
        Index= sc.nextInt();

    }

    public void Deposit(double amount)
    {
    BankAccount ba=new BankAccount(ownerName,balance,AccountNumber);
    ba.add(amount);
    }

    public  void Withdraw(double WithdrawalAmount)
    {
       if (WithdrawalAmount>balance)
       {
           System.err.println("Insufficient funds");
       }
       else
       {
           balance= (float) (balance-WithdrawalAmount);
       }
    }
    public String Display()
    {
        return "Name: "+ownerName+"\n "+"Balance: "+balance+"\n"+"Account Number: "+AccountNumber;
    }
    public  String getOwnerName()
    {
        return  null;
    }

}
