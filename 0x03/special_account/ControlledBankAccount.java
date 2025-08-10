public class ControlledBankAccount extends BasicBankAccount {

    private double minimumBalance;
    private double penaltyAmount;

    ControlledBankAccount(
        String accountNumber,
        double annualInterestRate,
        double minimumBalance,
        double penaltyAmount
    ) {
        super(accountNumber, annualInterestRate);
        this.minimumBalance = minimumBalance;
        this.penaltyAmount = penaltyAmount;
    }

    public void applyMonthlyUpdate() {
        if (balance < minimumBalance) {
            balance = balance -
                penaltyAmount -
                calculateMonthlyFee() +
                calculateMonthlyInterest();
        } else {
            balance = balance - calculateMonthlyFee() + calculateMonthlyInterest();
        }
    }
}
