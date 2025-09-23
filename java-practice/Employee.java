public class Employee {
    private String office;
    private int salary;
    Date dateHired;
    public Employee () {
        office="";
        salary=0;
        // dateHired=0;
    }
    public Employee (String office, int salary, Date dateHired) {
        this.office=office;
        this.salary=salary;
        this.dateHired=dateHired;
    }
    public void display () {
        System.out.println("Office: " + office + " Salary: " + salary);
        dateHired.display();
    }
}
