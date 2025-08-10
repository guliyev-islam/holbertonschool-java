import exceptions.InvalidOperationException;

public class FeeBasedBankAccount extends BasicBankAccount {
    
     FeeBasedBankAccount(String accountNumber, double annualInterestRate) {
         super(accountNumber, annualInterestRate);
     }

    private int transactionCount;

    @Override
    public void withdraw(double value) throws InvalidOperationException {
        
        balance -= 0.1d;
        if (value <= 0d) {
            throw new InvalidOperationException(
                "Withdrawal amount must be greater than 0"
            );
        }
        
        if (balance < value) {
            throw new InvalidOperationException(
                "Withdrawal amount must be less than the current balance"
            );
        }
        balance -= value;
    }

    @Override
    public void deposit(double value) throws InvalidOperationException {
        
        balance -= 0.1d;
        if (value <= 0d) {
            throw new InvalidOperationException(
                "Deposit amount must be greater than 0"
            );
        }
        balance += value;

    }

    public int getTransactionCount() {
        return transactionCount;
    }
}