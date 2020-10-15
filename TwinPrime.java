import java.util.*;
public class TwinPrime {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the lower value:");
        int iLower = inp.nextInt();
        System.out.print("Enter the upper value:");
        int iUpper = inp.nextInt();
        if (iLower < 0 || iUpper < 0) {
            System.out.println("Entered Value is -ve, Can't find Twin Prime");
            System.exit(99);
        } 
        if(iLower>iUpper){
			System.out.println("Input Range is Invalid!\nThe lower value is greater than the upper");
			System.out.println("Do you want to swap the values: 1: yes, 0: no");
			int iChoice = inp.nextInt();
			if(iChoice == 1){
				int iTemp = iLower;
				iLower = iUpper;
				iUpper = iTemp;
			}
			else if(iChoice == 0){
				System.out.println("Exit");
				System.exit(99);
			}
			else 
				System.exit(99);
		    }
            System.out.print("The prime numbers are:");
            for (int val = iLower; val < iUpper; val++) {
                int flag = 0;
                int value = (val + 2);
                if (val == 1)
                    flag = 0;
                if (val == 2)
                    flag = 1;
                for (int u = 2; u <= val / 2; u++) {
                    if (val % u == 0 || value % u == 0) {
                        flag = 1;
                        break;
                    }
                }
                if (flag == 0)
                    System.out.print("(" + val + "," + value + ")" + ",");
            }
        inp.close();
    }

}