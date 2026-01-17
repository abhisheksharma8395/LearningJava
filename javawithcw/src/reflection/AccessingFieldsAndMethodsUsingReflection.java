package reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AccessingFieldsAndMethodsUsingReflection {


    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        // Created the object of Person class
        Person person = new Person();
        Class<?> cls = person.getClass();
        // Access private field
        Field field = cls.getDeclaredField("name");
        // Allow access to private field
        field.setAccessible(true);
        // get field value
        System.out.println("Old Value : "+field.get(person));
        // Modify field value
        field.set(person,"King Kohli");
        System.out.println("New Value : "+field.get(person));


        // Access private method
        Method method = cls.getDeclaredMethod("add",int.class,int.class);
        // Allow access to private method
        method.setAccessible(true);
        int result = (int) method.invoke(person,5,10);
        System.out.println("Addition is : "+result);
    }

}

class Person{
    private String name = "Virat Kohli";                        // Stored the name

    // This method is used to add two values
    private int add(int a, int b){
        return (a+b);
    }
}


