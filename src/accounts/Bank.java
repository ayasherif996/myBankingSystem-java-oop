package accounts;

public class Bank extends BankAccount implements BankingSystem{
    private String email;
    private String phone_number;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    @Override
    public void create_acc() {
        System.out.println("Your account is created");
    }

    @Override
    public void deposite_money() {
        System.out.println("you added money in your balance ");
    }

    @Override
    public void withdraw_money() {
        System.out.println("you withdrawed money");
    }

    @Override
    public void view_balance() {
        System.out.println("Wow!! You have a huge balance");
    }
}
