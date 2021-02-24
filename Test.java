public class superclass {
    public void displayResult() {
    System.out.println("superclass");
    }
    }
    public class subclass extends superclass {
    public void displayResult() {
    
    System.out.println("subClass");
    super.displayResult();
    }
    public static void main(String args[]) {
    subclass obj = new subclass();
    obj.displayResult();
    }
    }