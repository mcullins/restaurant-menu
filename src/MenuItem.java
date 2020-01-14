import java.util.Date;

public class MenuItem {
    private String name;
    private Double price;
    private String description;
    private String category;
    private Boolean newStatus;
    private Date added;
    private int newItemDuration = 30;
    private Date lastUpdated;

    public MenuItem(String name, Double price, String description, String category){
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.added = new Date();
        this.lastUpdated = new Date();
    }
    /*
    public MenuItem(String name, Double price){
        this(name, price);
    }
    public MenuItem(String name, Double price, String category){
        this(name, price, category);
    }

    getter =
    price
    des
    category
    added
    new item dur
    last updated
    name

    setter =
    price
    des
    category
    name
     */

}
