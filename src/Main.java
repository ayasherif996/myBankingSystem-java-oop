import accounts.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        /*   Two ways :
 1- Array to hold the customers I want to create accounts for them and take
     the input from user.
The solution of way 1 is to uncomment the statements in the constructor of BankAccount class
           and write the following statements from line 13 to 17
        System.out.print("How many number of customers do you want to input? ");
        int num_customers = input.nextInt();
        for (int i = 0; i < A1.length; i++) {
          A1[i] = new BankAccount();
        }
      
2- create any number of objects from the class "BankAccount"
          and pass the values of customers for creating accounts for them .(I used this)
         */
        BankAccount A1 = new BankAccount();
        BankAccount a= new Account();
        Account b= new Account();
        //Customer 1
        A1.setAccount_holder_name("Aya");
        System.out.println( A1.getAccount_holder_name());
        A1.setAccount_number("01070510992");
        System.out.println(A1.getAccount_number());
         ((Account) a).setAcc_type("Personal Account");
        System.out.println(((Account) a).getAcc_type());
        A1.deposit_money(300);
        System.out.println("Your balance is "+ A1.getBalance());
        A1.withdraw_money(400);


        System.out.println("-------------------------------------------------------");
        //Customer 2
        BankAccount A2 = new BankAccount();
        A2.setAccount_holder_name("Gehad");
        System.out.println(A2.getAccount_holder_name());
        A2.setAccount_number("01002553492");
        System.out.println( A2.getAccount_number());
        b.setAcc_type("Payroll Account");
        System.out.println( b.getAcc_type());
        A2.deposit_money(600);
        System.out.println("Your balance is  " +  A2.getBalance());
        A2.withdraw_money(300);

    System.out.println("-------------------------------------------------------------");
//Test the Savings and Checking Accounts
        SavingsAccount s1= new SavingsAccount();
        s1.setInterestRate(20);
        s1.calculate_interest();
        System.out.println("----------------------------------------------------------");
        CheckingAccount c1 = new CheckingAccount();
        c1.check_issues();

     //Test the Bank class "Additional info for the Bank Accounts"
        Bank B1 = new Bank();
        B1.setEmail("aya.sherif@vodafone.com");
        B1.setPhone_number("01070510992");
        B1.create_acc();
        B1.deposite_money();
        B1.withdraw_money();
        B1.view_balance();


    //To access  the override methods from Transaction Class
        Transaction T1= new WithdrawTransaction();
        T1.perform_trasaction();
        Transaction T2 = new DepositTrasaction();
        T2.perform_trasaction();


    }
}