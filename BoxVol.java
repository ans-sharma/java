import java.util.*;
public class BoxVol {
    public static void main(String[] args) {
        System.out.println("Enter length, Breadth and Height: ");
        Scanner inp = new Scanner(System.in);
        double l = inp.nextDouble();
        double b = inp.nextDouble();
        double h = inp.nextDouble();
        if(l<=0 || b<=0 || h<=0){
            System.out.println("Invalid Input");
            System.exit(1);
        }
        Box obj = new Box(l,b,h);
        double v = obj.volume();
        System.out.println(v + " unit^3");
        inp.close();
    }
}

class Box{
    double l, b, h, vol;
    Box(double x, double y, double z)
    {
         l = x;
         b = y;
         h = z;
    }
    double volume(){
        double vol = l*b*h;
        return vol;
    }
}