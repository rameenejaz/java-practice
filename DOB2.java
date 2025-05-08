import java.util.Scanner;
class DOB2 {
    public int day;
    public String month;
    public int year;

    public DOB2() {
        day = 0;
        month = "";
        year = 0;
    }

    public DOB2(int d, String m, int y) {
        day = d;
        month = m;
        year = y;
    }
    public int getYear() {
        return year;
    }
    public String getMonth() {
        return month;
    }
    public int getDay () {
        return day;
    }
    public void setYear(int year) {
        this.year=year;
    }
    public void setMonth(String month) {
        this.month=month;
    }
    public void setDay(int day) {
        this.day=day;
    }
    public void displayDOB() {
        System.out.println(day+"/"+month+"/"+year);
    }
    public void setDOB(int day, String month, int year) {
        this.day=day;
        this.month=month;
        this.year=year;
    }
    public DOB2 getDOB() {
        return this.dob;
    }
}