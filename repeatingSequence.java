
// Java Program to find the longest repeating sequence in a string
// I/P : str = &quot;acbdfghybdf&quot;
// O/P : bdf

import java.util.Scanner;
public class repeatingSequence{

    public static void main(String[] args) {
        String sText, sMax = "", seq2;
        Scanner input = new Scanner(System.in);
        int iMax = 0, iCount = 0;
        System.out.print("Enter the String Sequence: ");
        sText = input.next();
        for(int i = 0; i < sText.length(); i++){
            int count = 0;
            char check = sText.toCharArray()[i];
            for(int j = 0; j < sText.length(); j++){
                if(check == sText.toCharArray()[j]){
                    count++;
                }
            }
            System.out.print("Sequence: " + check + " = " + count + "\n");
        }
    }
}