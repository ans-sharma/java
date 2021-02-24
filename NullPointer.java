class NullPointer {
    public static void main(String[] args){
        String txt = null;
        try{
            System.out.println(txt.charAt(5));
        }
        catch(NullPointerException e){
            System.out.println("Null Pointer Exception\n" + e);
        }
    }
}

// class NullPointer {
//     public static void main(String[] args){
//         String txt = null, abs = "s";
//         try{
//             if(txt.equals(abs))
//                 ;
//         }
//         catch(NullPointerException e){
//             System.out.println("Null Pointer Exception\n" + e);
//         }
//     }
// }