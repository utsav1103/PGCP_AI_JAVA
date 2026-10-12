package DAY1.classes;

class Car{
    String brand;
    String color;
    int speed;
}
public class CarDemo {
    public static void main(String[] args){
        Car c1 = new Car();

        c1.brand = "BMW";
        c1.color = "Green";
        c1.speed = 300;

        Car c2 = new Car();
        c2.brand = "Hyundai";
        c2.color = "Blue";
        c2.speed = 250;

        System.out.println(c1.brand);
        System.out.println(c2.brand);
        System.out.println(c1.color);
        System.out.println(c2.color);
        System.out.println(c1.speed);
        System.out.println(c2.speed);
    }
}
