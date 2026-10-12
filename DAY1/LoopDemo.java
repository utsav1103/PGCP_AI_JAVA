package DAY1;

public class LoopDemo {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        int i = 1;

        while (i <= 5) {
            System.out.println(i);
            i++;
        }

        do {
            System.out.println(i);
            i++;
        } while (i <= 5);

    }
}