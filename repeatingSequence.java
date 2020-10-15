
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
        sText = input.nextLine();
        for( int i = 0; i < sText.length(); i++){
            // String seq = sText.substring(0,i);
            for( int j = 0; j < sText.length(); j++){
                String seq = sText.substring(j,j+i);
                for( int k = 0; k < sText.length(); k++){
                        seq2 = sText.substring(k,k+i);
                    if(seq == seq2){
                        iCount++;
                    }
                }
                if(iCount>iMax){
                    iMax = iCount;
                    sMax = seq;
                }
            }
        }
        System.out.println(" "+iMax+" "+sMax);
    }
}