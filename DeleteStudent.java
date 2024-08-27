import java.util.ArrayList;
import java.util.Scanner;

public class DeleteStudent {
    public static void deleteStudent(ArrayList<Person> students, Scanner input) {
        System.out.print("أدخل اسم الطالب للحذف: ");
        String deleteName = input.nextLine();
        boolean found = false;

        for (Person student : students) {
            if (student.getName().equalsIgnoreCase(deleteName)) {
                students.remove(student);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("الطالب غير موجود.");
        }
    }
}
