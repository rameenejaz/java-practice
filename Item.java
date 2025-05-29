//files used are Date2, Customer, Item, Order, Category, and Main4
public class Item {
    private int ID;
    private String name;
    private int QtyOrdered;
    private int QtyInStock;
    private double unitPrice;
    private Category category;
    public Item() {
        ID=0;
        name="";
        QtyInStock=0;
        QtyOrdered=0;
        unitPrice=0.0;
    }
    public Item(int ID, String name, int QtyInStock, int QtyOrdered, double unitPrice, Category category) {
        this.ID=ID;
        this.name=name;
        this.QtyInStock=QtyInStock;
        this.QtyOrdered=QtyOrdered;
        this.unitPrice=unitPrice;
        this.category=category;
    }
    public Item(int ID,String name, int qty, double price, Category category) {
        this.ID=ID;
        this.name=name;
        this.QtyInStock=qty;
        this.unitPrice=price;
        this.category=category;
    }
    public int getID() {
        return ID;
    }
    public void setID(int ID) {
        this.ID=ID;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name=name;
    }
    public int getQtyInStock() {
        return QtyInStock;
    }
    public void setQtyInStock(int QtyInStock) {
        this.QtyInStock=QtyInStock;
    }
    public int getQtyOrdered() {
        return QtyOrdered;
    }
    public void setQtyOrdered(int QtyOrdered) {
        this.QtyOrdered=QtyOrdered;
    }
    public double getUnitPrice() {
        return unitPrice;
    }
    public void setUnitPrice(double unitPrice) {
        this.unitPrice=unitPrice;
    }
    public void reduceQuantity(int quantity) {
        QtyInStock-=quantity;
    }
    public void setCategory(Category category) {
        this.category=category;
    } 
    public Category getCategory() {
        return category;
    }
    @Override
    public String toString() {
        return "Item Name: " + name + ", ID: " + ID + ", Unit Price: $" + unitPrice + ", Quantity in Stock: " + QtyInStock +", Category: " + category.getName();
    }
}
