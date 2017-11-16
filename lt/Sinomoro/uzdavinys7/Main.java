package lt.Sinomoro.uzdavinys7;

public class Main {

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

        double[] vidurkiai = new double[12];
        for(Mokinys mokinys:mokykla)
        {
            vidurkiai[mokinys.getClassNumber()-1]+=mokinys.getAverage();
        }

        MokiniuRusiuotuvas.sort(mokykla, Mokinys.enum_priority.AVERAGE, Mokinys.enum_priority.SURNAME, Mokinys.enum_priority.NAME, MokiniuRusiuotuvas.enum_rusiavimoTvarka.DESCENDING_ORDER);

        for(Mokinys mokinys:mokykla)
        {
            System.out.println("      " +  mokinys.getFullName() + "  "  + mokinys.getClassNumber()+ "  " +mokinys.getAverage());
        }

        for(double vid:vidurkiai)
        {

        }
        int count = 0;
        for(int klase:Mokinys.getClassCount())
        {
            System.out.println("Klases  " + (count+1) + " Vidurkis : " + (klase != 0 ? (vidurkiai[count]/klase) : 0));
            count++;
        }

    }
}
