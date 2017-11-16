package lt.Sinomoro.uzdavinys7;

public class Mokinys extends Zmogus {
    private int classNumber;
    private int[] trimester;
    private double average;
    private static int[] classCount = new int[12];

    public enum enum_priority
    {
        NAME,
        SURNAME,
        CLASS,
        AVERAGE
    }

    //Mokinys () {}

    Mokinys (String vardas, String pavarde, int classNumber)
    {
        super(vardas,pavarde);
        this.classNumber = classNumber;
        classCount [classNumber-1]++;
    }

    Mokinys (String vardas, String pavarde, int classNumber, int[] grades)
    {
        this(vardas, pavarde,classNumber);
        this.trimester = grades;
    }

    public void calculateAVG()
    {
        int sum = 0;
        for(int grade:this.trimester)
        {
            sum+=grade;
        }

        this.average = (double)sum/this.trimester.length;
    }

    public int compare(Mokinys mokinys, enum_priority compareBy)
    {
        int res =0;
        switch (compareBy)
        {
            case NAME:
                res = this.getName().compareTo(mokinys.getName());
                break;
            case SURNAME:
                res = this.getSurname().compareTo(mokinys.getSurname());
                break;
            case CLASS:
                res = this.getClassNumber() -mokinys.getClassNumber();
                break;
            case AVERAGE:
                if(this.getAverage() == mokinys.getAverage())
                {
                    res = 0;
                }
                else if ((this.getAverage() - mokinys.getAverage())>0)
                {
                    res = 1;
                }
                else
                {
                    res = -1;
                }
                break;
        }
        return res;
    }

    public void setClassNumber(int classNumber)
    {
        classCount[this.classNumber] --;
        this.classNumber = classNumber;
        classCount[this.classNumber] ++;
    }

    public static int getClassCount(int classNumber)
    {
        return classCount[classNumber];
    }

    public static int[] getClassCount()
    {
        return classCount;
    }

    public int getClassNumber()
    {
        return classNumber;
    }

    public double getAverage()
    {
        this.calculateAVG();
        return average;
    }

}
