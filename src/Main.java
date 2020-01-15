public class Main {

    public static void main(String[] args) {
        MenuItem pizza = new MenuItem("Pepperoni Pizza", 10.00);
        MenuItem salad = new MenuItem("Harvest Salad", 8.00);
        Menu altMenu = new Menu();
        altMenu.addMenuItem(pizza);
        altMenu.addMenuItem(salad);
        altMenu.toPrint();
        pizza.setPrice(11.00);
        altMenu.toPrint();

    }
}
