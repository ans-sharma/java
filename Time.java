import java.util.*;

public class Time {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the time in, hh mm ss format:");
        int hh = inp.nextInt();
        int mm = inp.nextInt();
        int ss = inp.nextInt();
        if(hh<=0 || mm<=0 || ss<=0){
            System.out.println("Invalid Input");
            System.exit(1);
        }
        Clock c = new Clock(hh, mm, ss);
        c.display();
        inp.close();
    }
}

class Clock {
    private int hour, min, sec;
    Clock(int hh, int mm, int ss) {
        hour = hh; 
        min = mm;
        sec = ss;
        check();
        if (hour >=24 || hour < 0){
            System.out.println("Time is invalid");
            System.exit(1);
        } 
    }

    void display() {
        if (hour <= 12) {
            System.out.println(hour + ":" + min + ":" + sec + " AM");
        } else {
            int hour1 = hour - 12;
            System.out.println(hour1 + ":" + min + ":" + sec + " PM");
        }
    }
    void check(){
        if(min>60){
            hour = hour + 1;
            min = min -60;
        }
        if(sec>60){
            min = min + 1;
            sec = sec - 60;
        }
    }
}