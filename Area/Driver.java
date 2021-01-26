import package1.*;
import package2.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        Rectangle r = new Rectangle();
        Circle c = new Circle();
        while(true){
            System.out.println("Enter 1: Rectangle");
            System.out.println("      2: Circle");
            System.out.println("      3: Exit");
            int choice = inp.nextInt();
            if(choice == 1){
                System.out.println("Enter 1: Area");
                System.out.println("      2: Peremeter");
                int choice2 = inp.nextInt();
                if(choice2 == 1){
                    System.out.println("Enter Length and Breadth:");
                    int length = inp.nextInt();
                    int breadth = inp.nextInt();
                    if(length <= 0 || breadth <=0){
                        System.out.println("Value cannot be +ve");
                    }
                    else{
                        double area = r.area(length, breadth);
                        System.out.println("Area: " + area);
                    }
                }
                else if(choice2 == 2){
                    System.out.println("Enter Length and Breadth:");
                    int length = inp.nextInt();
                    int breadth = inp.nextInt();
                    if(length <= 0 || breadth <=0){
                        System.out.println("Value cannot be +ve");
                    }
                    else{
                        double peremeter = r.peremeter(length, breadth);
                        System.out.println("peremeter: " + peremeter);
                    }
                }
                else
                    System.out.println("Invalid Input\nPlease try again");
            }
            else if(choice == 2){
                System.out.println("Enter 1: Area");
                System.out.println("      2: Circumference");
                int choice2 = inp.nextInt();
                if(choice2 == 1){
                    System.out.println("Enter Radius:");
                    int radius = inp.nextInt();
                    if(radius<=0){
                        System.out.println("Value cannot be +ve");
                    }
                    else{
                        double area = c.area(radius);
                        System.out.println("Area: " + area);
                    }
                }
                else if(choice2 == 2){
                    System.out.println("Enter Radius:");
                    int radius = inp.nextInt();
                    if(radius<=0){
                        System.out.println("Value cannot be +ve");
                    }
                    else{
                        double circumference = c.circumference(radius);
                        System.out.println("circumference: " + circumference);
                    }
                }
                else
                    System.out.println("Invalid Input\nPlease try again");
            }
            else if(choice == 3)
                System.exit(1);
            else
                System.out.println("Invalid Input\nPlease try again");
        }
    }
}
