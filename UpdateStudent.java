import java.util.ArrayList;
import java.util.Scanner;

public class UpdateStudent {
    public static void updateStudent(ArrayList<Person> students, Scanner input) {
        System.out.print("أدخل اسم الطالب لتحديث المعلومات: ");
        String updateName = input.nextLine();
        boolean found = false;

        for (Person student : students) {
            if (student.getName().equalsIgnoreCase(updateName)) {
                System.out.print("أدخل الجنس الجديد: ");
                student.setGender(input.nextLine());
                System.out.print("أدخل المجال الجديدة: ");
                student.setKoleg(input.nextLine());
                System.out.print("أدخل العمر الجديد: ");
                student.setAge(input.nextInt());
                System.out.print("ادخل رقم الطالب الجديد");
                student.setId(input.nextInt());
                input.nextLine(); // لتناول الخط الجديد بعد إدخال الرقم
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("الطالب غير موجود.");
        }
    }
}
