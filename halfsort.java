import java.util.*;

public class halfsort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size = sc.nextInt();
	if(size <= 0){
	    System.out.println("Array size error");
	    System.exit(1);
	}
        int intArray[];
        intArray = new int[size];
        System.out.println("Enter the values in Array:");
        for (int i = 0; i < size; i++) {
            intArray[i] = sc.nextInt();
        }
        int temp = 0;
        for (int i = 0; i < size / 2; i++) {
            for (int j = 1; j < (size - i) / 2; j++) {
                if (intArray[j - 1] > intArray[j]) {
                    temp = intArray[j - 1];
                    intArray[j - 1] = intArray[j];
                    intArray[j] = temp;
                }
            }
        }
        temp = 0;
        for (int i = (size / 2); i < size; i++) {
            for (int j = (size / 2) + 1; j < size; j++) {
                if (intArray[j - 1] < intArray[j]) {
                    temp = intArray[j - 1];
                    intArray[j - 1] = intArray[j];
                    intArray[j] = temp;
                }
            }
        }
        System.out.println("Ascending order");
        for (int i = 0; i < size; i++) {
            System.out.print(intArray[i] + " ");
            if (i == (size / 2) - 1) {
                System.out.println();
                System.out.println("Descending order");
            }
        }
    }
}
