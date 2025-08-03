public class ObjectClassDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        C obj1 = new C(1,"Abhishek Sharma");
        System.out.println("HashCode is "+obj1.hashCode());
        C obj2 = (C) obj1.clone();
        C obj3 = obj1;
        System.out.println("HashCode is "+obj2.hashCode());
        System.out.println("Is both Objects contents are same :"+obj1.equals(obj2));
        System.out.println("Is both variables refer to the same object :"+(obj1 == obj2));
        System.out.println("------------------------------------------------------------------");
        System.out.println("HashCode is "+obj3.hashCode());
        System.out.println("Is both Objects contents are same :"+obj3.equals(obj2));
        System.out.println("Is both variables refer to the same object :"+(obj1 == obj3));
        System.out.println("------------------------------------------------------------");
        C obj4 = new C(obj1);
        System.out.println("HashCode is "+obj2.hashCode());
        System.out.println("Is both Objects contents are same :"+obj1.equals(obj2));
        System.out.println("Is both variables refer to the same object :"+(obj1 == obj2));
        obj1 = null;
        obj2 = null;
        obj3 = null;
        System.gc();
    }
}
class C implements Cloneable {
    int uniqueId;
    String name;
    C(C obj){
        this.uniqueId = obj.uniqueId;
        this.name  = obj.name;
    }
    C(int uniqueId, String name){
        this.uniqueId = uniqueId;
        this.name = name;
    }
    @Override
    public int hashCode() {
        return this.uniqueId;
    }
    @Override
    public String toString() {
        return this.name;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof C){
            if(this.uniqueId == ((C)obj).uniqueId){
                return (this.name.equals(((C) obj).name));
            }
        }
        return false;
    }
    @Deprecated
    @Override
    protected void finalize() throws Throwable{
        System.out.println("Object is Garbage Collected");
    }
    //get class method is final so that we can't override it

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
