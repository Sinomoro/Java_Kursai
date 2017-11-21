package lt.Sinomoro.Uzdavinys9;

public interface Payment {
    int getBankAccount ();
    String getAccountOwner();
    double getAmount();
    String getType();
}
