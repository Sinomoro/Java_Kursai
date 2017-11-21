package lt.Sinomoro.Uzdavinys9;

public class Employee implements Payment {

    private String type;
    private String name;
    private int accountNumber;
    private double amount;


    Employee(int accountNumber, String name, double amount)
    {
        this.type = "Darbuotojas";
        this.accountNumber = accountNumber;
        this.name = name;
        this.amount = amount;
    }
    @Override
    public String getType(){return type;}


    @Override
    public int getBankAccount() {
        return accountNumber;
    }

    @Override
    public String getAccountOwner() {
        return name;
    }

    @Override
    public double getAmount() {
        return amount;
    }
}
