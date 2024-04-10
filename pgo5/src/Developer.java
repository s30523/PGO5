import java.util.ArrayList;

public class Developer {
    public String firstName;
    public String lastName;
    public String address;
    public String email;
    public String pesel;
    public int YearOfEmployment;
    public ArrayList<Technology>technologies;

   public Developer(String firstName, String lastName, String address, String email, String pesel, int yearOfEmployment){
       this.firstName=firstName;
       this.lastName=lastName;
       this.address=address;
       this.email=email;
       this.pesel=pesel;
       this.YearOfEmployment=yearOfEmployment;
    }
}
