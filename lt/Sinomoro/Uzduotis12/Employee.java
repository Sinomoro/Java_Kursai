package lt.Sinomoro.Uzduotis12;

public class Employee {

    String name;
    Address address;

    static public class Address
    {
        String city;
        String address;
    }

    Employee(String name, String city, String address){
        this.name =name;
        this.address = new Employee.Address();
        this.address.city = city;
        this.address.address = address;
    }
}
