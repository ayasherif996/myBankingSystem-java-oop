package accounts;

public class SavingsAccount extends Account{


    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getInterest() {
        return interest;
    }


    private double interestRate;
    private double interest ;

    public void calculate_interest(){
      interest= (interestRate/100)*0.14;
        System.out.println("Your interest is " + interest);
    }
}
