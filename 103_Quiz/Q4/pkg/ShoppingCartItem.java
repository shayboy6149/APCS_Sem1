package pkg;
import java.util.*;

public class ShoppingCartItem {
private String food;
private double price;
private int quantity;

public ShoppingCartItem(){
    this.food = "nothing";
    this.quantity = 0;
    this.price = 0.0;
}

public ShoppingCartItem(String food, double price, int quantity){
    this.food = food;
    this.price = price;
    this.quantity = quantity;
}

public String getItemName(){
    return food;
}

public double getTotalCost(){
    return price;
}

public double getQuantity(){
    return quantity;
}

public void cartToString(){
    System.out.println("You have " + getQuantity() + " of " + getItemName() + " for " + getTotalCost() );
    
}

public double getTotalWithTax(){
    return price * 1.12;
}

public double quantityToCostCalculator(int a){
    return a * price;
    
}

public boolean compareItemCost(ShoppingCartItem a){
    if(this.getTotalCost() < a.getTotalCost()){
        return true;
    }
    else{
        return false;
    }
    
    

}


