package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

public class CustomAnnotations {
    public static void main(String[] args) throws NoSuchMethodException {
        Service service = new Service();
        Method method = service.getClass().getMethod("processData");

        if(method.isAnnotationPresent(LogExecutionTime.class)){
            LogExecutionTime annotation = method.getAnnotation(LogExecutionTime.class);
            long startTime = System.currentTimeMillis();
            service.processData();
            long endTime = System.currentTimeMillis();
            System.out.println(annotation.message()+(endTime-startTime)+"ms");
        }
    }

}


// Custom Annotation
@Retention(RetentionPolicy.RUNTIME)       // Meta Annotations
@Target(ElementType.METHOD)               // Meta Annotations
@interface LogExecutionTime{
    // message method
    public String message() default "Method Executed in:";
}

// Class Service
class Service{
    // Using Custom Annotations
    @LogExecutionTime(message = "Time Taken : ")
    public void processData(){
        // Business logic
    }
}
