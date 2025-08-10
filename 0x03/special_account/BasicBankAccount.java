import exceptions.InvalidOperationException;

public class BasicBankAccount {

    String acountNumber;
    double balance;
    double annualInterestRate;

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return acountNumber;
    }

    BasicBankAccount(String accountNumber, double annualInterestRate) {
        this.acountNumber = accountNumber;
        this.annualInterestRate = annualInterestRate;
        this.balance = 0d;
    }

    public void deposit(double value) throws InvalidOperationException {
        if (value <= 0d) {
            throw new InvalidOperationException(
                "Deposit amount must be greater than 0"
            );
        }

        balance += value;
    }

    public void withdraw(double value) throws InvalidOperationException {
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
    
    public double calculateMonthlyFee() {
        if (balance * 0.1d < 10d) {
            return balance * 0.1d;
        }
        else {
            return 10d;
        }
    }
    
    public double calculateMonthlyInterest() {
        if (balance < 0) {
            return 0d;
        }
        
        return balance * (annualInterestRate / 100) / 12;
    }
    
    public void applyMonthlyUpdate() {
        balance = balance - calculateMonthlyFee() + calculateMonthlyInterest();
    }
    
}
