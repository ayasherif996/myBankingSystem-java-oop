package accounts;

import java.util.*;

public class BankAccount {
    public void setAccount_holder_name(String account_holder_name) {
        this.account_holder_name = account_holder_name;
    }

    public void setAccount_number(String account_number) {
        this.account_number = account_number;
    }

    public String getAccount_number() {
        return account_number;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccount_holder_name() {
        return account_holder_name;
    }

    private String account_number;
    private String account_holder_name;
    private double balance = 0.0 ;
Scanner input = new Scanner(System.in);
  public  BankAccount(){
//      System.out.println("Please Enter your Account Number");
//         account_number= input.next();
//      System.out.println("Please Enter your name");
//         account_holder_name = input.next();
  }
  public void deposit_money(double money){
      balance+=money;
  }
  public void withdraw_money(double money){
      if(balance>money){
          balance-= money;
          System.out.println("Balance after withdrawal:"+balance);
      }else{
          System.out.println("ops!!your balance is less than the money you want to withdraw");

      }
  }

}
