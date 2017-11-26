package lt.Sinomoro.Uzduotis11;

public class Zmogus {
    private String vardas;
    private String pavarde;
    private String asmensKodas;

    Zmogus(){}
    Zmogus(String vardas, String pavarde, String asmensKodas)
    {
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.asmensKodas = asmensKodas;
    }

    public String getFullName()
    {
        return this.vardas + " " +this.pavarde + " " + this.asmensKodas;
    }
    public String getName() {return this.vardas; }
    public String getSurname()
    {
        return this.pavarde;
    }
    public String getasmensKodas()
    {
        return this.asmensKodas;
    }

    public void setAsmensKodas(String newAsmensKodas) {this.asmensKodas = newAsmensKodas;}
    public void setName(String newName) {this.vardas = newName;}
    public void setSurname(String newSurname){this.pavarde = newSurname;}
}
