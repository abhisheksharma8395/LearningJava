package Interface.extendDemo;

public class Test implements B {
    //Gyan 🚨 in overriding you can increase visibility, not decrease like if method is declared protected, then
    // in subclass you can override it by declaring it public but not default
    public void meet() {
        System.out.println("Can we meet tomorrow?");
    }

//    @Override
//    public void greet() {
//        System.out.println("Hello How Are You");
//    }
}

class run{
    public static void main(String[] args) {
        Test test = new Test();
        test.greet();
        test.meet();
    }
}