import java.util.ArrayList;
import java.util.Scanner;

class Student{
    int id;
    String name;
    double marks;

    Student(int id,String name,double marks){
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    void display(){
        System.out.println(
                "ID : "+ id +", Name: "+ name + ", Marks: "+ marks
        );
    }
}
public class StudentManagement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        int choice;
        do{
            System.out.println("\n--- Student Management ---");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch(choice){
                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter marks: ");
                    double marks = sc.nextDouble();

                    students.add(new Student(id,name,marks));
                    System.out.println("Student added successfully");
                    break;

                case 2:
                    if(students.isEmpty()){
                        System.out.println("NO student found.");
                    }else{
                        for(Student s : students){
                            s.display();
                        }
                    }
                    break;
                case 3:
                    System.out.print("Enter Id to search: ");
                    int searchId = sc.nextInt();
                    boolean found = false;

                    for(Student s: students){
                        if(s.id == searchId){
                            s.display();
                            found = true;
                            break;
                        }
                    }
                    if(!found){
                        System.out.println("Student not found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter Id to update:");
                    int updateId = sc.nextInt();
                    found = false;

                    for(Student s: students){
                        if (s.id == updateId){
                            sc.nextLine();
                            System.out.print("Enter new name: ");
                            s.name = sc.nextLine();

                            System.out.print("Enter new marks: ");
                            s.marks = sc.nextDouble();

                            System.out.println("Student updated..");
                            found = true;
                            break;
                        }
                    }
                    if(!found){
                        System.out.println("Student not found");
                    }
                    break;
                case 5:
                    System.out.print("Enter ID to delete: ");
                    int deleteId = sc.nextInt();
                    found = false;

                    for(int i = 0; i<students.size(); i++){
                        if(students.get(i).id == deleteId){
                            students.remove(i);
                            System.out.println("Student deleted.");
                            found = true;
                            break;
                        }
                    }
                    if(!found){
                        System.out.println("Student not found");
                    }
                    break;
                case 6:
                    System.out.println("Exiting Program...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while(choice != 6);

        sc.close();
    }
}
