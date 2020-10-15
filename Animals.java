import java.util.Scanner;
abstract class Animal{
    String Species, Kingdom;
    int Lifespan;
    static boolean tame;
    abstract void printDetails();
    abstract void speak();
    static boolean canBeTamed(){
        return tame;
    }
}
class Dog extends Animal{
    Scanner input = new Scanner(System.in);
    String name, breed, noise = "Woof";
    int speed;
    void read(){
        System.out.print("Enter the name of your Pet: ");
        name = input.next();
        System.out.print("Enter its Breed: ");
        breed = input.next();
        System.out.print("Enter its Speed: ");
        speed = input.nextInt();
        System.out.print("Enter the Species: ");
        Species = input.next();
        System.out.print("Enter the Kingdom: ");
        Kingdom = input.next();
        System.out.print("Enter the Life Span: ");
        Lifespan = input.nextInt();
        System.out.print("Can be tame ?, 1 for yes, 0 for no: ");
        int sChoice = input.nextInt();
        if(sChoice == 1){
            Animal.tame = true;
        }
        else if(sChoice == 0){
            Animal.tame = false;
        }
    }
    void printDetails(){
        System.out.println("Name: "+ name);
        System.out.println("Breed: "+ breed);
        System.out.println("Speed: "+ speed);
        System.out.println("Species: "+ Species);
        System.out.println("Kingdom: "+ Kingdom);
        System.out.println("Lifespan: "+ Lifespan);
        boolean check = Animal.canBeTamed();
        if(check == true)
            System.out.println("Can be Tamed");
        else
            System.out.println("Cannot be Tamed");
    }
    void speak(){
        System.out.println(name + " said " + noise + "!");
    }
}

class Cat extends Animal{
    Scanner input = new Scanner(System.in);
    String name, breed, noise = "Meow";
    int speed;
    void read(){
        System.out.print("Enter the name of your Pet: ");
        name = input.next();
        System.out.print("Enter its Breed: ");
        breed = input.next();
        System.out.print("Enter its Speed: ");
        speed = input.nextInt();
        System.out.print("Enter the Species: ");
        Species = input.next();
        System.out.print("Enter the Kingdom: ");
        Kingdom = input.next();
        System.out.print("Enter the Life Span: ");
        Lifespan = input.nextInt();
        System.out.print("Can be tame ?, 1 for yes, 0 for no: ");
        int sChoice = input.nextInt();
        if(sChoice == 1){
            Animal.tame = true;
        }
        else if(sChoice == 0){
            Animal.tame = false;
        }
    }
    void printDetails(){
        System.out.println("Name: "+ name);
        System.out.println("Breed: "+ breed);
        System.out.println("Speed: "+ speed);
        System.out.println("Species: "+ Species);
        System.out.println("Kingdom: "+ Kingdom);
        System.out.println("Lifespan: "+ Lifespan);
        boolean check = Animal.canBeTamed();
        if(check == true)
            System.out.println("Can be Tamed");
        else
            System.out.println("Cannot be Tamed");
    }
    void speak(){
        System.out.println(name + " said " + noise + "!");
    }
}
public class Animals {
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();
        System.out.println("-------------------------------");
        d.read();
        System.out.println("-------------------------------");
        c.read();
        System.out.println("-------------------------------");
        d.printDetails();
        System.out.println("-------------------------------");
        c.printDetails();
        System.out.println("-------------------------------");
    }
}