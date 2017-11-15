import java.util.Arrays;
import java.util.Collections;

public class U_5_1_klases {

    private enum RusiavimoTvarka
    {
        DIDEJIMO,
        MAZEJIMO
    }

    public void sortas (Mokinys[] mok,  RusiavimoTvarka tvarka)
    {
        //TODO optimizuoti rušiavimo tvarkos nustatymą.

        int i=0;
        while(i < (mok.length-1))
        {

            if((tvarka == RusiavimoTvarka.DIDEJIMO)?(mok[i].getKlase() > mok[i+1].getKlase()):(mok[i].getKlase() < mok[i+1].getKlase()))
            {
                Mokinys temp =mok[i];
                mok[i] = mok[i+1];
                mok[i+1] = temp;
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
        U_5_1_klases manoRusiavimas = new U_5_1_klases();

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

        Arrays.sort(mokykla);

        System.out.println("****************************************************");
        System.out.println("Naudojant juodaja \"Array.sort\" magiją, pagal pavardę, vardaą ir klasę :");
        for(Mokinys mokinys:mokykla)
        {
            System.out.println("      " +  mokinys.getFullName() + "  "  + mokinys.getKlase());
        }

        manoRusiavimas.sortas(mokykla,RusiavimoTvarka.MAZEJIMO);

        System.out.println("****************************************************");
        System.out.println("Su 3 užsiėmime sudarytu rušiavimo algoritmu pagal \"klase\" kintamajį, mažėjimo tvarka: ");
        for(Mokinys mokinys:mokykla)
        {
            System.out.println("      " +  mokinys.getFullName() + "  "  + mokinys.getKlase());
        }


    }
}
