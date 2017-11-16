package lt.Sinomoro.uzdavinys7;

public class Mokinys extends Zmogus {
    private int classNumber;
    private int[] trimester;
    private double average;
    private static int[] classCount = new int[12];// nurodo kiek mokinių yra kiekvienoje klasėje


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

    public void setClassNumber(int classNumber)
    {
        classCount[this.classNumber-1]--;
        this.classNumber = classNumber;
        classCount[this.classNumber-1]++;
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
