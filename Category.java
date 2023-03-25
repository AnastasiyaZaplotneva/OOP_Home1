
import java.util.ArrayList;
import java.util.StringJoiner;

public class Category {
    String categoryName;
    ArrayList<Product> productList;
    
    Category() {
        categoryName = "underfined";
        productList = new<Product> ArrayList();
    }

    Category(String n, Product ... p) {
        productList = new<Product> ArrayList();
        categoryName = n;
        for(Product x: p) {
            productList.add(x);
        }
    }

    public void addProduct(Product ... p) {
        for(Product x: p) {
            productList.add(x);
        }
    }

    
    public boolean choiceProduct(String usPr, User u, Category c) {
        boolean result = false;
        for (Product p : productList) {
            if(p.name.equals(usPr)) {
                u.userBasket.addProductInBusket(c, p);
                return true;
            }
        }
        return result;
    }
        
    
    public String toString () {
        String str = new StringJoiner(", ", Category.class.getSimpleName() + "[", "]")
        .add("name='" + categoryName + "'")
        .add("productList=" + productList.toString())
        .toString();
        return str;
    }
}
