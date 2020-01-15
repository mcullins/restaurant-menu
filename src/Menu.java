
import javax.sound.midi.MidiUnavailableException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;


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
    public void toPrint(){
        for(MenuItem itemName : item) {
           System.out.println(itemName.getName() + " $" + itemName.getPrice() +
                   "(Last Updated: " + itemName.getLastUpdated() + ").");
        }
    }
}
