import java.util.*;

public class ElementCount {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the Size of Array: ");
        int iSize = inp.nextInt();
        Check(iSize);
        int iArray[] = new int[iSize];
        System.out.println("Enter the Elements in Array.");
        for (int i = 0; i < iSize; i++) {
            System.out.print("Array[" + i + "]<= ");
            iArray[i] = inp.nextInt();
        }
        Find find = new Find(iArray);
        find.countNumberSorted();
        inp.close();
    }

    static void Check(int iValue) {
        if (iValue <= 0) {
            System.out.print("Invalid Input!!\nIndexing Cannot be -ve.");
            System.exit(99);
        }
    }
}

class Find {
    private int[] iArray; // declaring an empty integer array
    Find(int[] iArray) {
        this.iArray = new int[iArray.length];
        for (int z = 0; z < iArray.length; z++) {
            this.iArray[z] = iArray[z];
        }
    }

    void countNumberSorted() {
        int iJump = 1;
        Arrays.sort(this.iArray); // Sorting the Array before counting
        System.out.println("\nOccurrence of Each Element in the Array.");
        for (int x = 0; x < this.iArray.length; x = x + iJump) {
            int iCount = 1;
            for (int y = x + 1; y < this.iArray.length; y++) {
                if (this.iArray[x] == this.iArray[y]) {
                    iCount = iCount + 1;
                }
            }
            iJump = iCount;
            System.out.println(this.iArray[x] + " => " + iCount + " times.");
        }
    }

    void countNumber() {
        int inf = 9999999; // Taking a very large value, assuming user will not enter it.
        System.out.println("\nOccurrence of Each Element in the Array.");
        for (int x = 0; x < this.iArray.length; x++) {
            int iCount = 1;
            if (this.iArray[x] == inf)
                continue;
            else{
                for (int y = x + 1; y < this.iArray.length; y++) {
                    if (this.iArray[x] == this.iArray[y]) {
                        iCount = iCount + 1;
                        this.iArray[y] = inf;
                    }
                }
            }
            System.out.println(this.iArray[x] + " => " + iCount + " times.");
        }
    }
}
