import java.util.ArrayList;

public class Employee {
    public String firstName;
    public String lastName;
    public String adress;
    public String email;
    public String pesel;
    public int yearOfEmployment;
    public int salary;
    public ArrayList<Employee> employees;

     public Employee(String firstName, String lastName, String address, String email, String pesel, int yearOfEmployment){
       this.firstName=firstName;
       this.lastName=lastName;
       this.address=address;
       this.email=email;
       this.pesel=pesel;
       this.yearOfEmployment=yearOfEmployment;
}
    public int calculateSalary() {
        int sallary=3000;
        return salary;

    }

}
