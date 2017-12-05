package lt.Sinomoro.Uzdavinys4;

import java.util.List;

public class U_4_1_masyvai {
    public static void main(String[] arg)
    {
        int[] a = {5,6,10,15,8,4};
        int[] b ={8,5,3};

        int sum1=0;
        int sum2=0;

        for(int elem:a)
        {
            sum1+=elem;
        }
        double avg1= (double)sum1/a.length;

        for(int elem:b)
        {
            sum2+=elem;
        }
        double avg2= (double)sum2/b.length;

        System.out.println(avg1-avg2);

    }

}
