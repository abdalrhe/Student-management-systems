import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Person> students = new ArrayList<>();
        
        while (true) {
            System.out.println("--- نظام إدارة الطلاب ---");
            System.out.println("1. إضافة طالب");
            System.out.println("2. عرض جميع الطلاب");
            System.out.println("3. البحث عن طالب");
            System.out.println("4. تحديث معلومات طالب");
            System.out.println("5. حذف طالب");
            System.out.println("6. خروج");
            System.out.print("أدخل اختيارك: ");
            
            int choice = input.nextInt();
            input.nextLine(); // لتناول الخط الجديد بعد إدخال الرقم

            switch (choice) {
                case 1:
                    AddStudent.addStudent(students, input);
                    break;
                case 2:
                     DisplayAll.displayAll(students);
                    break;
                case 3:
                    SearchStudent.searchStudent(students, input);
                    break;
                case 4:
                    UpdateStudent.updateStudent(students, input);
                    break;
                case 5:
                    DeleteStudent.deleteStudent(students, input);
                    break;
                case 6:
                    System.out.println("شكراً لاستخدامك نظام إدارة الطلاب.");
                    return;
                default:
                    System.out.println("اختيار غير صحيح، حاول مرة أخرى.");
            }
        }
    }
}
