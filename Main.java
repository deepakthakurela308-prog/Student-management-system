import java.util.*;

public class Main {

    static ArrayList<Student> students = new ArrayList<>();

    static void addStudent() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ID: ");
        int id = sc.nextInt();

        System.out.print("Enter Name: ");
        String name = sc.next();

        System.out.print("Enter Marks: ");
        int marks = sc.nextInt();

        students.add(new Student(id, name, marks));

        System.out.println("Student Added Successfully!");
    }

    static void displayStudents() {
        for(Student s : students) {
            s.display();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while(true) {

            System.out.println("\n1 Add Student");
            System.out.println("2 Display Students");
            System.out.println("3 Exit");

            System.out.print("Choose option: ");

            int choice = sc.nextInt();

            switch(choice) {

                case 1:
                    addStudent();
                    break;

                case 2:
                    displayStudents();
                    break;

                case 3:
                    System.exit(0);

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
