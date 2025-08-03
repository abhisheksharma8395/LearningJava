public class ChildAndParent {
    public static void main(String[] args) {
        Parent obj1 = new Child("Nobita",13);
        System.out.println(obj1.name);
    }
}
class Parent {
    String name;
    int age;
    Parent(String name,int age){
        this.name=name;
        this.age=age;
    }
}
class Child extends Parent {
//    int standards;
    Child(String name,int age){
        super(name,age);
//        this.standards=standards;
    }
}