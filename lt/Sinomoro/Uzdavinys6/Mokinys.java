package lt.Sinomoro.Uzdavinys6;

public class Mokinys extends Zmogus {
    private int classNumber;
    private int[] trimester;
    private double average;

    public enum enum_priority
    {
        NAME,
        SURNAME,
        CLASS,
        AVERAGE
    }

    Mokinys () {}

    Mokinys (String vardas, String pavarde, int classNumber)
    {
        super(vardas,pavarde);
        this.classNumber = classNumber;
    }

    Mokinys (String vardas, String pavarde, int classNumber, int[] grades)
    {
        super(vardas,pavarde);
        this.classNumber = classNumber;
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

    public int compare(Mokinys mokinys,enum_priority compareBy)
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

    public void setClassNumber(int classNumber) {
        this.classNumber = classNumber;
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
