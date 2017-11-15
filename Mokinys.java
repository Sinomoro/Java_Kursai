public class Mokinys extends Zmogus implements Comparable<Mokinys> {
    private int klase;
   public int[] trimestras ;

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


    public int getKlase()
    {
        return klase;
    }

    public int compareTo(Mokinys au){
        /*
         šio metodo kodas buvo rastas interneto psl :https://beginnersbook.com/2013/12/java-arraylist-of-object-sort-example-comparable-and-comparator/
        ir pritaikys turimai užduočiai
         */
        int last = this.getSurname().compareTo(au.getSurname());
        last = (last == 0) ? (this.getName().compareTo(au.getName())) :(last);
        last = (last == 0) ? (au.klase - this.klase) :(last);// taisyt sita vieta
        return last;
    }

}
