public class Employee {
    private String office;
    private int salary;
    Date dateHired;
    public Employee {
        office="";
        salary=0;
        dateHired=0;
    }
    public Employee (String office, int salary) {
        this.office=office;
        this.salary=salary;
    }
    public void display () {
        System.out.println("Office: " + office + "Salary: " + salary);
    }
}
