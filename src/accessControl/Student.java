package accessControl;

import org.w3c.dom.ls.LSOutput;

// This class is for checking the access in outside packages check AccessModifier package Test class
public class Student{
    protected int id;
    protected String Name;

    protected Student(){
        this.id = Integer.MAX_VALUE;
        this.Name = null;
    }

    public static void main(String[] args) {
        Student student = new Student();
        System.out.println("id :"+student.id);
        System.out.println("name :"+student.Name);
    }
}
