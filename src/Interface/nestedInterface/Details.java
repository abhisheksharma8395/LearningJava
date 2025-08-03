package Interface.nestedInterface;

public class Details implements A.B{
    @Override
    public void id(String id) {
        System.out.println("My id is : "+id);
    }
}
