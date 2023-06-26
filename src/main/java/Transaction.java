import java.time.LocalDateTime;

public class Transaction {
    final BankAccount bankAccount;
    final LocalDateTime date;
    final double amount;

    public Transaction(BankAccount account, LocalDateTime date, double amount) {
        this.bankAccount = account;
        this.date = date;
        this.amount = amount;
    }



    public static void main(String[] args) {
        //Transaction trans = new Transaction();
    }
}
