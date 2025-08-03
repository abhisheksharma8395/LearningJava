package Generics;

public class GenericClasses {
    public static void main(String[] args) {
        Box<String> box = new Box<>();
        System.out.println(box.getVar());
        box.setVar("Abhishek");
        System.out.println(box.getVar());
        System.out.println("-------------------------");
        Box<Integer> box1 = new Box<>();
        System.out.println(box1.getVar());
        box1.setVar(12);
        System.out.println(box1.getVar());
    }
}
class Box<T>{
    private T var;
    public void setVar(T var) {
        this.var = var;
    }
    public T getVar() {
        return this.var;
    }

}