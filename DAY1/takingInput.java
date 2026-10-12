package DAY1;
import java.util.Scanner;
public class takingInput {
    public static void main(String[] args){

        //Method	Reads
        //nextInt()	Integer
        //nextDouble()	Decimal number
        //next()	One word
        //nextLine()	A complete line of text
        //nextBoolean()	true or false

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("Name :" + name);
        System.out.println("Age :" + age);

        sc.close();
    }
}
