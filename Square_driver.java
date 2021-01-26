// 22. Create a base class ‘Square’ having instance variable side:double. Initiate variable using constructor,
// a method ‘getVolume() : double’ that calculates volume and print it. Create a derived class ‘Cylinder’
// having instance variable height:double. Initiate variables of both classes through constructor,
// override method ‘getVolume() : double’ to calculate volume of cylinder taking ‘side’ variable of base
// class as ‘radius’ and print it.

import java.math.*;
import java.util.*;

class Square {
    double side;

    Square(double side){
        this.side = side;
    }

    double getVolume() { // volume of a cube
        return Math.pow(this.side, 3);
    }
}

class Cylinder extends Square{
    private double height;

    Cylinder(double height, double radius) {
        super(radius);
        this.height = height;
    }

    double getVolume() {
        return Math.PI * Math.pow(super.side, 2) *height;
    }
}

public class Square_driver {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        Cylinder c  = new Cylinder(0, 0); // default initialising the objects to use in the while function.
        Square s = new Square(0);
        while(true){
            System.out.println("Enter 1: Input(Square)");
            System.out.println("      2: Input(Cylinder)");
            System.out.println("      3: Get Volume");
            System.out.println("      4: Exit");
            int choice  = inp.nextInt();
            if(choice == 1){
                System.out.println("Enter the side: ");
                double side = inp.nextDouble();
                if(side <= 0){
                    System.out.println("Sides must pe +ve");
                    continue;
                }
                s = new Square(side);
                System.out.println("Data Entry Sucessful!");
            }
            else if(choice == 2){
                System.out.println("Enter the radius: ");
                double radius = inp.nextDouble();
                System.out.println("Enter the height: ");
                double height = inp.nextDouble();
                if(radius <= 0 || height <= 0){
                    System.out.println("Values must pe +ve");
                    continue;
                }
                c = new Cylinder(height, radius);
                System.out.println("Data Entry Sucessful!");
            }
            else if(choice == 3) {
                System.out.println("Enter 1: Volume of Cude");
                System.out.println("      2: Volume of Cylinder");
                int vChioce = inp.nextInt();
                if(vChioce == 1){
                    if(s.getVolume() == 0)
                        System.out.println("Please input the value first!");
                    else {
                        double volume = s.getVolume();
                        System.out.println("The volume of Cude is " + volume + " unit^3");
                    }
                }
                else if(vChioce == 2){
                    if(c.getVolume() == 0)
                        System.out.println("Please input the value first!");
                    else {
                        double volume = c.getVolume();
                        System.out.println("The volume of Cylinder is " + volume + " unit^3");
                    }
                }
                else
                    System.out.println("Invalid Input\nPlease try again");
            }
            else if(choice == 4)
                System.exit(1);
            else
                System.out.println("Invalid Input\nPlease try again");
        }
    }
}
