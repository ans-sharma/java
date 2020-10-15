import java.io.*;

public class PrimeWithDataInputStream {
	public static void main(String args[]) throws IOException {
		DataInputStream inp = new DataInputStream(System.in);
		System.out.print("Enter lower limit:");
		String str = inp.readLine();
		int iLowerLimit = Integer.parseInt(str);
		System.out.print("Enter upper limit:");
		str = inp.readLine();
		int iUpperLimit = Integer.parseInt(str);
		if (iLowerLimit < 0 || iUpperLimit < 0) {
			System.out.println("Cant't Find Prime no. b/w a -ve range");
			System.exit(99);
		}
		if (iLowerLimit > iUpperLimit) {
			System.out.println("Input Range is Invalid!\nThe lower value is greater than the upper");
			System.out.println("Do you want to swap the values: 1: yes, 0: no");
			String str1 = inp.readLine();
			int iChoice = Integer.parseInt(str1);
			if (iChoice == 1) {
				int iTemp = iLowerLimit;
				iLowerLimit = iUpperLimit;
				iUpperLimit = iTemp;
			} else if (iChoice == 0) {
				System.out.println("Exit");
				System.exit(99);
			} else
				System.exit(99);
		}
		System.out.print("Prime no within the range (" + iLowerLimit + "," + iUpperLimit + ") are:");
		for (int value = iLowerLimit; value <= iUpperLimit; value++) {
			boolean flag = true;
			if (value < 2)
				continue;
			for (int u = 2; u <= value / 2; u++) {
				if (value % u == 0) {
					flag = false;
					break;
				}

			}
			if (flag == true)
				System.out.print(value + ",");
		}

	}
}
