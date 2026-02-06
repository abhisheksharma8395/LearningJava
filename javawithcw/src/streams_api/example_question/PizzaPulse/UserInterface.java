package streams_api.example_question.PizzaPulse;

import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        PizzaUtils pizzaUtils = new PizzaUtils();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter pizza order details : ");
        String input = scanner.next();
        try{
            String[] pizzaDetails = input.split(":");
            boolean isValidOrderID = pizzaUtils.validateOrderID(pizzaDetails[0]);
            boolean isValidPizzaType = pizzaUtils.validatePizzaType(pizzaDetails[1]);
            boolean isValidQuantity = pizzaUtils.validateQuantity(Integer.parseInt(pizzaDetails[3]));
            if(isValidOrderID && isValidQuantity && isValidPizzaType){
                double finalBill = pizzaUtils.calculateFinalBill(pizzaDetails[1],Double.parseDouble(pizzaDetails[2]),Integer.parseInt(pizzaDetails[3]));
                System.out.println("Total bill for "+pizzaDetails[1]+" pizzas : "+finalBill);
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
