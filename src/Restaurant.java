import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Restaurant {

    public static void main(String[] args) {
        MenuItem pizza = new MenuItem("Pepperoni Pizza", 10.00);
        MenuItem salad = new MenuItem("Harvest Salad", 8.00);
        Menu altMenu = new Menu();
        altMenu.addMenuItem(pizza);
        altMenu.addMenuItem(salad);
        altMenu.printEntireMenu();
        altMenu.printSingleItem(pizza);
        GregorianCalendar newPizzaDateGreg = new GregorianCalendar(2019, 5, 5);
        Date newPizzaDate = newPizzaDateGreg.getTime();
        pizza.setAdded(newPizzaDate);
        altMenu.printEntireMenu();

    }
}
