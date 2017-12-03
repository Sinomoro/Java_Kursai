package lt.Sinomoro.Uzduotis15;

import java.util.Comparator;

public class Main {

    public static void main (String[] args) {


        Container<Employee> box = new Container<>();
        box.add(new Employee("Jonas", 56.00));
        box.add(new Employee("Lukas", 86.00));
        box.add(new Employee("Antanas", 65.00));
        box.add(new Employee("Ona", 97.00));
        box.add(new Employee("Jolanta", 512.00));
        box.add(new Employee("Paulius", 56.50));
        box.add(new Employee("AIstis", 45.00));
        box.add(new Employee("Greta", 89.00));
        box.add(new Employee("Juste", 10.00));
        box.add(new Employee("Ernesta", 12.00));
        box.add(new Employee("Povilas", 23.00));
        box.add(new Employee("Gregas", 0.01));

        Comparator<Employee> ordering = (emp1,emp2) ->((emp1.getSalary()-emp2.getSalary())>0?(-1):(1));

       for (Employee emp : box.order(ordering)) {
            System.out.println(emp);
        }
    }
}
