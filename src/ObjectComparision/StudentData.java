package ObjectComparision;
import java.util.ArrayList;
import java.util.List;

public class StudentData implements Comparable<StudentData> {
    private String Name;
    private int Marks;
    private static List<StudentData> studentList = new ArrayList<>();

    StudentData(String Name, int Marks) {
        this.Name = Name;
        this.Marks = Marks;
        studentList.add(this);
    }

    public static void sortStudentList() {
        for (int i = 0; i < studentList.size(); i++) {
            for (int j = i + 1; j < studentList.size(); j++) {
                if(studentList.get(i).compareTo(studentList.get(j)) < 0) {
                    StudentData temp = studentList.get(i);
                    studentList.set(i, studentList.get(j));
                    studentList.set(j, temp);
                }
            }
        }
    }

    @Override
    public int compareTo(StudentData o) {
        if(this.Marks != o.Marks) {
            return (int)(this.Marks - o.Marks);
        }
        else{
            return (o.Name).compareTo(this.Name);
        }
    }

    public static void printStudentList() {
        System.out.print("{");
        for (int i = 0; i < studentList.size(); i++) {
            System.out.print("{");
            StudentData temp = studentList.get(i);
            System.out.print(temp.Name+", "+temp.Marks);
            System.out.print("}");
            if(i!=studentList.size()-1) System.out.print(",");
        }
        System.out.print("}");
        System.out.println(" ");
    }
}
