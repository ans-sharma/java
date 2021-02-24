import java.util.Scanner;

class DevString {
    void devStringUsingSub(String sText, int iParts) {
        if(sText.length() % iParts == 0){
            iParts = sText.length() / iParts;
            for(int i = 0; i < sText.length(); i+=iParts){
                String sSub = sText.substring(i, i + iParts);
                System.out.print ("|" + sSub + "| ");
            }
        }
        else
            System.out.println("Divding the string (" + sText + ") in " + iParts + " equal parts is not possible.");
    }

    void devString(String sText, int iParts) {
        if(sText.length() % iParts == 0) {
            iParts = sText.length() / iParts;
            for(int i = 0; i < sText.length(); i+=iParts){
                int iCheck = 0;
                String sSub = "";
                while(iCheck < iParts){
                    sSub = sSub  + sText.charAt(i+iCheck);
                    iCheck += 1;
                }
                System.out.print ("|" + sSub + "| ");
            }
        }
        else
            System.out.println("Divding the string (" + sText + ") in " + iParts + " equal parts is not possible.");
    }
}

public class DivNEqualParts {
    public static void main(String[] args) {
        String sText;
        int iParts;
        DevString dev = new DevString();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the String: ");
        sText = input.nextLine();
        System.out.print("How many parts do you want to split the string: ");
        iParts = input.nextInt();
        dev.devString(sText, iParts);
        // dev.devStringUsingSub(sText, iParts);
    }
}
