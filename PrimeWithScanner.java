import java.util.*;
public class PrimeWithScanner
{
	public static void main(String args[])
	{
		Scanner inp = new Scanner(System.in);
		System.out.print("Enter lower limit:");
		int iLowerLimit = inp.nextInt();
		System.out.print("Enter upper limit:");
		int iUpperLimit = inp.nextInt();
		if (iLowerLimit<0 || iUpperLimit<0){
			System.out.println("Cant't Find Prime no. b/w a -ve range");
			System.exit(99);
		}
		if(iLowerLimit>iUpperLimit){
			System.out.println("Input Range is Invalid!\nThe lower value is greater than the upper");
			System.out.println("Do you want to swap the values: 1: yes, 0: no");
			int iChoice = inp.nextInt();
			if(iChoice == 1){
				int iTemp = iLowerLimit;
				iLowerLimit = iUpperLimit;
				iUpperLimit = iTemp;
			}
			else if(iChoice == 0){
				System.out.println("Exit");
				System.exit(99);
			}
			else 
				System.exit(99);
		}
		System.out.print("Prime no within the range (" + iLowerLimit + "," + iUpperLimit + ") are:");
		for(int value = iLowerLimit; value <= iUpperLimit; value++)
		{
			boolean flag = true;
			if(value < 2)
				continue;
			for(int u = 2; u <= value/2; u++)
			{
				if (value%u==0)
				{
					flag = false;
					break;
				}

			}
			if(flag == true)
			System.out.print(value + ",");
			inp.close();
		}

	}
}
