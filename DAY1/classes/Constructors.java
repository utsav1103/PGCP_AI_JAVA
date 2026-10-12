package DAY1.classes;

class Student{
    String name;
    int rollNo;
    double marks;


    Student(String name,int rollNo,double marks){
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;

    }
    void displayDetails(){
        System.out.println("Name :" + name);
        System.out.println("Roll No :" + rollNo);
        System.out.println("Marks :" + marks);
    }
}

public class Constructors {
    public static void main(String[] args){
        Student s1 = new Student("Utsav",32,90);
        Student s2 = new Student("Mikasa",33,91);

        s1.displayDetails();
        System.out.println();
        s2.displayDetails();
    }
}
