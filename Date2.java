//files used are Date2, Customer, Item, Order, Category, and Main4
public class Date2 {
    private int day;
    private String month;
    public Date2() {
        day=0;
        month="";
    }
    public Date2(int day, String month) {
        this.day=day;
        this.month=month;
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

 }
