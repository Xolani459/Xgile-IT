import java.util.ArrayList;
import java.util.List;

public class Bank {
    public static  void main(String[] args) {
        ArrayList<Object> ba=new ArrayList<Object>();
        ba.add(new AccountManager("John",100,1));

        ba.add( new AccountManager("John",115,2));

        ba.add(new AccountManager("John",257,3));

        ba.add(new AccountManager("John",489,4));

        ba.add( new AccountManager("John",570,5));

        for (int x=0;x<ba.size();x++)
        {
            AccountManager AccManage=(AccountManager)ba.get(x);
            AccManage.Deposit(250);
            AccManage.Withdraw(120);
            System.out.println(AccManage.Display());
            System.out.println(AccManage.balance());
        }


    }
}
