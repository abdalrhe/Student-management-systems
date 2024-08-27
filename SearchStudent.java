import java.util.ArrayList;
import java.util.Scanner;

public class SearchStudent {
    public static void searchStudent(ArrayList<Person> students, Scanner input) {
        System.out.print("أدخل اسم الطالب للبحث: ");
        String searchName = input.nextLine();
        boolean found = false;

        for (Person student : students) {
            if (student.getName().equalsIgnoreCase(searchName)) {
                student.printInfo();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("الطالب غير موجود.");
        }
    }
}
