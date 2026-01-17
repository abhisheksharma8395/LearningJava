package reflection;
// We can obtain the Class object of any class in three ways:
public class GettingClassInformation {
    public static void main(String[] args) throws ClassNotFoundException {
        // Getting Class object
        // Method 1 : Using .class
        Class<?> cls1 = Employee.class;

        //Method 2 : Using getClass()
        Employee employee = new Employee();
        Class<?> cls2 = employee.getClass();

        //Method 3 : Using Class.forName()
        Class<?> cls3 = Class.forName("reflection.Employee");

        System.out.println("Class Name : "+cls1.getName());
        System.out.println("Class Name : "+cls2.getName());
        System.out.println("Class Name : "+cls3.getName());
    }
}

class Employee{
    private String name;
    public int age;
}