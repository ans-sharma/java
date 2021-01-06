import java.util.*;

public class rowAndColMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter tha No. of rows and cols in matrix: ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        if(r <= 0 || c <= 0){
            System.out.println("Array size Error!");
            System.exit(1);
        }
        int mat[][];
        mat = new int[5][5];
        System.out.println("Enter the values in the Matrix:");
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                mat[i][j] = sc.nextInt();
            }
        }
        //row min
        for (int i = 0; i < r; i++) { 
            int min = mat[i][0]; 
            for (int j = 1; j < c; j++) { 
                if (mat[i][j] < min) { 
                    min = mat[i][j]; 
                } 
            } 
            mat[i][c] = min;
        } 
        // col min
        for (int i = 0; i < r; i++) { 
            int min = mat[0][i]; 
            for (int j = 1; j < c; j++) { 
                if (mat[j][i] < min) { 
                    min = mat[j][i]; 
                } 
                mat[r][i] = min;
            }
        }
        for(int i = 0; i < r+1; i++){
            for(int j = 0; j < c+1; j++){
                System.out.print(mat[i][j] + " ");
                if(j==c-1){
                    System.out.print("|");
                }
            }
            if(i==r-1){
                System.out.println();
                for(int k = 0; k < c+1; k++){
                    System.out.print("--");
                }
            }
            System.out.println();
        }
    }
}
