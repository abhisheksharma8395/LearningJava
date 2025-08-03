package Enumeration;

public enum Operation {
    ADD, SUB, MUL, DIV;

    public <T extends Number> double apply(T num1,  T num2) {
        switch (this) {
            case ADD:
                return num1.doubleValue() + num2.doubleValue();
            case SUB:
                return num1.doubleValue() - num2.doubleValue();
            case MUL:
                return num1.doubleValue() * num2.doubleValue();
            case DIV:
                return num1.doubleValue() / num2.doubleValue();
            default:
                System.err.println("Error Occurred somewhere");
                return 0;
        }
    }
}
class number{
    public static void main(String[] args) {
        System.out.println(Operation.ADD.apply(4,6));
    }
}
