import java.util.Scanner;
class LibraryMember{
    Scanner input = new Scanner(System.in);
    private int MemberId;
    private long PhoneNo;
    private String MemberName, Address;
    void read(int MemberId){
        this.MemberId = MemberId;
        System.out.print("Enter the Name: ");
        MemberName = input.next();
        System.out.print("Enter the Address: ");
        Address = input.next();
        System.out.print("Enter the Phone No: ");
        PhoneNo = input.nextLong();
        checkPhone();   //PhoneNo must have 10 Digits
    }
    void display(){
        System.out.println("Id: "+ MemberId + "\nName: "+ MemberName + "\nAddress: "+ Address + "\nPhone No: "+ PhoneNo);
    }
    int getMemberId(){
        return MemberId;
    }
    void checkPhone(){ //Recursive PhoneNo Checking Function
        if(String.valueOf(PhoneNo).length() < 10 || String.valueOf(PhoneNo).length() > 10){
            System.out.print("PhoneNo is Invalid:\nEnter Again: ");
            PhoneNo = input.nextLong();
            checkPhone();
        }
    }
    // CheckMemberId()
    // void changeMemberId(int MemberId){
    //     this.MemberId = MemberId;
    // }
    // static void checkMemberId(LibraryMember[] s, int MemberId, int loc){
    //     Scanner input = new Scanner(System.in);
    //     int iLength = loc;
    //     for(int i=0; i<iLength;i++){
    //         if(i == loc)
    //             continue;
    //         else if(MemberId == s[i].getMemberId()){
    //             System.out.print("This MemberId is Present, Enter a New MemberId: ");
    //             MemberId = input.nextInt();
    //             s[i].changeMemberId(MemberId);
    //             checkMemberId(s, MemberId, loc);
    //         }
    //     }
    //     input.close();
    // }
}

class Student extends LibraryMember{
    Scanner input = new Scanner(System.in);
    private int RollNo;
    private String Stream;
    void read(int MemberId){
        super.read(MemberId);
        System.out.print("Enter the RollNO: ");
        this.RollNo = input.nextInt();
        System.out.print("Enter the Stream: ");
        this.Stream = input.next();
    }
    void display(){
        super.display();
        System.out.println("Roll No: "+ RollNo + "\nStream: "+ Stream);
    }
}

class Faculty extends LibraryMember{
    Scanner input = new Scanner(System.in);
    private int FacultyId;
    private String Designation;
    void read(int MemberId){
        super.read(MemberId);
        System.out.print("Enter the FaculityId: ");
        this.FacultyId = input.nextInt();
        System.out.print("Enter the Designation: ");
        this.Designation = input.next();
    }
    void display(){
        super.display();
        System.out.println("FacultyId: " + FacultyId + "\nDesignatio: " + Designation);
    }
}

public class Library {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int iSize, count =0;
        int MemberId;
        System.out.println("*******Welcome to Library Managment System*******");
        System.out.print("No. of Members: ");
        iSize = input.nextInt();
        LibraryMember[] s = new LibraryMember[iSize];
        while(true){
            System.out.println("\nEnter\n\t1: Data Entry\n\t2: Display All\n\t3: Search\n\t4: Exit");
            int iChoice = input.nextInt();
            if(iChoice == 1){
                while(true){
                    System.out.println("\nEnter\n\t1: Student\n\t2: Faculty\n\t3: Back to Pre. Menu");
                    int iChoice1 = input.nextInt();
                    if(count==iSize){
                        System.out.println("Data is Full");
                        break;
                    }
                    if(iChoice1 == 1){
                        System.out.print("Enter the MemberId: ");
                        MemberId = input.nextInt();
                        while(true){
                            boolean ch1 = checkMemberId(MemberId, s, count);
                            if(ch1 == false){
                                System.out.println("MemberID("+ MemberId +") is Already Present:");
                                System.out.print("Please Enter a New MemberID: ");
                                MemberId = input.nextInt();
                                boolean check = checkMemberId(MemberId, s, count);
                            }
                            else
                                break;
                        }
                        s[count] = new Student();
                        s[count].read(MemberId);
                        // LibraryMember.checkMemberId(s, s[count].getMemberId(), count);
                        count++;
                    }
                    else if(iChoice1 == 2){
                        System.out.print("Enter the MemberId: ");
                        MemberId = input.nextInt();
                        while(true){
                            boolean ch1 = checkMemberId(MemberId, s, count);
                            if(ch1 == false){
                                System.out.println("MemberID("+ MemberId +") is Already Present:");
                                System.out.print("Please Enter a New MemberID: ");
                                MemberId = input.nextInt();
                                boolean check = checkMemberId(MemberId, s, count);
                            }
                            else
                                break;
                        }
                        s[count] = new Faculty();
                        s[count].read(MemberId);
                        // LibraryMember.checkMemberId(s, s[count].getMemberId(), count);
                        count++;
                    }
                    else if(iChoice1 == 3)
                        break;
                    else
                        System.out.println("Invalid Input");
                }
            }
            else if(iChoice == 2){
                if(count == 0){
                    System.out.println("No Data Present");
                    continue;
                }
                for(int i = 0; i < count; i++){
                    System.out.println("------------------------------------");
                    s[i].display();
                    System.out.println("------------------------------------");
                }
            }
            else if(iChoice == 3){
                if(count == 0){
                    System.out.println("No Data Present");
                    continue;
                }
                System.out.print("Enter the MemberId: ");
                MemberId = input.nextInt();
                boolean found = false;
                for(int i = 0; i<count; i++){  //iSize should be count
                    if (s[i].getMemberId() == MemberId){
                        System.out.println("------------------------------------");
                        s[i].display();
                        System.out.println("------------------------------------");
                        found = true;
                    }
                    // System.out.println("No Member Found! Please Check the MemberId");
                }
                if(found == false)
                    System.out.println("No Member Found! Please Check the MemberId");
            }
            else if(iChoice == 4){
                break;
            }
            else
                System.out.println("Invalid Input, Please try Again!");
        }
    }

    public static boolean checkMemberId(int MemberId, LibraryMember[] s, int count){
        for(int i=0; i < count; i++){
            if (s[i].getMemberId() == MemberId)
                return false;
        }
        return true;
    }
}