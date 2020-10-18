
// Create a class employee with the following members:
// a. Name
// B. Address
// c. PAN number
// d. Base Salary
// And the following methods:
// a. ShowDetails()
// b. getGrossSalary()
// Along with getters and setters (accessors and mutators) for the member variables.
// Derive two classes from it:
// Manager: with the extra members commision and department.
// ProjectLeader: with the extra members projectId and projectAllowance.
// Override getGrossSalary to include the commission in case of managers, and show all details for both of
// the derived class by overriding the showDetails method.
import java.util.Scanner;

class Employee {
    private String Name, Address, PAN;
    private int BasicSalary;

    void showDetails() {
        System.out.println("Name: " + Name);
        System.out.println("Address: " + Address);
        System.out.println("PAN: " + PAN);
    }

    int getGrossSalary() {
        return BasicSalary;
    }

    void setData(String Name, String Address, String PAN, int BasicSalary) {
        this.Name = Name;
        this.Address = Address;
        this.PAN = PAN;
        this.BasicSalary = BasicSalary;
    }
}

class Manager extends Employee {
    private String Department;
    private int Commision;

    int getGrossSalary() {
        return Commision + super.getGrossSalary();
    }

    void showDetails() {
        super.showDetails();
        System.out.println("Department: " + Department);
        // System.out.println("");
    }

    void setManagerData(String Name, String Address, String PAN, int BasicSalary, String Department, int Commision) {
        super.setData(Name, Address, PAN, BasicSalary);
        this.Department = Department;
        this.Commision = Commision;
    }
}

class ProjectLeader extends Employee {
    private String ProjectId;
    private int ProjectAllowance;

    void showDetails() {
        super.showDetails();
        System.out.println("ProjectId: " + ProjectId);
        System.out.println("ProjectAllowance: " + ProjectAllowance);
        // System.out.println("");
    }

    void setProjectLeaderData(String Name, String Address, String PAN, int BasicSalary, String ProjectId, int ProjectAllowance) {
        super.setData(Name, Address, PAN, BasicSalary);
        this.ProjectId = ProjectId;
        this.ProjectAllowance = ProjectAllowance;
    }
}

public class EmployeeDetails {
    public static void main(String[] args) {
        Manager m = new Manager();
        ProjectLeader p = new ProjectLeader();
        m.setManagerData("Anshuman", "kgp", "Az444", 100000, "CS", 100000);
        p.setProjectLeaderData("Anshumann", "kgpp", "A5555", 500000, "CSS", 500000);
        m.showDetails();
        System.out.println(m.getGrossSalary());
        System.out.println("");
        p.showDetails();
        System.out.println(p.getGrossSalary());
    }
}