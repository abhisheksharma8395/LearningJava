public class staticMembersPreference {
    static {
        System.out.println("Inside static block1");
    }
    public static void main(String[] args)
    {
        System.out.println("Value of a : ");
        System.out.println("from main");
        Learning.display();
    }
}

class Learning
{
    static void display() {
        System.out.println("display");
    }

    // static variable
    static int a = m1();

    // static block
    static {
        System.out.println("Inside static block");
    }

    // static method
    static int m1() {
        System.out.println("from m1");
        return 20;
    }

    // static method(main !!)

}