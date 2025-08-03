package Abstraction;

public class Daughter extends Parent{
    Daughter(String careerName, String foodName, String teamName, int salary,String partnerName,int partnerAge) {
        super(careerName, foodName, teamName, salary,partnerName,partnerAge);
    }
    @Override
    public void chooseCareer() {
        System.out.println("I want to be a "+careerName);
    }

    @Override
    public void favouriteFood() {
        System.out.println("I love to have "+foodName);
    }

    @Override
    public void favoriteIplTeam() {
        System.out.println("I support "+teamName);
    }

    @Override
    public void salary() {
        System.out.println("My salary is "+salary);
    }

    @Override
    public void choosePartner() {
        System.out.println("My partner is "+partnerName+" And his age is "+partnerAge);
    }
}
