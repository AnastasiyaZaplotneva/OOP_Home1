import java.util.Scanner;

public class UserMenu {

    public static void printStartMenu() {
        System.out.println("Выберите необходимое действие");
        System.out.println("1 - Регистрация (для новых пользователей)");
        System.out.println("2 - Продолжить работу (для зарегистрированных пользователей)");
        System.out.println("3 - Завершить работу");
    }
   
    public static void printMenu() {
        System.out.println("Выберите необходимое действие");
        System.out.println("1 - Показать весь ассортимент");
        System.out.println("2 - Выбрать товар");
        System.out.println("3 - Завершить работу");
    }

    public static void callMenu(Assortment a) {
        Scanner iScan = new Scanner(System.in);
        DataUser database = new DataUser();
        User user = new User();
        
       while(true) {
            printStartMenu();
            int firstChoice = iScan.nextInt();
            iScan.nextLine();
            if (firstChoice != 3) {
                switch (firstChoice) {
                    case 1:
                        while(true) {
                            System.out.println("Введите логин: ");
                            String userLogin = iScan.nextLine();
                            if(database.userList.containsKey(userLogin)) {
                            System.out.println("Такое имя уже существует, введите новое имя");
                            } 
                            else {
                                System.out.println("Введите пароль: ");
                                String userPassword = iScan.nextLine();
                                User user1 = new User(userLogin, userPassword);
                                user = user1;
                                database.addUser(user);
                                break;
                            }
                        }
                        break;
                    case 2:
                    label: while(true) {
                            System.out.println("Введите логин: ");
                            String userLogin = iScan.nextLine();
                            if(!database.userList.containsKey(userLogin)) {
                                System.out.println("Вы ввели неверный логин, попробуйте еще раз");
                                break label;
                            }
                            else {
                                while(true) {
                                    printMenu();
                                    int choice = iScan.nextInt();
                                    iScan.nextLine();
                                    if (choice != 3){
                                        switch (choice) {
                                        case 1:
                                            a.printAll();
                                            break;
                                        case 2:
                                            System.out.println("Введите название товара: ");
                                            String userProd = iScan.nextLine();
                                            for (Category x: a.listOfCategory) {
                                                if(x.choiceProduct(userProd, user, x)) break;
                                            }

                                            break;
                                        }
                                    }
                                    else {
                                        database.addUser(user);
                                        System.out.println("Список ваших покупок: ");
                                        System.out.println(user.toString());
                                        break;
                                    }
                                }
                                break;
                            }
                        }
                        break;
                }
            } else {
                System.out.println("Список всех покупок за день");
                database.printAllPurchases();
                iScan.close();
                break;
            }
        }
    }
}
