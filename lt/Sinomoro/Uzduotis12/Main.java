package lt.Sinomoro.Uzduotis12;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    static public void main(String[] args)
    {
        List<Employee> sarasas = new ArrayList<>();
        sarasas.add(new Employee("Lukas","Kaunas","Geliu g. 6"));
        sarasas.add(new Employee("Petras","Alytus","Azuolu g. 12"));
        sarasas.add(new Employee("Jonas","Kedainiai","Pieniu g. 5"));
        sarasas.add(new Employee("Adomas","Kaunas","Berzu g. 5"));
        sarasas.add(new Employee("Ona","Vilnius","Barsausko g. 54"));
        sarasas.add(new Employee("Gertruda","Alytus","Studentu g. 6"));
        sarasas.add(new Employee("Remigijus","Prienai","Sporto g. 8"));
        sarasas.add(new Employee("Juste","Klaipeda","Stadiono g. 9"));
        sarasas.add(new Employee("Gintare","Vilnius","Veiveriu g. 15"));

        Set<String> miestuSarasas = new HashSet<>();
        for (Employee i:sarasas)
        {
            miestuSarasas.add(i.address.city);
        }

        System.out.println(miestuSarasas.size());
    }
}
