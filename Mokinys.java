public class Mokinys extends Zmogus {
    private int classNumber;

    public enum enum_priority
    {
        NAME,
        SURNAME,
        CLASS,
    }

    Mokinys () {}

    Mokinys (String vardas, String pavarde, int klase)
    {
        super(vardas,pavarde);
        this.classNumber = klase;
    }


    public int getClassNumber()
    {
        return classNumber;
    }

    public int compare(Mokinys mokinys,enum_priority compareBy)
    {
        int res =0;
        switch (compareBy)
        {
            case NAME:
                res = this.getName().compareTo(mokinys.getName());
                break;
            case SURNAME:
                res = this.getSurname().compareTo(mokinys.getSurname());
                break;
            case CLASS:
                res = this.getClassNumber() -mokinys.getClassNumber();
                break;
        }
        return res;
    }


}
