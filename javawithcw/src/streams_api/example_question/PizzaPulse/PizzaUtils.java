package streams_api.example_question.PizzaPulse;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PizzaUtils {
    public boolean validateOrderID(String orderID) throws InvalidPizzaOrderException {
        String regex = "^(PZ)-[1-9][0-9]{2}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(orderID);
        if(!matcher.matches()){
            throw new InvalidPizzaOrderException("The order ID "+orderID+" is invalid");
        }
        return true;
    }

    public boolean validatePizzaType(String pizzaType) throws InvalidPizzaOrderException {
        Set<String> set = new HashSet<>(Arrays.asList("Margherita","Pepperoni","Veggie","BBQChicken"));
        if(!set.contains(pizzaType)){
            throw new InvalidPizzaOrderException("The pizza type "+pizzaType+" is invalid");
        }
        return true;
    }

    public boolean validateQuantity(int quantity) throws InvalidPizzaOrderException {
        if(quantity <= 0 || quantity > 50){
            throw new InvalidPizzaOrderException("The quantity "+quantity+" is invalid");
        }
        return true;
    }

    public double calculateFinalBill(String pizzaType,double basePrice,int quantity) throws InvalidPizzaOrderException{
        if(basePrice < 200) throw new InvalidPizzaOrderException("Invalid base price for "+pizzaType);
        double baseCost = basePrice * quantity;
        double deliveryFee = 100.0;
        double toppingCharge = 0.0;
        switch(pizzaType){
            case "Margherita" :
                toppingCharge = (baseCost * 10)/100;
                break;
            case "Pepperoni" :
                toppingCharge = (baseCost * 20)/100;
                break;
            case "Veggie" :
                toppingCharge = (baseCost * 15)/100;
                break;
            case "BBQChicken" :
                toppingCharge = (baseCost * 25)/100;
                break;
            default:
                toppingCharge = 0.0;
        }
        double finalBill = baseCost+toppingCharge+deliveryFee;
        return finalBill;
    }
}
