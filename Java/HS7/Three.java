import java.util.*;

class employee {
    int id;
    String firstname;
    String lastname;
    int salary;

    employee(int id,String firstname,String lastname,int salary) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.salary = salary;
    }

    int getID(){
        return this.id;
    }

    String getFirstName() {
        return this.firstname;
    }

    String getLastName() {
        return this.lastname;
    }

    String getName() {
        return this.firstname + " " + this.lastname;
    }

    int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;        
    }

    int getAnnualSalary() {
        return this.salary*12;
    }

    int raiseSalary(int percent) {
        return this.salary+this.salary*percent/100;
    }

    public String toString() {
        return "Employee[id=" +id+",name="+firstname+ " " + lastname +",salary="+salary+"]"; 
    }
}


public class Three {
    public static void main(String[] args) {
        employee e1 = new employee(1,"Axy","Moon",15000);
        
        System.out.println("Raised Salary: " + e1.raiseSalary(5));
        System.out.println(e1.toString());

    }
}