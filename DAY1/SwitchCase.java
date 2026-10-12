package DAY1;
import java.util.Scanner;
public class SwitchCase {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("3. wednesday");
        System.out.println("1. monday");
        System.out.println("2. tuesday");

        System.out.println("Enter your choice: ");
        int choice = sc.nextInt();

        switch(choice){
            case 1:
                System.out.println("you selected monday");
                break;
            case 2:
                System.out.println("you selected tuesday");
                break;
            case 3:
                System.out.println("you selected wednesday");
                break;
            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}
