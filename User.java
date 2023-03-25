import java.util.StringJoiner;

public class User {
    String login;
    String password;
    Basket userBasket;

    User() {
        login = "underfined";
        password = "underfined";
        userBasket = new Basket();
    }

    User(String l, String p) {
        login = l;
        password = p;
        userBasket = new Basket();
    }

    User(User u) {
        this.login = u.login;
        this.password = u.password;
        this.userBasket = u.userBasket;
    }

    
    public String encryptPass() {
        String pass = "";
        int size = password.length();
        for (int i = 0; i < size; i++) {
            pass += "*";
        }
        return pass;
    }

    public String toString () {
        String str = new StringJoiner(" ", User.class.getSimpleName() + "[", "]")
        .add("login: " + login + "\n")
        .add("password: " + encryptPass() + "\n")
        .add("In" + login + "basket: " + userBasket.toString())
        .toString();
        return str;
    }
}
