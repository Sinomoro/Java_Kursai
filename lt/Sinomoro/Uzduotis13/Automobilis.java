package lt.Sinomoro.Uzduotis13;

public class Automobilis implements Comparable {
    private String numeris;
    private String marke;

    private Savininkas savininkas ;


    Automobilis(String numeris,String marke, String vardas, String pavarde)
    {
        this.numeris = numeris;
        this.marke = marke;
        this.savininkas = new Automobilis.Savininkas();
        this.savininkas.vardas = vardas;
        this.savininkas.pavarde = pavarde;
    }

    public String getNumeris() {
        return numeris;
    }

    public void setNumeris(String numeris) {
        this.numeris = numeris;
    }

    @Override
    public String toString() {
        return "Automobilis{" +
                "numeris='" + numeris + '\'' +
                ", marke='" + marke + '\'' +
                ", savininkas=" + savininkas +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Automobilis temp = (Automobilis) o;
        int res = 0;
        res = this.savininkas.pavarde.compareTo(temp.savininkas.pavarde);
        res = res == 0 ? this.savininkas.vardas.compareTo(temp.savininkas.vardas):res;
        res = res == 0 ? this.getNumeris().compareTo(temp.getNumeris()):res;
        return res;

    }

    private static class Savininkas
    {
       String vardas;

        String pavarde;

        @Override
        public String toString() {
            return "Savininkas{" +
                    "vardas='" + vardas + '\'' +
                    ", pavarde='" + pavarde + '\'' +
                    '}';
        }


    }
}
