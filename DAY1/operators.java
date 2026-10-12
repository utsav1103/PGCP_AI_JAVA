package DAY1;
import java.util.Scanner;

public class operators {
    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter first number: ");
//        int a = sc.nextInt();
//        System.out.print("Enter Second number: ");
//        int b = sc.nextInt();
//
//        System.out.println("Addition = " + (a + b));
//        System.out.println("Subtraction = " + (a - b));
//        System.out.println("Multiplication = " + (a * b));
//        System.out.println("Division = " + (a / b));
//        System.out.println("Remainder = " + (a % b));
//
//        sc.close();
    // Assignment operators
//        int x = 10;
//
//        x += 5;
//        System.out.println(x);
//
//        x *= 2;
//        System.out.println(x);


    // Relational or comparison operators

        //Remember the difference between = and ==:
        // = assigns a value.
        // == compares two values.

        int age = 22;

        System.out.println(age >= 18);
        System.out.println(age < 18);


    // logical operators


        int marks = 75;
        boolean attendance = true;

        System.out.println(marks >= 40 && attendance);

        // increment and decrement

        int x = 5;

        x++;
        System.out.println(x);

        x--;
        System.out.println(x);
    }
}
