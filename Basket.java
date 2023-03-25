import java.util.ArrayList;
import java.util.StringJoiner;

public class Basket {
    ArrayList<Product> shoppingList;
    
    Basket() {
        shoppingList = new<Product> ArrayList();
    }

    public void addProductInBusket(Category c, Product p) {

        shoppingList.add(p);
        c.productList.remove(p);

    }
    
    public String toString () {
        String str = new StringJoiner(", ", Basket.class.getSimpleName() + "[", "]")
        .add("shoppingList=" + shoppingList.toString())
        .toString();
        return str;
    }
}

