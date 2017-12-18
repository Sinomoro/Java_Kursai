package lt.Sinomoro.Uzduotis18;

import java.security.MessageDigest;
import java.text.DateFormat;
import java.text.MessageFormat;
import java.text.NumberFormat;
import java.util.*;

public class Main {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] lokale = input.split("\\s");
        Locale.setDefault(new Locale(lokale[0],lokale[1]));
        ResourceBundle mybundle = ResourceBundle.getBundle("lt.Sinomoro.Uzduotis18.testBundle");

        String message = mybundle.getString("drambliai");
        MessageFormat mf = new MessageFormat(message);

        for(int i =1; i<20;i++)
        {
            System.out.println(mf.format(new Object[] {i,(i<10)?("iai"):("ių")}));
        }
    }

}

