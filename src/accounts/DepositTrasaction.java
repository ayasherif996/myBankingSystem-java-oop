package accounts;

public class DepositTrasaction extends Transaction {

    @Override
    public void perform_trasaction() {
        System.out.println("Perform Deposite Transaction");
    }
}
