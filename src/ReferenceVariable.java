public class ReferenceVariable {
    public static void main(String[] args) {
        BoxWeight box1 = new BoxWeight(4.0,5);
        Box box2 = new BoxWeight(box1);
        Box box3 = new BoxPrice(6,7,8,10,4);
        box3.display();
        box1.display();
        box2.display();
    }
}
class Box{
    double length;
    double width;
    double height;

    //Non parameterized constructor
    Box(){
        this.length = 0.0;
        this.width = 0.0;
        this.height = 0.0;
    }

    //Constructor for Square Box
    Box(double value){
        this.length = value;
        this.width = value;
        this.height = value;
    }
    //Copy Constructor
    Box(Box box){
        this.length = box.length;
        this.width = box.width;
        this.height = box.height;
    }

    //Constructor if all three values passed for initialisation
    Box(double length, double width, double height){
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public void display(){
        System.out.println("Details Are :");
        System.out.println("length: " + this.length);
        System.out.println("width: " + this.width);
        System.out.println("height: " + this.height);
    }
}
class BoxWeight extends Box{
    int weight;
    BoxWeight(){
        // We have the non-parameterised constructor in super class, so java automatically calls super() so i'm not writing it
        this.weight = 0;
    }

    BoxWeight(double value,int weight){
        super(value);
        this.weight = weight;
    }

    BoxWeight(double length,double width,double height,int weight){
        super(length,width,height);
        this.weight = weight;
    }

    BoxWeight(BoxWeight boxWeight){
        super(boxWeight);
        this.weight = boxWeight.weight;
    }

    public void display(){
        super.display();
        System.out.println("Weight: " + this.weight);
    }
}
class BoxPrice extends BoxWeight{
    double price;

    BoxPrice(){
        this.price = 0.0;
    }

    BoxPrice(double value,int weight,double price){
        super(value,weight);
        this.price = price;
    }

    BoxPrice(BoxPrice boxPrice){
        super(boxPrice);
        this.price = boxPrice.price;
    }

    BoxPrice(double length,double width,double height,int weight,double price){
        super(length,width,height,weight);
        this.price = price;
    }

    public void display(){
        super.display();
        System.out.println("Price: " + this.price);
    }
}
