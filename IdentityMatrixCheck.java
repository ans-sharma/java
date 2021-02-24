import java.util.Scanner;
public class IdentityMatrixCheck {
    public static void main(String[] args) {
        int[] iDimension = new int[2];
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of Matrix, (example:- 2x3)\n=>");
        String sTemp = input.next();
        MatrixInput mInput = new MatrixInput();
        iDimension = mInput.input(sTemp);
        // System.out.print(iDimension[0] + " " + iDimension[1]);
        int[][] iMatrix = new int[iDimension[0]][iDimension[1]];
        System.out.println("Enter the Elements in the Matrix.");
        for(int i = 0; i < iDimension[0]; i++) {
            for(int j = 0; j < iDimension[1]; j++) {
                System.out.print("[" + iDimension[i] + "][" + iDimension[j] + "] <= ");
                iMatrix[i][j] = input.nextInt();
            }
        }
    }
}

class MatrixInput {
    int[] input(String sTemp){
        String sRows = "", sCols = "";
        boolean flag = false;
        int[] iDimension = new int[2];
        for(int i = 0; i < sTemp.length(); i++) {
            if(sTemp.charAt(i) == 'x' || sTemp.charAt(i) == 'X')
                flag = true;
            else if(Character.isDigit(sTemp.charAt(i)) && flag == false)
                sRows = sRows + sTemp.charAt(i);
            else
                sCols = sCols + sTemp.charAt(i);
        }
        iDimension[0] = Integer.parseInt(sRows);
        iDimension[1] = Integer.parseInt(sCols);
        return iDimension;
    }
}