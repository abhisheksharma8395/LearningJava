package Abstraction;

abstract public class Parent {
    String careerName;
    String foodName;
    String teamName;
    int salary;
    String partnerName;
    int partnerAge;
    static int totalChild;

    Parent(String careerName, String foodName, String teamName, int salary,String partnerName, int partnerAge) {
        this.careerName = careerName;
        this.foodName = foodName;
        this.teamName = teamName;
        this.salary = salary;
        this.partnerName = partnerName;
        this.partnerAge = partnerAge;
        this.chooseCareer();
        this.favouriteFood();
        this.favoriteIplTeam();
        this.salary();
        this.choosePartner();
        Parent.totalChild++;
        Parent.totalChild();
    }
    static void totalChild() {
        System.out.println("Parent total child: " + Parent.totalChild);
    }
    abstract public void chooseCareer();
    abstract public void favouriteFood();
    abstract public void favoriteIplTeam();
    abstract public void salary();
    abstract public void choosePartner();
    //Note 👉
    // 1️⃣ abstract method can't be declared as static because static methods do not allow us for overriding
    //and abstract methods requires overriding for initialization of methods

    // 2️⃣ we can't have an abstract constructor.
    // 3️⃣ we can't declare a variable as abstract.
    // 4️⃣ Abstract class consists of abstract and concrete methods.
    // 5️⃣ Abstract classes can contain static methods.
    // 6️⃣ We Cannot initialize objects of classes that are declared using static.
    // 7️⃣ a non-abstract subclass must provide implementation for all abstract methods.
}
