
public class BankAccount {
    private String accountHolderName;
    private double balance;
    private double minimumBalance;

    public BankAccount(String accountHolderName, double balance, double minimumBalance) {
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.minimumBalance = minimumBalance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }
    public double getBalance() {
        return balance;
    }
    
    public void setMinBal(double newMinimumBalance){
        this.minimumBalance = newMinimumBalance;
    }

    public void withdraw(double amount){
        if(balance - amount < minimumBalance){
            System.out.println("Error: You do not have sufficient Minimum Balance.");
        }
        else{
            this.balance -= amount;
            System.out.println("Withdraw Successfull!"+"\nBalance after withdrawal: " + getBalance());
        }
    }
    public static void main(String [] args)
    {
        BankAccount ac1 = new BankAccount("Nithin", 1000.0, 100);
        ac1.withdraw(500.0);
        ac1.withdraw(1000);
        ac1.setMinBal(200.0);
        ac1.withdraw(500);
        ac1.withdraw(300);

        BankAccount ac2 = new BankAccount("Priya", 1000.0, 200);
        ac2.withdraw(1000.0); // forgot to call setMinBal()
    } 
}
