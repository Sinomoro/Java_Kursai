public class Zmogus {
    private String vardas;
    private String pavarde;

    Zmogus (){}
    Zmogus (String vardas, String pavarde)
    {
        this.vardas = vardas;
        this.pavarde = pavarde;
    }

    public String getFullName()
    {
        return this.vardas + " " +this.pavarde;
    }
    public String getName() {return this.vardas; }
    public String getSurname()
    {
        return this.pavarde;
    }
}