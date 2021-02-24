import java.util.ArrayList;

public class Purchases {
    private ArrayList<GroceryItem> shoppingCart;

    public Purchases(){  //starts off with an empty cart to add items to
        this.shoppingCart = new ArrayList<>();
    }

    public void addGroceryItem(GroceryItem groceryItem){
        shoppingCart.add(groceryItem); //this add method will just add items to our grocery cart
    }

    /**
     * Adds up the cost for all grocery items in the shopping cart and returns it
     * @return
     */
    public double getTotalPrice(){
        double totalPrice = 0; //initalizes the double variable
        for(GroceryItem groceryItem:shoppingCart) //cycles through the grocery items in the shopping cart
            totalPrice += groceryItem.getPrice(); //adds the price from each grocery item in the cart together
        return totalPrice; //returns the total price
    }

    public String toString(){ //overrides the tostring method
        return String.format("%nThe shopping cart has %d items worth $%.2f",shoppingCart.size(), getTotalPrice());
    }
}
