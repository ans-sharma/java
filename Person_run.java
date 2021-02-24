import java.util.*;

class Person {
    private String name, address;

    Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    void setPerson() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Update the name:");
        this.name = sc.nextLine();
        System.out.println("Update the Address:");
        this.address = sc.nextLine();
    }

    public String toString() {
        return "Person[Name=" + this.name + ", Address=" + this.address;
    }
}

class Student extends Person {
    private String program, year;
    private double fees;

    Student(String name, String address, String program, String year, double fees) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fees = fees;
    }

    void setStudent() {
        Scanner sc = new Scanner(System.in);
        super.setPerson();
        System.out.println("Update the program:");
        this.program = sc.nextLine();
        System.out.println("Update the year:");
        this.year = sc.nextLine();
        System.out.println("Update the fees:");
        this.fees = sc.nextInt();
    }

    public String toString() {
        return super.toString() + ", Program=" + this.program + ", Year= " + this.year
                + ", Fees=" + this.fees + "]";
    }
}

class Staff extends Person{
    private String school;
    private double pay;

    Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    void setStaff() {
        Scanner sc = new Scanner(System.in);
        super.setPerson();
        System.out.println("Update the school:");
        this.school = sc.nextLine();
        System.out.println("Update the pay:");
        this.pay = sc.nextInt();
    }

    public String toString() {
        return super.toString() + ", School=" + this.school + ", Pay= " + this.pay + "]";
    }
}

public class Person_run {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // we have to declare and ini the objects in order to re use them in the whole program.
        Student s = new Student(null, null, null, null, 1);  // cannot ini null value to double
        Staff st = new Staff(null, null, null, 1);  // cannot ini null value to double
        while(true){
            System.out.println("Enter 1: to Add Student Data");
            System.out.println("      2: to Add Staff Data");
            System.out.println("      3: to Modify Student Data");
            System.out.println("      4: to Modify Staff Data");
            System.out.println("      5: to Display Student Data");
            System.out.println("      6: to Display Staff Data");
            System.out.println("      7: to Exit");
            System.out.print("=> ");
            int choice = sc.nextInt();
            if (choice == 1){
                sc.nextLine();
                System.out.println("Enter the name of Student:");
                String name = sc.nextLine();
                System.out.println("Enter the Address:");
                String address = sc.nextLine();
                System.out.println("Enter the progeam:");
                String program = sc.nextLine();
                System.out.println("Enter the year:");
                String year = sc.nextLine();
                System.out.println("Enter the fees");
                double fees = sc.nextInt();
                s = new Student(name, address, program, year, fees);
                System.out.println("Data entry sucessful");
            }
            else if (choice == 2){
                sc.nextLine();
                System.out.println("Enter the name of Staff:");
                String name = sc.nextLine();
                System.out.println("Enter the Address:");
                String address = sc.nextLine();
                System.out.println("Enter the school:");
                String school = sc.nextLine();
                System.out.println("Enter the pay");
                double pay = sc.nextInt();
                st = new Staff(name, address, school, pay);
                System.out.println("Data entry sucessful");
            }
            else if (choice == 3){
                s.setStudent();
                System.out.println("Data update sucessful");

            }
            else if (choice == 4){
                st.setStaff();
                System.out.println("Data update sucessful");

            }
            else if (choice == 5){
                System.out.println(s);
            }
            else if (choice == 6){
                System.out.println(st);
            }
            else if (choice == 7){
                System.exit(1);
            }
            else{
                System.out.println("Wrong Input");
            }
        }
    }
}
