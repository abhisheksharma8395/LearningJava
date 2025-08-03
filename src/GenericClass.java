public class GenericClass {
    public static void main(String[] args) {
        System.out.println("Initialised object of Boxes class");

    }
}

class Node<T>{
    T data;
    Node<T> next;
    Node<T> prev;
    Node(T data){
        this.data = data;
    }
}
class LinkedList<T>{
    Node<T> head;
    Node<T> tail;

    public LinkedList(){
        this.head = null;
        this.tail = null;
    }
}