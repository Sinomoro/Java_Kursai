package lt.Sinomoro.Uzduotis18;

import java.security.MessageDigest;
import java.text.DateFormat;
import java.text.MessageFormat;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Date;
import java.util.Locale;

public class Main {
    public static void main (String[] args)
    {

        String message = "Eina {0} drambliai";
        MessageFormat mf = new MessageFormat(message, new Locale("lt","LT"));
        System.out.println(mf.format(new Object[] {2}));


        String message1 = " {0} Elephants are walking";
        MessageFormat mf1 = new MessageFormat(message1, new Locale("en","US"));
        System.out.println(mf1.format(new Object[] {2}));
    }

}

