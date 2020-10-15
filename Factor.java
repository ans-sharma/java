import java.util.*;
public class Factor
{
	public static void main(String args[])
	{
		Scanner inp = new Scanner(System.in);
		System.out.print("Enter a No:" );
		int iValue = inp.nextInt();
		if (iValue<0){
			System.out.println("Cant't Find Factor of a -ve no.");
			System.exit(99);
		}
		System.out.print("Factors of " + iValue + " are: ");
		for(int i = 1; i <= iValue; i++)
		{
			if(iValue % i == 0)
				System.out.print(i + ",");
		} 
		inp.close();
	}
} 