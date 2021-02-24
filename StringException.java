class StringException{
    public static void main(String[] args){
        String txt = "xyz";
        try{
            System.out.println(txt.charAt(2));
        }
        catch(StringIndexOutOfBoundsException e){
            System.out.println("String Index Out Of Bound\n" + e);
        }
    }
}