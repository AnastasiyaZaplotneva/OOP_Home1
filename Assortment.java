import java.util.ArrayList;

public class Assortment {
    ArrayList<Category> listOfCategory;

    Assortment() {
        listOfCategory = new ArrayList<>();
    }
    Assortment(Category c) {
        listOfCategory = new ArrayList<>();
        listOfCategory.add(c);
    }
    Assortment(Category ... c) {
        listOfCategory = new ArrayList<>();
        for (Category p: c) listOfCategory.add(p);
    }
    public void printAll() {
        for (Category x : listOfCategory) {
            System.out.println(x.toString());
        }
    }
    
}
