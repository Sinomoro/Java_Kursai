public class U_3_1_Trikampiai
{
    public int[][] ilgiai = {{3,4,5},{2,10,8},{5,6,5},{5,5,5}};

    public boolean arTrikampis(int m)
    {
        int max = 0;
        int sum =0;

        // surandam didžiausios kraštinės ilgį
        for(int i = 0; i < 3; i++)
        {
            if(ilgiai[m][i]>max)
            {
                max = ilgiai[m][i];
            }
        }

        //surandam kraštinių ilgių sumą
        for(int i = 0; i < 3; i++)
        {
                sum+=ilgiai[m][i];
        }
        sum-=max; //surandam trumpesnių trikampio kraštinių ilgių sumą(krastiniu suma be ilgiausios krastines)

        if (sum>max)// jeigu ilgiausia kraštinė yra trumpesnė negu trumpesnių kraštinių ilgiu suma, tada kraštinės gali sudaryti trikampį
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    private void koksTaiTrikampis(int m) {
        if (arTrikampis(m)) {
            //Ar lygiakrasštis
            if ((ilgiai[m][0] == ilgiai[m][1]) && (ilgiai[m][1] == ilgiai[m][2])) {
                System.out.println("Trikampis yra lygiakraštis");
            } else if ((ilgiai[m][0] == ilgiai[m][1]) || (ilgiai[m][1] == ilgiai[m][2]) || (ilgiai[m][0] == ilgiai[m][2])) {
                System.out.println("Trikampis yra lygiaašonis");
            } else {
                System.out.println("Trikampis yra įvairiašonis");
            }
        } else {
            System.out.println("Kraštinės nesudaro trikampio");
        }
    }




    public static void main(String[] args) {

        U_3_1_Trikampiai test =new U_3_1_Trikampiai();
        test.koksTaiTrikampis(0);
        test.koksTaiTrikampis(1);
        test.koksTaiTrikampis(2);
        test.koksTaiTrikampis(3);

    }
}
