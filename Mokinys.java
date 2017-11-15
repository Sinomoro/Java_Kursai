public class Mokinys extends Zmogus implements Comparable<Mokinys> {
    private int klase;
    private int[] pazymiai = new int[20];

    Mokinys () {}

    Mokinys (String vardas, String pavarde, int klase)
    {
        super(vardas,pavarde);
        this.klase = klase;
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
        if(last == 0)
        {
            last =  au.klase - this.klase;
        }
        return last;
    }
}
