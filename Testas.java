
public class Testas {
    public static void main (String[] args )
    {
        Testas Series = new Testas();
        int sum =0;

        for(int i = 1; i<=100; i++)
        {
            sum +=i;
        }
        /*if("a" == "a")
        {
            System.out.println("veikia");
        }

        String lol = "kas";
        switch(lol)
        {
            case "kas":
                System.out.println("veikia");
                break;
            default:
                System.out.println("neveikia");
        }

        int a = 2;*/
        System.out.println(Series.an(2,50,2));
    }
    private int an(int a1, int n, int d)
    {
        int rez;

        rez = n*(2*a1 +(n-1)*d)/2;

        return rez;
    }

}
