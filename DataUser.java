

import java.util.HashMap;


public class DataUser {
    HashMap<String, User> userList;

    DataUser() {
        userList = new<String, User> HashMap();
        
    }

    void addUser (User u) {
        if(userList.containsKey(u.login)) {
            userList.replace(u.login, u);
        }
        else {
            userList.put(u.login, u);
        }
    }

    void printAllPurchases() {
        userList.entrySet().forEach(System.out::println);
    }
}
    

