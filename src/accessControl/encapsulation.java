package accessControl;

public class encapsulation {
    public static void main(String[] args) {
        Cricketer batsman = new Cricketer();
        batsman.setName("Virat Kohli");
        batsman.setType("Batsman");

        Cricketer allRounder = new Cricketer();
        allRounder.setName("Hardik Pandya");
        allRounder.setType("All Rounder");

        System.out.println("Bastman Name : " + batsman.getName());
        System.out.println("Type : " + batsman.getType());
        System.out.println("All Rounder Name : " + allRounder.getName());
        System.out.println("Type : " + allRounder.getType());
    }
}

class Cricketer{
    private String Name;
    private String Type;               // Allrounder/batsman/bowler/wicketkeeper

    //Setter Method for name
    public void setName(String Name){
        this.Name = Name;
        return;
    }

    //Getter method for name
    public String getName(){
        return this.Name;
    }

    //Setter Method for Type
    public void setType(String Type){
        this.Type = Type;
        return;
    }

    //Getter method for Type
    public String getType(){
        return this.Type;
    }
}