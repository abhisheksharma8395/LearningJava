package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class AccessingConstructor {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> cls = Student.class;
        Constructor<?> constructor = cls.getConstructor(String.class);
        Student student = (Student) constructor.newInstance("VIRAT");
        student.display();
    }
}

class Student{
    private String name;
    public Student(String name){
        this.name = name;
    }
    public void display(){
        System.out.println("Name : "+this.name);
    }
}
