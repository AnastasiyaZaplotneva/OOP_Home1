import java.util.StringJoiner;

public class Product {
    String name;
    double price;
    double rating;

    Product () {
        name = "indefined";
        price = -1;
        rating = -1;
    }
    
    Product (String n, double p, double r) {
        name = n;
        price = p;
        rating = r;
    }

    Product(Product p) {
        this.name = p.name;
        this.price = p.price;
        this.rating = p.rating;
    }
    
    public String toString () {
        String str = new StringJoiner(", ", Product.class.getSimpleName() + "[", "]")
        .add("name='" + name + "'")
        .add("price=" + price)
        .add("rating=" + rating)
        .toString();
        return str;
    }
}
