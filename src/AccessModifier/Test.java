package AccessModifier;


import accessControl.Student;

public class Test extends Student{           //Example we can access protected member from subclass
    public static void main(String[] args) {  // outside package
        Test test = new Test();
        test.id = 1;
        test.Name = "Abhishek Sharma";
        System.out.println("id: " + test.id);
        System.out.println("Name: " + test.Name);
    }

}

class subTest extends Test{                  //Example that we can also access protected member from subclass
    public static void main(String[] args) {   // of subclass from outside package
        subTest obj1 = new subTest();
        obj1.id = 2;
        obj1.Name = "Abhishek Parashar";
        System.out.println("id: " + obj1.id);
        System.out.println("Name: " + obj1.Name);
    }
}
