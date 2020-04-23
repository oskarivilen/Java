package shoppari;

import java.util.List;
import java.util.Scanner;

public class ShoppingListApp {
    private static ShoppingListItemDao dao = new JDBCShoppingListItemDao();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the shopping list app!\n" + "Available commands:\n" + " list\n"
                + " add [product name]\n" + " remove [product name]\n" + " quit");

        boolean running = true;

        while (running) {
            System.out.print("> ");
            String command = input.next();
            String parameter = input.nextLine().trim();

            switch (command) {
            case "list":
                listAllItems();
                break;
            case "add":
                addItem(parameter);
                break;
            case "remove":
                removeItem(parameter);
                break;
            case "quit":
                running = false;
                break;
            }

            System.out.println();
        }

        System.out.println("Bye!");
        input.close();
    }

    private static void listAllItems() {
        System.out.println("Shopping list contents:");

        List<ShoppingListItem> items = dao.getAllItems();
        for (ShoppingListItem item : items) {
            System.out.println(item.getId() + " " + item.getTitle());
        }
    }

    private static void addItem(String title) {
        ShoppingListItem newItem = new ShoppingListItem(title);
        boolean success = dao.addItem(newItem);

        // todo: tulosta teksti onnistuiko
    }

    private static void removeItem(String title) {
        // 1. esim: haetaan tietokannasta kaikki rivit
        // 2. verrataan rivien otsikkoja annettuun "title"-muuttujaan
        // 3. poistetaan rivi, jos otsikko on sama
    }
}
