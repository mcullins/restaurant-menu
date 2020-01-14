
import java.util.ArrayList;
import java.util.Date;


public class Menu {
    public ArrayList<MenuItem> name;
    private Date lastUpdated;
    private static int menuId = 1;

    public Menu (){
        this.name = new ArrayList<MenuItem>();
        this.lastUpdated = new Date();
        this.menuId = menuId;
        menuId++;
    }

    public ArrayList<MenuItem> getName(){
        return name;
    }
    public void setName(ArrayList<MenuItem> name){
        this.name = name;
        this.lastUpdated = new Date();
    }
    public Date getLastUpdated(){
        return lastUpdated;
    }
    public int getMenuId(){
        return menuId;
    }

    public void addMenuItem(ArrayList<MenuItem> menu, MenuItem menuItem){
        menu.add(menuItem);
    }
    public void deleteMenuItem(ArrayList<MenuItem> menu, MenuItem menuItem){
        menu.remove(menuItem);
    }
}
