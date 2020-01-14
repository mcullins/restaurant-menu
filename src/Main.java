public class Main {

    public static void main(String[] args) {
        MenuItem pizza = new MenuItem("Pizza", 10.00);
        Menu altMenu = new Menu();
        altMenu.addMenuItem(altMenu, pizza);
    }
}
