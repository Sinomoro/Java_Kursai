package lt.Sinomoro.uzdavinys7;

public class MyUtility {

    //7.2 uzduotyje metodas naudojamas taip
    //   MyUtility.printSortedDouble(vidurkiai,0,10);
    // vidurkiai kintamasis yra 7.1 uzduotyje apskai2iuoti vidurkiai
    public static void printSortedDouble(double[] array, double min, double max)
    {
        double last = max+1;
        int duplicate = -1;

        for(int i = 0; i<12; i++)
        {
            int holder = 0;
            double temp = min-1;
            for (int j = 11; j>=0; j--)
            {
                if (temp<array[j] && (array[j]<last || (array[j] == last && duplicate>j)))
                {
                    holder = j;
                    temp = array[j];
                }
            }
            System.out.println("Klases  " + (holder +1) + " Vidurkis : " + array[holder]);
            duplicate = holder;
            last= array[holder];
        }
    }
}
