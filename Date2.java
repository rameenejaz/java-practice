//files used are Category, Date2, Customer, Supplier, Item, Order, Report2, GroceryStoreSystem
public class Date2 {
    private int day;
    private String month;
    private int year;
    public Date2() {
        day=0;
        month="";
        year=0;
    }
    public Date2(int day, String month, int year) { //parameterized constructor
        this.day=day;
        this.month=month;
        this.year=year;
    }
    private boolean isValidMonth(String month) {
        String [] months={"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        for (int i=0; i<months.length; i++) {
            if (months[i].equalsIgnoreCase(month)) {
                return true;
            }
        }
        return false;
    }
    public int getDay() {
        return day;
    }
    public void setDay(int day) {
        this.day=day;
    }
    public String getMonth() {
        return month;
    }
    public void setMonth(String month) {
        this.month=month;
    }
    public void setYear(int year) {
        this.year=year;
    }
    public int getYear() {
        return year;
    }
    public String toString() {
        return day +"/" + month + "/" + year;
    }
 }
