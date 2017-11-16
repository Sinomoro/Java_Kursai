package lt.Sinomoro.uzdavinys7;

public class MokiniuRusiuotuvas {


    public static enum enum_rusiavimoTvarka
    {
        ASCENDING_ORDER,
        DESCENDING_ORDER
    }

    public static void sort(Mokinys[] sarasas)
    {
        MokiniuRusiuotuvas.sort(sarasas, Mokinys.enum_priority.NAME, Mokinys.enum_priority.SURNAME, Mokinys.enum_priority.CLASS, enum_rusiavimoTvarka.ASCENDING_ORDER);
    }

    public static void sort(Mokinys[] sarasas, Mokinys.enum_priority first, Mokinys.enum_priority second, Mokinys.enum_priority third, enum_rusiavimoTvarka tvarka)
    {
        int i=0;
        while(i < (sarasas.length-1))
        {
            int diffrence;
            boolean swapArrayMembers_flag ;
            diffrence = sarasas[i].compare(sarasas[i+1],first);
            diffrence = (diffrence == 0)?(sarasas[i].compare(sarasas[i+1],second)):(diffrence);
            diffrence = (diffrence == 0)?(sarasas[i].compare(sarasas[i+1],third)):(diffrence);

            if (tvarka == enum_rusiavimoTvarka.DESCENDING_ORDER)
            {
                swapArrayMembers_flag = diffrence<0;
            }
            else
            {
                swapArrayMembers_flag = diffrence>0;
            }

            if(swapArrayMembers_flag)
            {
                Mokinys temp =sarasas[i];
                sarasas[i] = sarasas[i+1];
                sarasas[i+1] = temp;
                if(i>0)
                {
                    i--;
                }
                else
                {
                    i++;
                }
            }
            else
            {
                i++;
            }
        }
    }
}
