package lt.Sinomoro.Uzduotis16;

public class Salary {

    private Employee employee;
    private double salary;

    Salary(Employee employee,double salary)
    {
        this.employee = employee;
        this.salary = salary;
    }

    Salary(Employee employee)
    {
        this.employee = employee;
        this.salary = employee.getSalary();
    }

    public Employee getEmployee() {
        return employee;
    }

    public double getSalary() {
        return salary;
    }

    public String getEmployeeName() {
        return employee.getName();
    }
}
