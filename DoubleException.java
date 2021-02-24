import java.util.*;

public class DoubleException{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        try{
            System.out.println("Enter the Size of Array: ");
            int arrSize = s.nextInt();
            int[] arr = new int[arrSize];
            System.out.println("Enter the array location you want to Use: ");
            int arrLoc = s.nextInt();
            arr[arrLoc] = 0;
            System.out.println("Enter value1: ");
            int a = s.nextInt();
            System.out.println("Enter value2: ");
            int b = s.nextInt();
            int c = a / b;
            System.out.println(c);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
        }
        catch(ArithmeticException e){
            System.out.println("ArithmeticException");
        }
    }
}