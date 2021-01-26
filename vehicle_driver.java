// 23. Consider you are designing vehicles engine with ‘speed:int, gear:int’. you can define your engine
// functionalities ‘speedUp(value)’ and ‘changeGear(value) in an interface. The class which is
// implementing the interface should implement all the methods in the interface. 

import java.util.*;

abstract class engine {
    int speed = 0, gear = 0;
    int maxSpeed = 150, maxGear = 5;
    void speedUp(int value){
        ;
    }
    void changeGear(int value){
        ;
    }
}

class vehicle_engine extends engine {
    public void speedUp(int value){
        if(value < 0)
            System.out.println("Speed cannot be -ve");
        else if(value > maxSpeed){
            System.out.println("Cannot increase speed to "+ value);
            System.out.println("Speed is set to max Speed (" + maxSpeed + ")");
            speed = maxSpeed;
        }
        else{
            speed = value;
        }
    }
    public void changeGear(int value){
        if(value < 0)
            System.out.println("Gear cannot be -ve");
        else if(value > maxGear){
            System.out.println("Cannot increase gear to "+ value);
            System.out.println("Gear is set to max Gear (" + maxGear + ")");
            gear = maxGear;
        }
        else{
            gear = value;
        }
    }
    void status(){
        System.out.println("Engine Status");
        System.out.println("    Speed: " + speed);
        System.out.println("    Gear: " + gear);
    }
}

public class vehicle_driver {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        vehicle_engine v = new vehicle_engine();
        System.out.println("Engine: ");
        System.out.println("Initial Speed = 0\nInitial Gear = 0");
        System.out.println("Max Speed = " + v.maxSpeed + "\nMax Gear = " + v.maxGear);
        while(true){
            System.out.println("Enter 1: Change Speed");
            System.out.println("      2: Change Gear");
            System.out.println("      3: Engine Status");
            System.out.println("      4: Exit");
            int choice  = inp.nextInt();
            if(choice == 1){
                System.out.println("Enter the Speed: ");
                int value = inp.nextInt();
                v.speedUp(value);
            }
            else if(choice == 2){
                System.out.println("Enter the Gear: ");
                int value = inp.nextInt();
                v.changeGear(value);
            }
            else if(choice == 3){
                v.status();
            }
            else if(choice == 4){
                System.exit(1);
            }
            else
                System.out.println("Invalid Input\nPlease try again");
        }
    }
}
