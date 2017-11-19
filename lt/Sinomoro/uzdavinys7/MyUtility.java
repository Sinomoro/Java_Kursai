package lt.Sinomoro.uzdavinys7;

public class MyUtility {

    enum enum_SortOrder
    {
        DESCENDING,
        ASCENDING
    }
    //7.2 uzduotyje metodas naudojamas taip
    // MyUtility.printSortedDouble(vidurkiai,0,10, MyUtility.enum_SortOrder.DESCENDING);
    // vidurkiai kintamasis yra 7.1 uzduotyje apskaičiuoti vidurkiai


    /*
     * Šis metodas tiesiogiai nerūšiuoja masyvo, tiktai atitinakma tvarka spausdina masyvo elementus.
     * Toks metodas buvo pasirinktas, nes 7,2 uzduotyje rūsiuojamas masyvas remesi masyvo elemento numeriu kaip klasės numerio reprezentacija.
     * Beto toks metodas gali būti universalesnis, ir panaudotas ateityje kituose projektuose.
     *
     */
    public static void printSortedDouble(double[] array, double min, double max, enum_SortOrder order)
    {

        double last;
        int duplicate;
        if(order == enum_SortOrder.DESCENDING)
        {
            last = max+1;
            duplicate = -1;
        }
        else
        {
            last = min-1;
            duplicate = -1;
        }
        for(int i = 0; i<12; i++)
        {
            int holder = 0;
            double temp = (order == enum_SortOrder.DESCENDING)?(min-1):(max+1);
            for (int j = 11; j>=0; j--)
            {
                boolean duplicateButNotSameNumber = (array[j] == last && duplicate>j) ;
                boolean changeValueFlag = (order == enum_SortOrder.DESCENDING)?(temp<array[j] && (array[j]<last || duplicateButNotSameNumber)):(temp>array[j] && (array[j]>last || duplicateButNotSameNumber ));
                if (changeValueFlag)
                {
                    holder = j;
                    temp = array[j];
                }
            }
            //System.out.println("Klases  " + (holder +1) + " Vidurkis : " + array[holder]); //Nelygiuotas tekstas
            System.out.printf("Klases  %2d  Vidurkis : %5.2f %n", (holder +1),array[holder]);
            duplicate = holder;
            last= array[holder];
        }
    }
}
