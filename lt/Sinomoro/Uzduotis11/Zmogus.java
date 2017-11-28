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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Zmogus zmogus = (Zmogus) o;

        if (vardas != null ? !vardas.equals(zmogus.vardas) : zmogus.vardas != null) return false;
        if (pavarde != null ? !pavarde.equals(zmogus.pavarde) : zmogus.pavarde != null) return false;
        return asmensKodas != null ? asmensKodas.equals(zmogus.asmensKodas) : zmogus.asmensKodas == null;
    }

    @Override
    public int hashCode() {
        int result = vardas != null ? vardas.hashCode() : 0;
        result = 31 * result + (pavarde != null ? pavarde.hashCode() : 0);
        result = 31 * result + (asmensKodas != null ? asmensKodas.hashCode() : 0);
        return result;
    }
}
