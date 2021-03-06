
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class MenuItem {
    private int menuItemId = 1;
    private String name;
    private Double price;
    private String description;
    private String category;
    private Boolean newStatus;
    private Date added;
    private Date newItemDuration;
    private Date lastUpdated;


    public MenuItem(String name, Double price, String description, String category){
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.added = new Date();
        this.lastUpdated = new Date();
        this.menuItemId++;

        Calendar c= new GregorianCalendar();
        c.add(Calendar.DATE, -30);
        newItemDuration=c.getTime();

        if (added.getTime() > newItemDuration.getTime()){
            this.newStatus = false;
        } else {
            this.newStatus = true;
        }
    }

    public MenuItem(String name, Double price){
        this(name, price, null, null);
    }
    public MenuItem(String name, Double price, String category){
        this(name, price, category, null);
    }


    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
        this.lastUpdated = new Date();
    }

    public Double getPrice(){
        return price;
    }
    public void setPrice(Double price){
        this.price = price;
        this.lastUpdated = new Date();
    }

    public String getDescription(){
        return description;
    }
    public void setDescription(String description){
        this.description = description;
        this.lastUpdated = new Date();
    }

    public String getCategory(){
        return category;
    }
    public void setCategory(String category){
        this.category = category;
        this.lastUpdated = new Date();
    }
    public boolean getNewStatus(){
        return newStatus;
    }

    public Date getAdded(){
        return added;
    }

    public Date getNewItemDuration(){
        return newItemDuration;
    }

    public Date getLastUpdated(){
        return lastUpdated;
    }

    public void setAdded(Date dateAdded){
        this.added = dateAdded;
    }

    public int getMenuItemId(){ return menuItemId; }

}
