import java.util.Scanner;
public class PatternTri {
    public static void main(String[] args) {
        int rows;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number of rows you want to print: ");
        rows = input.nextInt();
        for(int i = 1; i<=rows ; i++){
            for(int j = 1; j<=i; j++)
                System.out.print("* ");
            System.out.print("\n");
        }
        for(int i = rows-1; i>=0 ; i--){
            for(int j = 1; j<=i; j++)
                System.out.print("* ");
            System.out.print("\n");
        }
    }
}