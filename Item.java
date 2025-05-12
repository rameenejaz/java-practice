public class Item {
    private int ID;
    private String name;
    private int QtyInStock;
    private int QtyOrdered;
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
    private int getQtyInStock() {
        return QtyInStock;
    }
    private void setQtyInStock(int QtyInStock) {
        this.QtyInStock=QtyInStock;
    }
    private int getQtyOrdered() {
        return QtyOrdered;
    }
    private void setQtyOrdered(int QtyOrdered) {
        this.QtyInStock=QtyInStock;
    }
    private double getUnitPrice() {
        return unitPrice;
    }
    private void setUnitPrice(double unitPrice) {
        this.unitPrice=unitPrice;
    }

}
