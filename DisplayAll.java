
import java.util.ArrayList;

public class DisplayAll {
    public static void displayAll(ArrayList<Person> students) {
        for (int i=0; i< students.size() ;i++) {

            Person student = students.get(i);
            System.out.println("Student " + (i + 1) + ":");
            System.out.println("Name: " + student.getName());
            System.out.println("Gender: " + student.getGender());
            System.out.println("Koleg: " + student.getKoleg());
            System.out.println("Age: " + student.getAge());
            System.out.println("ID: " + student.getId());
            System.out.println("-------------------------");
            
            
        }
    }
}