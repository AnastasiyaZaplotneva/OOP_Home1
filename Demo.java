// 1. Создать класс Товар, имеющий переменные имя, цена, рейтинг. 
// 2. Создать класс Категория, имеющий переменные имя и массив товаров. 
//    Создать несколько объектов класса Категория. 
// 3. Создать класс Basket, содержащий массив купленных товаров. 
// 4. Создать класс User, содержащий логин, пароль и объект класса Basket. 
//    Создать несколько объектов класса User. 
// 5. Вывести на консоль каталог продуктов. (все продукты магазина) 
// 6. Вывести на консоль покупки посетителей магазина. После покупки у 
//    пользователя добавляется товар, а из магазина - удаляется.

public class Demo {
    public static void main(String[] args) {
        Product p1 = new Product("rice", 107.9, 4.8);
        Product p2 = new Product("chicken", 225.0, 4.7);
        Product p3 = new Product("buckwheat", 36.5, 4.9);
        Product p4 = new Product("cheese", 545.0, 4.5);
        Product p5 = new Product("lemonade", 56.4, 4.3);
        Product p6 = new Product("butter", 121.0, 4.7);
        Product p7 = new Product("tea", 108.9, 4.6);
        Product p8 = new Product("ham", 318.99, 4.4);
        Product p9 = new Product("beef", 430.0, 4.6);
        Product p10 = new Product("milk", 74.0, 4.8);
        Product p11 = new Product("juice", 101.0, 4.2);
        
        Category meat = new Category("meat", p2, p8, p9);
        Category groats = new Category("groats", p1, p3);
        Category drink = new Category("drink", p5, p7, p11);
        Category dairy = new Category("dairy", p4, p6, p10);

        
        drink.addProduct(p11); //просто для демонстрации работающего метода

        Assortment assort = new Assortment(meat, groats, drink, dairy);
        
        UserMenu.callMenu(assort);
    }
    
}