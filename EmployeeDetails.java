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

class Employee {
    private String Name, Address, PAN;
    private int BasicSalary;

    void showDetails() {
        System.out.print("Name: " + Name);
        System.out.print("Address: " + Address);
        System.out.print("PAN: " + PAN);
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
        System.out.print("Department: " + Department);
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
        System.out.print("ProjectId: " + ProjectId);
        System.out.print("ProjectAllowance: " + ProjectAllowance);
    }

    void setManagerData(String Name, String Address, String PAN, int BasicSalary, String ProjectId, int ProjectAllowance) {
        super.setData(Name, Address, PAN, BasicSalary);
        this.ProjectId = ProjectId;
        this.ProjectAllowance = ProjectAllowance;
    }
}