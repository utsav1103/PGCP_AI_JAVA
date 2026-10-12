package DAY1.Array;
import java.util.Scanner;
public class Ques2 {
//    public static void main(String[] args){
//        int[] marks = {75,82,68,90,77};
//
//        int sum = 0;
//
//        for(int i = 0; i < marks.length; i++){
//            sum = sum + marks[i];
//        }
//
//        double average = (double) sum / marks.length;
//
//        System.out.println("Total marks: " + sum);
//        System.out.println("Average marks: " + average);
//    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        System.out.println("Your numbers are:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        sc.close();
    }
}
