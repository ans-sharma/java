
// Java Program to find the longest repeating sequence in a string
// I/P : str = &quot;acbdfghybdf&quot;
// O/P : bdf

import java.util.Scanner;

public class repeatingSequence {

    public static void main(String[] args) {
        String sText, sMax = "", seq2;
        Scanner input = new Scanner(System.in);
        int iMax = 0, iCount = 0;
        System.out.print("Enter the String Sequence: ");
        sText = input.next();
        for(int steps=1; steps <= sText.length(); steps++){
            for (int i = 0; i < sText.length(); i++) {
                int count = 0;
                if(i+steps>sText.length()){
                    break;
                }
                String check = sText.substring(i, i+steps);
                for (int j = 0; j < sText.length(); j++){
                    if(j+steps>sText.length()){
                        break;
                    }
                    if(check.equals(sText.substring(j, j+steps))){
                        // System.out.println("working loop");
                        count++;
                    }
                }
                System.out.print("Sequence: " + check + " = " + count + "\n");
            }
        }
    }
}