
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Menu {
    public ArrayList<MenuItem> item;
    private Date lastUpdated;
    private static int menuId = 1;

    public Menu (){
        this.item = new ArrayList<MenuItem>();
        this.lastUpdated = new Date();
        this.menuId = menuId;
        menuId++;
    }

    public ArrayList<MenuItem> getName(){
        return item;
    }
    public void setName(ArrayList<MenuItem> name){
        this.item = item;
        this.lastUpdated = new Date();
    }
    public Date getLastUpdated(){
        return lastUpdated;
    }
    public int getMenuId(){
        return menuId;
    }

    public void addMenuItem(MenuItem menuItem){
        item.add(menuItem);
    }
    public void deleteMenuItem(MenuItem menuItem){
        item.remove(menuItem);
    }
    public void printEntireMenu(){
        for(MenuItem itemName : item) {
           System.out.println(itemName.getMenuItemId() + " " + itemName.getName() + " $" + itemName.getPrice() +
                   itemName.getCategory() + ".");
        }

    }
    public void printSingleItem(MenuItem name){
        System.out.println((name.getName() + "- Price $" + name.getPrice()));
    }

    public ArrayList<MenuItem> getMenu() {
        return item;
    }
//@Override
//    public String toString(){
    //    return item.getName();
  //  }

}


