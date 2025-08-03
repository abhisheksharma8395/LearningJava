package WorkShop;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

class StudentInfo{
    private int id;
    private String Name;
    private int age;
    private static String[] subjects = new String[]{"English","Mathematics","Physics","Chemistry","Computer Science"};
    private int[] grades;
    private int average;

    StudentInfo(int id,String name, int age, int[] grades) {
        this.id = id;
        this.Name = name;
        this.age = age;
        this.grades = grades;
        int sum = 0;
        for (int i = 0; i < this.grades.length; i++) {
            sum += this.grades[i];
        }
        this.average = sum / this.grades.length;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return this.Name;
    }

    public int getAge() {
        return this.age;
    }

    public int[] getGrades() {
        return this.grades;
    }

    public int getAverage() {
        return this.average;
    }

    public static String[] getSubjects() {
        return StudentInfo.subjects;
    }

    public int compareTo(StudentInfo studentInfo) {
        if(this.average != studentInfo.average) {
            return this.average - studentInfo.average;
        }
        else{
            return this.Name.compareTo(studentInfo.Name);
        }
    }

    public void display() {
        System.out.print("Name: " + this.Name);
        System.out.print(" Age: " + this.age);
        System.out.println(" Student Grades in : "+Arrays.toString(subjects)+" respectively is "+ Arrays.toString(this.grades));
    }

}
class Students {
    private int id;
    static ArrayList<StudentInfo> students = new ArrayList<>();
    private static HashMap<Integer, StudentInfo> studentMap =  new HashMap<>();

    Students(int id,String name, int age, int[] grades) {
        this.id = id;
        this.studentMap.put(id, new StudentInfo(id,name, age, grades));
        students.add(new StudentInfo(id, name, age, grades));
    }

    public void searchStudent(int id){
        StudentInfo studentInfo = studentMap.get(id);
        if(studentInfo == null){
            System.out.println("Student not found");
        }
        else{
            System.out.println("Student Details are :");
            System.out.println("Student id : "+this.id);
            studentInfo.display();
        }
    }

    public void removeStudent(int id){
        StudentInfo studentInfo = studentMap.get(id);
        if(studentInfo == null){
            System.out.println("Student not found");
        }
        else{
            studentMap.remove(id);
            students.remove(studentInfo);
            System.out.println("Student with id : "+id+" has been removed successfully");
        }
    }

    public void addStudent(int id,String name, int age, int[] grades){
        StudentInfo studentInfo = studentMap.get(id);
        if(studentInfo != null){
            System.out.println("Student already exists with this id if you want to add Student please provide unique id");
        }
        else{
            studentMap.put(id, new StudentInfo(id,name, age, grades));
            students.add(new StudentInfo(id, name, age, grades));
            System.out.println("Student with id : "+id+" has been Added successfully");
        }
    }

    public void enrolledInParticularSubject(String subject){
        String[] subjects = StudentInfo.getSubjects();
        for(int i=0;i<subjects.length;i++){
            if(subject.equals(subjects[i])){
                System.out.println("Yes Students are enrolled in "+subject);
                return;
            }
        }
        System.out.println("No Students are not enrolled in "+subject);
    }

    public static void sort(){
        for (int i = 0; i < students.size()-1 ; i++) {
            for (int j = i+1; j < students.size(); j++) {
                if(students.get(i).compareTo(students.get(j))<0){
                    StudentInfo temp = students.get(i);
                    students.set(i, students.get(j));
                    students.set(j, temp);
                }
            }
        }
    }

    public static void print(){
        System.out.println("Student Details are :");
        for (int i = 0; i < students.size(); i++) {
            students.get(i).display();
        }
    }

}

public class StudentManagementSystem {
    public static void main(String[] args) {
        Students student1 = new Students(1,"Nobita",12,new int[]{48, 52, 44, 75, 65});
        Students student2 = new Students(2,"Shizuka",12, new int[]{81, 92, 84, 78, 95});
        Students student3 = new Students(3,"Dekisugi",12, new int[]{93, 97, 95, 98, 93});
        Students student4 = new Students(4,"Giyan",15, new int[]{62, 45, 49, 55, 75});
        Students student5 = new Students(5,"Sunio",13, new int[]{75, 62, 74, 67, 65});
        Students student6 = new Students(6,"Kenichi",13, new int[]{61, 52, 64, 75, 55});
        Students student7 = new Students(7,"Umiko",13, new int[]{81, 88, 85, 75, 79});
        Students student8 = new Students(8,"Kiteretsu",14, new int[]{97, 98, 97, 96, 98});
        Students student9 = new Students(9,"Shinchan",9, new int[]{42, 45, 50, 75, 54});
        Students student10 = new Students(10,"Ash",17, new int[]{57, 78, 65, 70, 55});
        Students.print();
        Students.sort();
        Students.print();
    }
}
