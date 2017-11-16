package lt.Sinomoro.uzdavinys7;

public class Zmogus {
    private String name;
    private String surname;

    Zmogus (){}
    Zmogus (String name, String surname)
    {
        this.name = name;
        this.surname = surname;
    }

    public String getFullName()
    {
        return this.name + " " +this.surname;
    }
    public String getName() {return this.name; }
    public String getSurname()
    {
        return this.surname;
    }

    public void setName(String newName) {this.name = newName;}
    public void setSurname(String newSurname){this.surname = newSurname;}
}
