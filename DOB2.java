import java.util.Scanner;
class DOB2 {
    public int day;
    public int month;
    public int year;

    public DOB2() {
        day = 0;
        month = 0;
        year = 0;
    }

    public DOB2(int d, int m, int y) {
        day = d;
        month = m;
        year = y;
    }
    public int getMonth() {
        return month;
    }
    public void setMonth(int month) {
        this.month=month;
    }
    public void displayDOB() {
        System.out.println(day+"/"+month+"/"+year);
    }
}