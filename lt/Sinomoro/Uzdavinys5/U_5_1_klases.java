package lt.Sinomoro.Uzdavinys5;

public class U_5_1_klases {

    private enum enum_rusiavimoTvarka
    {
        DIDEJIMO,
        MAZEJIMO
    }

    public void sort(Mokinys[] sarasas)
    {
        this.sort(sarasas,Mokinys.enum_priority.NAME, Mokinys.enum_priority.SURNAME, Mokinys.enum_priority.CLASS, enum_rusiavimoTvarka.DIDEJIMO);
    }

    public void sort(Mokinys[] sarasas, Mokinys.enum_priority first, Mokinys.enum_priority second, Mokinys.enum_priority third,enum_rusiavimoTvarka tvarka)
    {
        int i=0;
        while(i < (sarasas.length-1))
        {
            int skirtumas;
            boolean flag ;
            skirtumas = sarasas[i].compare(sarasas[i+1],first);//.compare yra mokinio klaseje esantis methodas
            skirtumas = (skirtumas == 0)?(sarasas[i].compare(sarasas[i+1],second)):(skirtumas);//jeigu pagal pirma kriteriju skirtumo nera ziuri antra kriteriju
            skirtumas = (skirtumas == 0)?(sarasas[i].compare(sarasas[i+1],third)):(skirtumas);

            if (tvarka == enum_rusiavimoTvarka.MAZEJIMO)//priklausomai nuo pasirinktos rusiavimo tvarkos nustatoma ar reikia apkeisti masyvo narius
            {
                flag = skirtumas<0;
            }
            else
            {
                flag = skirtumas>0;
            }

            if(flag)// jeigu atitinka kriteriju masyvo elementai apsikeicia vietomis
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

    public static void main (String[] args)
            
    {
        U_5_1_klases test = new U_5_1_klases();

        Mokinys[] mokykla = new Mokinys[10];

        mokykla[0] = new Mokinys("Antanas","Antanaitis",11);
        mokykla[1] = new Mokinys("Antanas","Antanaitis",10);
        mokykla[2] = new Mokinys("Antanas","Jonaitis",11);
        mokykla[3] = new Mokinys("Antanas","Petraitis",12);
        mokykla[4] = new Mokinys("Petras","Antanaitis",12);
        mokykla[5] = new Mokinys("Jonas","Antanaitis",11);
        mokykla[6] = new Mokinys("Jonas","Jontinaitis",10);
        mokykla[7] = new Mokinys("Petras","Petraitis",12);
        mokykla[8] = new Mokinys("Petras","Jonaitis",11);
        mokykla[9] = new Mokinys("Antanas","Antanaitis",12);


        test.sort(mokykla, Mokinys.enum_priority.CLASS, Mokinys.enum_priority.SURNAME, Mokinys.enum_priority.NAME,enum_rusiavimoTvarka.DIDEJIMO);

        for(Mokinys mokinys:mokykla)
        {
            System.out.println("      " +  mokinys.getFullName() + "  "  + mokinys.getClassNumber());
        }

    }
}
