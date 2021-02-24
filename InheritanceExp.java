import java.util.*;
public class InheritanceExp {
    public static void main(String[] args) {
        B b = new B();
        b.setData();
        System.out.println("Max Value:" + b.maxValue());
        System.out.println("Min Value:" + b.minValue());
    }
}
class A{
    private int i, j;
    public void setData(){
	Scanner inp = new Scanner(System.in);
        System.out.print("Enter the Value of i and j\n:");
        i = inp.nextInt();
        System.out.print(":");
        j = inp.nextInt();
    }
    public int getDataI(){
        return i;
    }
    public int getDataJ(){
        return j;
    }

}
class B extends A{
    int i, j;
    int maxValue(){
        i = getDataI();
        j = getDataJ();
        if(i>j)
            return i;
        else
            return j;
    }
    int minValue(){
        i = getDataI();
        j = getDataJ();
        if(i<j)
            return i;
        else
            return j;
    }
}

