import java.time.LocalDate;
import java.util.ArrayList;

public class Developer extends Employee {
    public ArrayList<Technology>technologies;

   public Developer(String firstName, String lastName, String address, String email, String pesel, int yearOfEmployment){
       super(firstName,lastName,adress,email,pesel,yearOfEmployment);
       this.firstName=firstName;
       this.lastName=lastName;
       this.address=address;
       this.email=email;
       this.pesel=pesel;
       this.yearOfEmployment=yearOfEmployment;
    }
    public void addTechnology(Technology technology) {
    }
    public int calculateSalary() {
        int sallary=super.calculateSalary();
        LocalDate date=LocalDate.now();
        int year = date.getYear();
        int WorkingYeares = year - YeaOffEmployment;
        for(int i=1; i<=WorkingYeares; i++){
            sallary+=1000;

            for(Technology technology: technologies){
                sallary+=technology.bonus;
            }
        }
        return sallary;
    }
    
}
