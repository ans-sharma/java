import java.util.Scanner;
class QuickSort 
{ 
    static int count = 0;
    int partition(int arr[], int low, int high) 
    {   count++;
        int pivot = arr[high];  
        int i = (low-1);
        for (int j=low; j<high; j++) 
        { 
            if (arr[j] < pivot) 
            { 
                i++; 
                int temp = arr[i]; 
                arr[i] = arr[j]; 
                arr[j] = temp; 
            } 
        } 
        int temp = arr[i+1]; 
        arr[i+1] = arr[high]; 
        arr[high] = temp; 
  
        return i+1; 
    } 

    void sort(int arr[], int low, int high) 
    { 
        if (low < high) 
        {
            int pi = partition(arr, low, high); 
            sort(arr, low, pi-1); 
            sort(arr, pi+1, high); 
        } 
    } 
    static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i]+" "); 
        System.out.println(); 
    } 
   public static void main(String args[]) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Size of Array: ");
        int iSize = input.nextInt();
        int[] arr = new int[iSize];
        int n = arr.length;
        System.out.println("Enter the Elements in Array: ");
        for(int i = 0; i<iSize; i++){
            arr[i] = input.nextInt();
        }
        QuickSort ob = new QuickSort(); 
        ob.sort(arr, 0, n-1); 
        System.out.println("sorted array"); 
        printArray(arr);
    } 
} 
