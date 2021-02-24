import java.util.*;

class NegativeSizeException extends Exception{
    public NegativeSizeException(String s){
        super("Negative Value: " + s);
    }
}

public class NegativeException{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a[] = new int[10];
        
        try{
            for(int i=0; i<10; i++){
                System.out.println("Enter a Integer: ");
                int temp = sc.nextInt();
                if (temp < 0)
                    throw new NegativeSizeException(Integer.toString(temp));
                a[i]=temp;
            }
        }
        catch(NegativeSizeException nse){
            System.out.println(nse.getMessage());
        }
    }
}