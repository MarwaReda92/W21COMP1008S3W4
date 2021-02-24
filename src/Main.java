public class Main {
    public static void main(String[] args) {
        Purchases shoppingCart = new Purchases();
        GroceryItem item1 = new GroceryItem("carrots",4.79,"vegetables");
        GroceryItem item2 = new GroceryItem("bread",2.89,"bread");
        GroceryItem item3 = new GroceryItem("ice cream",7.89,"dairy");
        shoppingCart.addGroceryItem(new GroceryItem("cheese",12.98,"dairy")); //instantiates new groceryItem within the addGroceryItem method

        shoppingCart.addGroceryItem(item1);
        shoppingCart.addGroceryItem(item2);
        shoppingCart.addGroceryItem(item3);


        double total = shoppingCart.getTotalPrice();
        System.out.printf("The total price is: $%.2f",total);
        System.out.println(shoppingCart);
    }
}
