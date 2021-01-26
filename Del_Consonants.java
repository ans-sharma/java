// Write a program in java to delete all consonants from an input string and print the result string.

import java.util.*;

public class Del_Consonants {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean flag;
        String text, vowels, newText = "";
        vowels = "aeiouAEIOU";
        System.out.println("Enter the text: ");
        text = s.nextLine();
        // System.out.println(text);
        for(int i=0; i< text.length(); i++){
            flag = false;
            for(int j = 0; j< vowels.length(); j++){
                if(text.charAt(i)==vowels.charAt(j)){
                    flag = true;
                    break;
                }
            }
            if(flag == false)
                newText = newText + text.charAt(i);
        }
        System.out.println("Modefied String: "+newText);
    }
}
