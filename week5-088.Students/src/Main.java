
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write here the main program
        ArrayList<Student> students = new ArrayList<Student>();
        Scanner reader = new Scanner(System.in);
        String name;
        String studentNumber;
        while (true) {
            System.out.print("name: ");
            name = reader.nextLine();
            if (name.equals("")) {
                break;
            }
            System.out.print("studentnumber:");
            studentNumber = reader.nextLine();
            students.add(new Student(name,studentNumber));
            
        }
        
        for (Student student:students) {
            System.out.println(student);
        }
        
        System.out.println("");
        
        System.out.print("Give search term: ");
        String term = reader.nextLine();
        System.out.println("Result:");
        for (Student student:students) {
            if (student.getName().contains(term)) {
                System.out.println(student);
            }            
        }        
        
    }
}
