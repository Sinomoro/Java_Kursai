package lt.Sinomoro.Uzduotis10;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {


    private static void removePVM(int kiekis, double sumaSuPVM)
    {
        removePVM(kiekis,sumaSuPVM,2);
    }

    private static void removePVM(int kiekis, double sumaSuPVM, int prekesKainosTikslumasbePVM)
    {
        BigDecimal prekesKaina = BigDecimal.valueOf(sumaSuPVM).divide(BigDecimal.valueOf(kiekis),RoundingMode.HALF_EVEN).multiply(BigDecimal.valueOf(100.0/121.0));// = (Suma/kiekio)*(100/121);
        BigDecimal sumaBePVM = prekesKaina.multiply(BigDecimal.valueOf(kiekis));// = prekesKainaBePVM*kiekio

        System.out.println(" Prekės kaina be PVM : " + prekesKaina.setScale(prekesKainosTikslumasbePVM, RoundingMode.HALF_EVEN));
        System.out.println(" Kiekis              : " + kiekis);
        System.out.println(" Suma be PVM         : " + sumaBePVM.setScale(2,RoundingMode.HALF_EVEN));
        System.out.println(" PVM Suma            : " + BigDecimal.valueOf(sumaSuPVM).subtract(sumaBePVM).setScale(2,RoundingMode.HALF_EVEN));// = suma-sumaBePVM
        System.out.println(" Viso Suma su PVM    : " + BigDecimal.valueOf(sumaSuPVM).setScale(2,RoundingMode.HALF_EVEN));

    }

    public static void main(String[] args)
    {
        Main.removePVM(10,200);
        Main.removePVM(9,11.59);
    }
}
