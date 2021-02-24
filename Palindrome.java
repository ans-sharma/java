import java.util.*;
public class Palindrome {
    public static void main(String args[]) {
        String sOri, sRev = "";
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number to check if it's a palindrome: ");
        sOri = in.nextLine();
        int length = sOri.length();
        for (int i = length - 1; i >= 0; i--)
        sRev = sRev + sOri.charAt(i);
        if (sOri.equals(sRev))
            System.out.println("It is a palindrome.");
        else
            System.out.println("It is not a palindrome.");
    }
}
