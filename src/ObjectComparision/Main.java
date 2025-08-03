package ObjectComparision;

public class Main {
    public static void main(String[] args) {
        StudentData student1 = new StudentData("Nobita",88);
        StudentData student2 = new StudentData("Shizuka",94);
        StudentData student3 = new StudentData("Dekisugi",98);
        StudentData student4 = new StudentData("Sunio",80);
        StudentData student5 = new StudentData("Giyan",84);
        StudentData student6 = new StudentData("Kenichi",92);
        StudentData student7 = new StudentData("Umiko",84);
        StudentData student8 = new StudentData("Kiteretsu",98);
        StudentData student9 = new StudentData("Ash",80);
        StudentData student10 = new StudentData("Shinchan",88);
        StudentData.printStudentList();
        StudentData.sortStudentList();
        StudentData.printStudentList();
    }
}
