class Person {
    void message()
    {
        System.out.println("This is person class\n");
    }
}

// Subclass Student
class Student extends Person {
    void message()
    {
        System.out.println("This is student class");
    }

    // Note that display() is
    // only in Student class
    void display()
    {
        // will invoke or call current
        // class message() method
        message();

        // will invoke or call parent
        // class message() method
        super.message();
    }
}

// Driver Program
class Test {
    public static void main(String args[]) {
        Person s = new Student();

        // calling display() of Student
        s.message();
    }
}