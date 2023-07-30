package accounts;

public class WithdrawTransaction extends Transaction {
    @Override
    public void perform_trasaction() {
        System.out.println("Perform Withdraw Transaction");
    }
}
