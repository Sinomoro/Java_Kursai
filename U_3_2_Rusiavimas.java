public class U_3_2_Rusiavimas
{
    public static void main (String[] args)
    {
        int[] a = {1,2,3,4,5,6,5,98,86,7,8,9,199};

        int i=0;

        while(i < (a.length-1))
        {
            if(a[i]<a[i+1])
            {
                int temp =a[i];
                a[i] = a[i+1];
                a[i+1] = temp;
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

        for(i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
}
