import java.util.ArrayList;
import java.util.Scanner;

public class studentManagement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> StudentName = new ArrayList<>();
        ArrayList<String> RollNo = new ArrayList<>();
        ArrayList<String> AdmissionNo = new ArrayList<>();
        ArrayList<String> College = new ArrayList<>();

        //noinspection InfiniteLoopStatement
        while (true){

            System.out.println();
            System.out.println("Enter 1 for Student Entry");
            System.out.println("Enter 2 to Search a Student using Roll Number");
            System.out.println("Enter 3 to Delete a Student from the Register");
            System.out.println("Enter 4 to Exit");
            System.out.println();
            System.out.println("Please Enter your Option:");
            int option = sc.nextInt();

            switch (option) {
                case 1 -> {
                    System.out.println("Please enter the Student Name:");
                    String name = sc.next();
                    StudentName.add(name);
                    System.out.println("Please enter the Roll Number:");
                    String rollNo = sc.next();
                    RollNo.add(rollNo);
                    System.out.println("Please enter the Admission Number:");
                    String admissionNo = sc.next();
                    AdmissionNo.add(admissionNo);
                    System.out.println("Please enter the College:");
                    String college = sc.next();
                    College.add(college);
                }
                case 2 -> {
                    System.out.println("Enter the Roll Number of the Student:");
                    String rollNoSearch = sc.next();
                    if (RollNo.contains(rollNoSearch)) {
                        int index = RollNo.indexOf(rollNoSearch);
                        System.out.println("Student name : " + StudentName.get(index));
                        System.out.println("Admission Number : " + AdmissionNo.get(index));
                        System.out.println("College : " + College.get(index));
                    } else {
                        System.out.println("Student Not Found. Please check the details again!!");
                    }
                }
                case 3 -> {
                    System.out.println("Enter the roll number of student to be deleted:");
                    String delStud = sc.next();
                    if (RollNo.contains(delStud)) {
                        int index1 = RollNo.indexOf(delStud);
                        StudentName.remove(index1);
                        RollNo.remove(index1);
                        AdmissionNo.remove(index1);
                        College.remove(index1);

                        System.out.println("Removed the Student Successfully from the Register");
                    } else {
                        System.out.println("Student Not Found. Please check the details again!!");
                    }
                }
                case 4 -> System.out.println("Exiting!!!");
                default -> System.out.println("Invalid Option. Please check the menu again!!");
            }

        }
    }
}
