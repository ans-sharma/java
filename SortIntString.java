// Write a Java program to sort a numeric array and a string array.
import java.util.Scanner;
public class SortIntString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Size of Array: ");
        int iSize = input.nextInt();
        String[] Str = new String[iSize];
        System.out.println("Enter the Names: ");
        for(int i =0; i<iSize; i++){
            Str[i] = input.next();
        }
        Sort s = new Sort();
        s.sort(Str);
        System.out.println("Sorted Array: ");
        for(int i = 0; i<iSize; i++){
            System.out.println(Str[i]);
        }
    }
}

class Sort {
    float[] sort(float[] fArray) {
        if(fArray.length == 0){
            System.out.println("Array is Empty");
            return fArray;
        }
        for (int u = 0; u < fArray.length; u++) {
            for (int v = u; v < fArray.length; v++) {
                if (fArray[u] > fArray[v]) {
                    float fTemp = fArray[u];
                    fArray[u] = fArray[v];
                    fArray[v] = fTemp;
                }
            }
        }
        return fArray;
    }

    int[] sort(int[] iArray) {
        if(iArray.length == 0){
            System.out.println("Array is Empty");
            return iArray;
        }
        for (int u = 0; u < iArray.length; u++) {
            for (int v = u; v < iArray.length; v++) {
                if (iArray[u] > iArray[v]) {
                    int iTemp = iArray[u];
                    iArray[u] = iArray[v];
                    iArray[v] = iTemp;
                }
            }
        }
        return iArray;
    }

    String[] sort(String[] sArray) {
        if(sArray.length == 0){
            System.out.println("Array is Empty");
            return sArray;
        }
        for (int x = 0; x < sArray.length; x++) {
            for (int v = x; v < sArray.length; v++) {
                if (strCmp(sArray[x], sArray[v]) > 0) {
                    String sTemp = sArray[x];
                    sArray[x] = sArray[v];
                    sArray[v] = sTemp;
                }
            }
        }
        return sArray;
    }

    // returns +ve value when sA > sB,
    // 0 when sA = sB,
    // -ve value when sA < sB
    private int strCmp(String sA, String sB) {
        int l1 = sA.length();
        int l2 = sB.length();
        int iMin = Math.min(l1, l2);
        for (int u = 0; u < iMin; u++) {
            int cmp1 = (int) sA.charAt(u);
            int cmp2 = (int) sB.charAt(u);
            if (cmp1 != cmp2) {
                return cmp1 - cmp2;
            }
        }
        if (l1 != l2) {
            return l1 - l2;
        } else
            return 0;
    }
}