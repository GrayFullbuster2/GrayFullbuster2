import java.util.*;
class bank{
    String name;
    String bank_type;
    long balance=0;
  
    public void get_data(String n,String BT,long B)
    {
        name=n;
        bank_type=BT;
        balance=B;
    }
    public void show_data()
    {
        System.out.println("Account Holder Name:"+name);
        System.out.println("Bank Type:"+bank_type);
        System.out.println("Bank Balance:"+balance);
    }
    public void deposit(int ammount)
    {
        balance +=ammount;
        System.out.println("Deposit amount is :"+ammount);
    }
    public void withdraw(int ammount2)
    {
        balance -=ammount2;
        System.out.println("Deposit amount is :"+ammount2);
    }
    public static  void main(String[] args)
    {
        bank s=new bank();
        System.out.println("ACCOUNT INFORMATION\n");
        s.get_data("YASH","SBI",2000);
        s.show_data();
        
        System.out.println("\nAfter Deposit current amount is");
        s.deposit(20);
        s.show_data();
        
        System.out.println("\nAfter Withdraw current amount is");
        s.withdraw(1000);
        s.show_data();
    }
}