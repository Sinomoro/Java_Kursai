package lt.Sinomoro.Uzdavinys6;

public class Mokinys extends Zmogus {
    private int klase;
    private int[] trimestras ;
    private double avrage;

    public enum enum_priority
    {
        NAME,
        SURNAME,
        CLASS,
        AVARAGE
    }

    Mokinys () {}

    Mokinys (String vardas, String pavarde, int klase)
    {
        super(vardas,pavarde);
        this.klase = klase;
    }

    Mokinys (String vardas, String pavarde, int klase, int[] pazymiai)
    {
        super(vardas,pavarde);
        this.klase = klase;
        this.trimestras = pazymiai;
    }

    public void calculateAVG()
    {
        int sum = 0;
        for(int pazimys:this.trimestras)
        {
            sum+=pazimys;
        }

        this.avrage = (double)sum/this.trimestras.length;
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
            case AVARAGE:
                if(this.getAvrage() == mokinys.getAvrage())
                {
                    res = 0;
                }
                else if ((this.getAvrage() - mokinys.getAvrage())>0)
                {
                    res = 1;
                }
                else
                {
                    res = -1;
                }
                break;
        }
        return res;
    }

    public int getClassNumber()
    {
        return klase;
    }

    public double getAvrage()
    {
        this.calculateAVG();
        return avrage;
    }

}
