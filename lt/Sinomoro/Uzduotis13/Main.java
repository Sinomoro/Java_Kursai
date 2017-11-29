package lt.Sinomoro.Uzduotis13;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main (String[] args)
    {
        Set<Automobilis> sarasas = new TreeSet<>();
        sarasas.add(new Automobilis("100","audi","Rimas","Lukonis"));
        sarasas.add(new Automobilis("110","audi","Benas","Aglinskas"));
        sarasas.add(new Automobilis("120","audi","Linas","Vaidotas"));
        sarasas.add(new Automobilis("130","audi","Linas","Vaidotas"));
        sarasas.add(new Automobilis("140","audi","Aivaras","Vaidotas"));

        for (Automobilis i:sarasas)
        {
            System.out.println(i);
        }
    }
}
