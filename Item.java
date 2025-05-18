//files used are Date2, Customer, Item, Order, Category, and Main4
public class Item {
    private int ID;
    private String name;
    private int QtyOrdered;
    private int QtyInStock;
    private double unitPrice;
    public Item() {
        ID=0;
        name="";
        QtyInStock=0;
        QtyOrdered=0;
        unitPrice=0.0;
    }
    public Item(int ID, String name, int QtyInStock, int QtyOrdered, double unitPrice) {
        this.ID=ID;
        this.name=name;
        this.QtyInStock=QtyInStock;
        this.QtyOrdered=QtyOrdered;
        this.unitPrice=unitPrice;
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
        this.QtyInStock=QtyInStock;
    }
    public double getUnitPrice() {
        return unitPrice;
    }
    public void setUnitPrice(double unitPrice) {
        this.unitPrice=unitPrice;
    }
    public void reduceQuantity(int quantity) {
        quantityOrdered-=quantity;
    }
}
