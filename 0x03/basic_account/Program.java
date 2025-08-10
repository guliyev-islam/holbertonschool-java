public class Program {
        public static void main(String[] args) {
            try {
                BasicBankAccount account1 = new BasicBankAccount("AAA", 50.0);
                System.out.printf("Account %s - balance: 0,00\n", account1.getAccountNumber(), account1.getBalance());
                account1.deposit(100);
                System.out.printf("Account %s - balance: 100,00\n", account1.getAccountNumber(), account1.getBalance());
                account1.withdraw(25);
                System.out.printf("Account %s - balance: 75,00\n", account1.getAccountNumber(), account1.getBalance());
                account1.applyMonthlyUpdate();
                System.out.printf("Account %s - balance: 70,63\n\n", account1.getAccountNumber(), account1.getBalance());
            } catch (Exception ex) {
                System.out.println(ex.getMessage() + "\n");
            }

            try {
                BasicBankAccount account2 = new BasicBankAccount("BBB", 100.0);
                System.out.printf("Account %s - balance: 0,00\n", account2.getAccountNumber(), account2.getBalance());
                account2.deposit(10);
                System.out.printf("Account %s - balance: 10,00\n", account2.getAccountNumber(), account2.getBalance());
                account2.withdraw(10);
                System.out.printf("Account %s - balance: 0,00\n", account2.getAccountNumber(), account2.getBalance());
                account2.applyMonthlyUpdate();
                System.out.printf("Account %s - balance: 0,00\n\n", account2.getAccountNumber(), account2.getBalance());
            } catch (Exception ex) {
                System.out.println(ex.getMessage() + "\n");
            }

            try {
                BasicBankAccount account3 = new BasicBankAccount("CCC", 120.0);
                System.out.printf("Account %s - balance: 0,00\n", account3.getAccountNumber(), account3.getBalance());
                account3.deposit(1600);
                System.out.printf("Account %s - balance: 1600,00\n", account3.getAccountNumber(), account3.getBalance());
                account3.applyMonthlyUpdate();
                System.out.printf("Account %s - balance: 1750,00\n\n", account3.getAccountNumber(), account3.getBalance());
            } catch (Exception ex) {
                System.out.println(ex.getMessage() + "\n");
            }

            try {
                BasicBankAccount account4 = new BasicBankAccount("DDD", 70.0);
                System.out.printf("Account %s - balance: 0,00\n", account4.getAccountNumber(), account4.getBalance());
                account4.deposit(0);
            } catch (Exception ex) {
                System.out.println(ex.getMessage() + "\n");
            }

            try {
                BasicBankAccount account5 = new BasicBankAccount("EEE", 50.0);
                System.out.printf("Account %s - balance: 0,00\n", account5.getAccountNumber(), account5.getBalance());
                account5.deposit(25);
                System.out.printf("Account %s - balance: 25,00\n", account5.getAccountNumber(), account5.getBalance());
                account5.withdraw(30);
            } catch (Exception ex) {
                System.out.println(ex.getMessage() + "\n");
            }
        }
    }
