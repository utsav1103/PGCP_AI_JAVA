package DAY1.method;

public class MethodDemo {
    static void greet(){
        System.out.println("Welcome to Java!");
    }
    static void welcome(String name){
        System.out.println("Hello," + name);
    }


    public static void main(String[] args){
        welcome("Mikasa");
        greet();
    }
}
