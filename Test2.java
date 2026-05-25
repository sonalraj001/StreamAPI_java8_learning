import java.util.ArrayList;
import java.util.List;

public class Test2 {
    public static List<Student> getstudentList(){

        ArrayList<Student> studentList = new ArrayList<Student>();
        Student s1 = new Student(1,"pop",47383,27);
        Student s2 = new Student(1,"pop",47383,23);

        studentList.add(s1);
        studentList.add(s2);

        return studentList;
    }

    public static void main(String[] args) {
        getstudentList().stream()
                .filter(x->x.getAge()>25)
                .map(x->x.getStudentName())
                .forEach(x-> System.out.println(x));
    }
}
