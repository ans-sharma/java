class MyPoint{
    private int x, y;
    MyPoint() {
        x = 0;
        y = 0;
    }
    MyPoint(int x, int y){
        this.x = x;
        this.y = y;
    }

    void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }

    int[] getXy(){
        int[] arr = {x,y};
        return arr;
    }

    public String toString(){
        return "(" + x + "," + y + ")";
    }

    void distance(int x2, int y2){
        double value = Math.sqrt((x2-x)*(x2-x) + (y2-y)*(y2-y));
        System.out.println("distance between" + " (" + x + "," + y + ") ,"+" (" + x2 + "," +y2 +") =>"+value);
    }

}

class TestMyPoint{
    public static void main(String[] args) {
        MyPoint a1 = new MyPoint();  // default
        int[] x = a1.getXy();
        for(int i = 0; i < x.length; i ++){
            System.out.println(x[i]);
        }
        a1.setXY(10, 15);
        a1.distance(20, 30);
        System.out.println(a1);
        System.out.println("*****************************************");
        MyPoint a2 = new MyPoint(1,2);
        // x = a1.getXy();
        // for(int i = 0; i < x.length; i ++){
        //     System.out.println(x[i]);
        // }
        a2.distance(2, 4);
        System.out.println(a2);
    }
}