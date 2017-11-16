package lt.Sinomoro.Uzdavinys6;

public class Main {

    private enum enum_rusiavimoTvarka
    {
        ASCENDING_ORDER,
        DESCENDING_ORDER
    }

    public void sort(Mokinys[] sarasas)
    {
        this.sort(sarasas,Mokinys.enum_priority.NAME, Mokinys.enum_priority.SURNAME, Mokinys.enum_priority.CLASS, enum_rusiavimoTvarka.ASCENDING_ORDER);
    }

    public void sort(Mokinys[] sarasas, Mokinys.enum_priority first, Mokinys.enum_priority second, Mokinys.enum_priority third,enum_rusiavimoTvarka tvarka)
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


    public static void main(String[] args)
    {
        Mokinys[] mokykla = new Mokinys[10];

        Main test = new Main();

        mokykla[0] = new Mokinys("Antanas","Antanaitis",11,new int[]{7,1,5});
        mokykla[1] = new Mokinys("Antanas","Antanaitis",10,new int[]{1,5,6});
        mokykla[2] = new Mokinys("Antanas","Jonaitis",11,new int[]{10,10,10});
        mokykla[3] = new Mokinys("Antanas","Petraitis",12,new int[]{7,8,9});
        mokykla[4] = new Mokinys("Petras","Antanaitis",12,new int[]{8,5,8});
        mokykla[5] = new Mokinys("Jonas","Antanaitis",11,new int[]{10,10,10});
        mokykla[6] = new Mokinys("Jonas","Jontinaitis",10,new int[]{9,5,4});
        mokykla[7] = new Mokinys("Petras","Petraitis",12,new int[]{9,4,1});
        mokykla[8] = new Mokinys("Petras","Jonaitis",11,new int[]{5,1,1});
        mokykla[9] = new Mokinys("Antanas","Antanaitis",9,new int[]{10,10,10});

        for(Mokinys mokinys:mokykla)
        {
            mokinys.calculateAVG();
        }

        test.sort(mokykla, Mokinys.enum_priority.AVERAGE, Mokinys.enum_priority.SURNAME, Mokinys.enum_priority.NAME, enum_rusiavimoTvarka.DESCENDING_ORDER);

        for(Mokinys mokinys:mokykla)
        {
            System.out.println("      " +  mokinys.getFullName() + "  "  + mokinys.getClassNumber()+ "  " +mokinys.getAverage());
        }
    }
}
