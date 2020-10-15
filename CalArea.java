import java.util.Scanner;
public class CalArea{
	static float area(float a){
		return (a*a);
	}
	static float area(float a, float b){
		return (a*b);
	}
	static double area(double r){
		double pi = 3.14159;
		// System.out.print(pi);
		return (pi*(r*r));
	}
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		while (true){
			System.out.println("\n\nCalculate the Area");
			System.out.println("Enter 1, for Square");
			System.out.println("Enter 2, for Rectangle");
			System.out.println("Enter 3, for Circle");
			System.out.println("Enter 4, Exit");
			System.out.print(">");

			int iChoice = inp.nextInt();
			if(iChoice == 1){
				System.out.print("Enter the Value of Side:");
				int a = inp.nextInt();
				if(a <= 0){
					System.out.println("Entered Value is either zero or negative, Can't Calculate Area!");
					continue;
				}
				System.out.println("Area="+ area(a));
			}
			else if(iChoice == 2){
				System.out.print("Enter the length and breadth:");
				int a = inp.nextInt();
				int b = inp.nextInt();
				if(a <= 0 || b <= 0){
					System.out.println("Entered Value is either zero or negative, Can't Calculate Area!");
					continue;
				}
				System.out.println("Area="+area(a, b));
			}
			else if(iChoice == 3){
				System.out.print("Enter the Radius:");
				double r = inp.nextDouble();
				if(r <= 0){
					System.out.println("Entered Value is either zero or negative, Can't Calculate Area!");
					continue;
				}
				System.out.println("Area="+ area(r));
			}
			else if(iChoice == 4)
				break;
			else
				System.out.println("Wrong Choice");
		}
		inp.close(); 
	}
}
//Anshuman Sharma