public class U_3_2_Plotai extends U_3_1_Trikampiai
{
    private void trikampioPlotas(int m)
    {
        if (arTrikampis(m))
        {
            // trikampio plotas skaičiuojamas naudojantis "herono formule"
            double r = (ilgiai[m][0]+ilgiai[m][1]+ilgiai[m][2])/2.0;
            double E = r*(r-ilgiai[m][0])*(r-ilgiai[m][1])*(r-ilgiai[m][2]);
            E=Math.sqrt(E);
            System.out.println("Trikampio plotas = " + E);
        }
        else
        {
            System.out.println("Ne trikampis");
        }
    }

    public static void main(String[] args)
    {
        U_3_2_Plotai test = new U_3_2_Plotai();

        test.trikampioPlotas(0);
        test.trikampioPlotas(1);
        test.trikampioPlotas(2);
        test.trikampioPlotas(3);
    }
}
