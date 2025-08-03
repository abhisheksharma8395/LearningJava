package Interface.genericInterface;

public class MyChoice implements Container<Integer>{
    Integer item;
    public void add(Integer element){
        this.item = element;
    }

    public Integer get(){
        return item;
    }
}
