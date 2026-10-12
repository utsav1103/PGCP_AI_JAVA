package DAY1.method;

public class EvenOdd {
    static boolean isEven(int number){
        return number % 2 == 0;
    }

    public static void main(String[] args){
        System.out.println(isEven(8));
        System.out.println(isEven(5));

    }
}
