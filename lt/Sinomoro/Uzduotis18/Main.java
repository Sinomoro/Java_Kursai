package lt.Sinomoro.Uzduotis18;


import com.ibm.icu.text.MessageFormat;

import java.util.Locale;
import java.util.ResourceBundle;

public class Main {


    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US"));
        ResourceBundle mybundle = ResourceBundle.getBundle("lt.Sinomoro.Uzduotis18.testBundle");

        String message = mybundle.getString("drambliai");
        MessageFormat mf = new MessageFormat(message);

        for (int i = 1; i < 20; i++) {
            System.out.println(mf.format(new Object[]{i}));
        }


        Locale.setDefault(new Locale("lt", "LT"));
        mybundle = ResourceBundle.getBundle("lt.Sinomoro.Uzduotis18.testBundle");

        message = mybundle.getString("drambliai");
        mf = new MessageFormat(message);

        for (int i = 1; i < 20; i++) {
            System.out.println(mf.format(new Object[]{i}));
        }
    }
}

