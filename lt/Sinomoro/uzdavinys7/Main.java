package lt.Sinomoro.uzdavinys7;

public class Main {

    public static void main(String[] args)
    {
        Mokinys[] mokykla = new Mokinys[20];

        mokykla[0] = new Mokinys("Antanas","Antanaitis",10,new int[]{7,1,5});
        mokykla[1] = new Mokinys("Antanas","Antanaitis",12,new int[]{1,5,6});
        mokykla[2] = new Mokinys("Antanas","Jonaitis",3,new int[]{10,10,10});
        mokykla[3] = new Mokinys("Antanas","Petraitis",3,new int[]{7,8,9});
        mokykla[4] = new Mokinys("Petras","Antanaitis",4,new int[]{8,5,8});
        mokykla[5] = new Mokinys("Jonas","Antanaitis",1,new int[]{10,10,10});
        mokykla[6] = new Mokinys("Jonas","Jontinaitis",5,new int[]{9,5,4});
        mokykla[7] = new Mokinys("Petras","Petraitis",6,new int[]{9,4,1});
        mokykla[8] = new Mokinys("Petras","Jonaitis",8,new int[]{5,1,1});
        mokykla[9] = new Mokinys("Antanas","Antanaitis",9,new int[]{10,10,10});
        mokykla[10] = new Mokinys("Antanas","Antanaitis",8,new int[]{7,1,5});
        mokykla[11] = new Mokinys("Antanas","Antanaitis",7,new int[]{1,5,6});
        mokykla[12] = new Mokinys("Antanas","Jonaitis",11,new int[]{10,10,10});
        mokykla[13] = new Mokinys("Antanas","Petraitis",10,new int[]{7,8,9});
        mokykla[14] = new Mokinys("Petras","Antanaitis",12,new int[]{8,5,8});
        mokykla[15] = new Mokinys("Jonas","Antanaitis",11,new int[]{10,10,10});
        mokykla[16] = new Mokinys("Jonas","Jontinaitis",10,new int[]{9,5,4});
        mokykla[17] = new Mokinys("Petras","Petraitis",12,new int[]{9,4,1});
        mokykla[18] = new Mokinys("Petras","Jonaitis",8,new int[]{5,1,1});
        mokykla[19] = new Mokinys("Antanas","Antanaitis",8,new int[]{10,10,10});

        /*
        * Programa papildyta klasių vidurkių skaičiavimo algoritmu.
        * Šis algoritmas nebuvo nukeliamas i atskira "pagalbine" klasę, nes jis ganėtinai apprastas ir suprantamas.
        * Algotritmas tiesiog sudeda visų mokinių iš atitinkamų kalsių vidurkius ir poto šias sumas padalina iš atitinkamų klasių mokinių skaičiaus.
         */
        double[] vidurkiai = new double[12];

        for(Mokinys mokinys:mokykla)
        {
            vidurkiai[mokinys.getClassNumber()-1]+=mokinys.getAverage();
        }

        for(int i = 0; i<12; i++)
        {
            if(Mokinys.getClassCount(i)>0) {
                vidurkiai[i] /= Mokinys.getClassCount(i);
            }
        }
        for(int i = 0; i<12 ; i++)
        {
            System.out.println("Klases  " + (1+i) + " Vidurkis yra :  " + vidurkiai[i]);
        }

        // 7.2 uzduoties dalis
        System.out.println("***************************************************");
        System.out.println("          Klases vidurkiai mazejimo tvarka");
        System.out.println("***************************************************");
        MyUtility.printSortedDouble(vidurkiai,0,10, MyUtility.enum_SortOrder.DESCENDING);

    }
}
