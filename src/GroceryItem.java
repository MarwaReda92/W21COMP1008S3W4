import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class GroceryItem {
    private String name;
    private double price;
    private String category;

    public GroceryItem(String name, double price, String category) {
        setName(name);
        setPrice(price);
        setCategory(category);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.trim().length()>=2)
            this.name = name;
        else
            throw new IllegalArgumentException("Name must have at least 2 characters.");
    }

    public double getPrice() {
        return price;
    }

    /**
     * The price needs to be in the range of 0-200
     * @param price
     */
    public void setPrice(double price) {
        if(price>=0 && price<=200)
            this.price = price;
        else
            throw new IllegalArgumentException("Price must be 0-200 inclusive.");
    }

    public String getCategory() {
        return category;
    }

    /**
     *  The category must be within our list of categories
     * @param category
     */
    public void setCategory(String category) {
        List<String> categories = Arrays.asList("fruit","vegetables","beef","dairy","seafood");
        if(categories.contains(category.toLowerCase()))
            this.category = category;
        else
            throw new IllegalArgumentException(category + " is not an option, use:"+categories);
    }
}
