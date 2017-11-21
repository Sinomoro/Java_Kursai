package lt.Sinomoro.Uzdavinys9;

public class Main {

    public static void main (String[] args) {
        Payment[] paychecks = new Payment[5];

        paychecks[0] = new Client(12345677, "UAB Megn", 3423);
        paychecks[1] = new Client(12546754, "UAB LOGS", 5235);
        paychecks[2] = new Employee(32347654, "Rodriguez", 123);
        paychecks[3] = new Client(12393456, "UAB Lang", 6889);
        paychecks[4] = new Employee(42349876, "Juan", 80);

        System.out.println("Payout information :");
        System.out.println("--------------------------------------------------------");
        System.out.println("|    Title    |    Name    | Account Number |  Amount  |");
        System.out.println("--------------------------------------------------------");
        for (Payment payout : paychecks) {
            System.out.printf("| %-11s | %-10s | %-14d | %8.2f |\n", payout.getType(),payout.getAccountOwner(),payout.getBankAccount(),payout.getAmount());
        }
        System.out.println("--------------------------------------------------------");
    }

}
