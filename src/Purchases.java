import java.util.ArrayList;

public class Purchases {
    private ArrayList<GroceryItem> shoppingCart;

    public Purchases(){  //starts off with an empty cart to add items to
        this.shoppingCart = new ArrayList<>();
    }

    public void addGroceryItem(GroceryItem groceryItem){
        shoppingCart.add(groceryItem); //this add method will just add items to our grocery cart
    }
}
