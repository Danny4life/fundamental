import java.time.LocalDateTime;
import java.time.Month;

public class BankAccount {

    String name;
    LocalDateTime opened;
    double balance;

    public BankAccount(String name, LocalDateTime opened, double balance) {
        this.name = name;
        this.opened = opened;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %f",
                this.name, this.opened.toString(), this.balance);
    }

    public BankAccount(){
        this.name = "segun";
        this.opened = LocalDateTime.now();
        this.balance = 0.0d;
    }


    public static void main(String[] args) {
        LocalDateTime opened = LocalDateTime.of(2023, Month.DECEMBER, 29, 06, 30, 00);
        BankAccount account = new BankAccount("dan", opened, 20.0);

        System.out.println(account.toString());

    }
}
