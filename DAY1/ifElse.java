package DAY1;
import java.util.Scanner;
public class ifElse {
//    public static void main(String[] args) {
//        int age = 20;
//
//        if (age >= 18) {
//            System.out.println("You are eligible to vote.");
//        }
//    }
        public static void main(String[] args) {

//            int age = 15;
//
//            if (age >= 18) {
//                System.out.println("Eligible to vote");
//            } else {
//                System.out.println("Not eligible to vote");
//            }
//            int marks = 96;
//
//            if (marks >= 85) {
//                System.out.println("Grade A");
//            } else if (marks >= 70) {
//                System.out.println("Grade B");
//            } else if (marks >= 50) {
//                System.out.println("Grade C");
//            } else {
//                System.out.println("Grade F");
//            }
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter your marks: ");
            int marks = sc.nextInt();

            if (marks < 0 || marks > 100) {
                System.out.println("Invalid marks");
            } else if (marks >= 85) {
                System.out.println("Grade A");
            } else if (marks >= 70) {
                System.out.println("Grade B");
            } else if (marks >= 50) {
                System.out.println("Grade C");
            } else {
                System.out.println("Grade F");
            }

            sc.close();

        }
}
