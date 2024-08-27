import java.util.ArrayList;
import java.util.Scanner;
public class AddStudent {
    public static void addStudent(ArrayList<Person> students, Scanner input) {
     
        System.out.print("أدخل اسم الطالب: ");
        String name = input.nextLine();
        System.out.print("أدخل الجنس: ");
        String gender = input.nextLine();
        System.out.print("أدخل الكلية: ");
        String koleg = input.nextLine();
        System.out.print("أدخل العمر: ");
        int age =input.nextInt();
        System.out.println("ادخل رقم الطالب");
        int id = input.nextInt();
        input.nextLine(); // لتناول الخط الجديد بعد إدخال الرقم
        students.add(new Person(name, gender,koleg , age,id));
        
    }
}
