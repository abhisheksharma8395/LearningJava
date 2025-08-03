package ObjectComparision;

public class Test {
    public static void main(String[] args) {
        Student Nobita = new Student(1,40.5);
        Student Dekisugi = new Student(2,88.75);
        if(Nobita.compareTo(Dekisugi) > 0){
            System.out.println("Nobita has more Marks");
        }
        else if(Nobita.compareTo(Dekisugi) == 0){
            System.out.println("Both has Equal Marks");
        }
        else{
            System.out.println("Dekisugi has more Marks");
        }
    }
}
