package lt.Sinomoro.Uzduotis16;

/*
Tarkime turime objektą Employee ir objektą Salary, kuriame yra Employee tipo laukas ir Double tipo laukas reiškiantis išmokėtą atlyginimą.
Sukurkite sąrašą darbuotojų ir jų atlyginimų (gali būti keli to pačio darbuotojo įrašai) ir aprašykite tokius veiksmus naudojant duomenų srautus/vamzdynus:
1) Išrinkite kiek ir kokiam darbuotojui yra išmokėta ir išveskite mažėjimo tvarka pagal išmokėtą sumą: vardas - išmokėta suma
2) Suskaičiuokite kiek išmokėjimų (ne suma bet kiek kartų buvo išmokėta) yra kiekvienam darbuotojui ir atspausdinkite: vardas - kiek kartų išmokėta
 */


import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main (String[] args)
    {
        List<Salary> vokeliuSarasas = new ArrayList<>();

        vokeliuSarasas.add(new Salary(new Employee("Lukas",500.00)));
        vokeliuSarasas.add(new Salary(new Employee("Jomas",520.00)));
        vokeliuSarasas.add(new Salary(new Employee("Donas", 900)));
        vokeliuSarasas.add(new Salary(new Employee("Donas",550.00)));
        vokeliuSarasas.add(new Salary(new Employee("Polas",100.00)));
        vokeliuSarasas.add(new Salary(new Employee("Golas",320.00)));
        vokeliuSarasas.add(new Salary(new Employee("Donas",700.00)));
        vokeliuSarasas.add(new Salary(new Employee("Polas",120.00)));
        vokeliuSarasas.add(new Salary(new Employee("Polas",390.00)));
        vokeliuSarasas.add(new Salary(new Employee("Donas",1200.00)));
        vokeliuSarasas.add(new Salary(new Employee("Golas",650.00)));




        Map<String,Double> s1 = vokeliuSarasas.stream()
                .collect(Collectors.groupingBy(
                        Salary::getEmployeeName,
                        Collectors.reducing(0.0, Salary::getSalary, Double::sum)));


        // NAudojamas LinkedHashMap, nes jis iteruoja idejimo tvarka, o ne "Raktu" reiksmiu tvarka
        Map<String, Double> finalMap1 = new LinkedHashMap<>();

        s1.entrySet().stream()
                .sorted(Map.Entry.<String, Double>comparingByValue().reversed())
                .forEachOrdered(e -> finalMap1.put(e.getKey(), e.getValue()));


        Map<String,Long> s2 = vokeliuSarasas.stream()
                .collect(Collectors.groupingBy(
                        Salary::getEmployeeName,
                        Collectors.counting()));

        Map<String, Long> finalMap2 = new LinkedHashMap<>();
        s2.entrySet().stream()
                .sorted(Map.Entry.<String,Long>comparingByValue().reversed())
                .forEachOrdered(e -> finalMap2.put(e.getKey(), e.getValue()));

        for(Map.Entry<String,Double> payout: finalMap1.entrySet())
        {
            System.out.println(payout.getKey() + " " + payout.getValue());
        }
        System.out.println("******************************************");
        for(Map.Entry<String,Long> payout:  finalMap2.entrySet())
        {
            System.out.println(payout.getKey() + " " + payout.getValue());
        }
    }
}
