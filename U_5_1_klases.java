import java.util.Arrays;
import java.util.Collections;

public class U_5_1_klases {

    public static void main (String[] args)
    {
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

        int i=0;

        Arrays.sort(mokykla);

        System.out.println("****************************************************");
        System.out.println("Naudojant juodaja magija");
        for(Mokinys mokinys:mokykla)
        {
            System.out.println("      " +  mokinys.getFullName() + "  "  + mokinys.getKlase());
        }

        while(i < (mokykla.length-1))
        {
            if(mokykla[i].getKlase() < mokykla[i+1].getKlase())
            {
                Mokinys temp =mokykla[i];
                mokykla[i] = mokykla[i+1];
                mokykla[i+1] = temp;
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

        System.out.println("****************************************************");
        System.out.println("Su 3 uzsiemime sudarytu rusiavimo algoritmu pagal klase: ");
        for(Mokinys mokinys:mokykla)
        {
            System.out.println("      " +  mokinys.getFullName() + "  "  + mokinys.getKlase());
        }


    }
}
