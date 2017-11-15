import java.util.Arrays;
import java.util.Collections;

public class U_5_1_klases {



    public void sortas (Mokinys[] mok )
    {
        //TODO įvest dar viena metodo argumentą, nusakantį rikiavimo tvarka, argumentas turėtų keisti @tvarka1 ir @tvarka2 kintamuosius.

        int i=0;
        int tvarka1 = 1;
        int tvarka2 = 0;
        while(i < (mok.length-1))
        {

            if(mok[i+tvarka2].getKlase() < mok[i+tvarka1].getKlase())
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

        manoRusiavimas.sortas(mokykla);

        System.out.println("****************************************************");
        System.out.println("Su 3 užsiėmime sudarytu rušiavimo algoritmu pagal \"klase\" kintamajį, mažėjimo tvarka: ");
        for(Mokinys mokinys:mokykla)
        {
            System.out.println("      " +  mokinys.getFullName() + "  "  + mokinys.getKlase());
        }


    }
}
