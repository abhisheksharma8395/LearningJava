package ObjectComparision;

public class Student implements Comparable<Student> {
    int rollno;
    double marks;
    Student(int rollno, double marks) {
        this.rollno = rollno;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student o) {
        // this.marks == o.marks means both are equal
        // this.marks > o.marks means this one is bigger
        // this.marks < o.marks means o is greater
        return (int)(this.marks - o.marks);
    }
}
