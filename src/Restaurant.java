
import java.util.Scanner;

public class Restaurant {

    public static void main(String[] args) {
        Menu menu = new Menu();
        MenuItem pizza = new MenuItem("Pepperoni Pizza", 10.00);
//        MenuItem salad = new MenuItem("Harvest Salad", 8.00);
//        Menu altMenu = new Menu();
        menu.addMenuItem(pizza);
//        altMenu.addMenuItem(salad);
//        altMenu.printEntireMenu();



        try(Scanner input = new Scanner(System.in)){
            Integer choice;
            do{
            System.out.println("1. Add new menu item");
            System.out.println("2. Print all menu items");

            choice = input.nextInt();



            switch(choice) {
                case 1:
                    System.out.println("Enter name for new product: ");
                    String name = input.next();
                    System.out.println("Enter name for new price: ");
                    Double price = input.nextDouble();
                    System.out.println("Enter name for new category: ");
                    String category = input.next();
                    menu.addMenuItem((new MenuItem(name, price, category)));
                    break;
                case 2:

                        menu.printEntireMenu();
                    System.out.println();
                    break;
                }
            } while (!choice.equals(3));
            System.exit(0);
        }
    }
}
