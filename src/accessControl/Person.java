package accessControl;

class Address {
    String city;
    Address(String city) {
        this.city = city;
    }
}

class Person implements Cloneable {
    String name;
    Address address;

    Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    Person(Person person) {
        this.name = person.name;
        this.address = person.address;
    }

    public Person clone() throws CloneNotSupportedException {
        return (Person) super.clone();  // shallow copy
    }
}
class Test{
    public static void main(String args[]) throws CloneNotSupportedException {
        Address addr = new Address("Delhi");
        Person p1 = new Person("Abhishek", addr);
        Person p2 = p1.clone();
        Person p3 = new  Person(p1);
        System.out.println("p1 == p2 : "+(p1==p2));
        p2.name = "Abhi Parashar";
        System.out.println(p2.name);
        System.out.println(p1.name);  // Output: Mumbai (😲 changed!)
        System.out.println("-----------------------------------");
        p3.name = "Abhihsek Sharma";
        System.out.println(p3.name);    //Pune
        System.out.println(p1.name);    //Pune
        System.out.println(p2.name);    //Pune isn't it interesting
        System.out.println("p3 == p1 : "+(p1==p3));
        System.out.println("p3 == p2 : "+(p2==p3));
    }
}
