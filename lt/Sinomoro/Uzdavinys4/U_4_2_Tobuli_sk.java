package lt.Sinomoro.Uzdavinys4;

public class U_4_2_Tobuli_sk {
    public static void main (String[]  args)
    {
        for(int i = 1; i<= 10000; i++)
        {
            int sum = 0;
            for(int j =1; j <= (i/2); j++)
            {
                if(i%j == 0)
                {
                    sum+=j;
                }
            }
            if(sum == i)
            {
                System.out.println(i);

            }
        }
    }


}
