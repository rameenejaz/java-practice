public class Main1 {
    public static void main(String[] args) {
        Student_1 student=new Student_1("rameen", "road", 499, "rameenejaz4@gmail.com", "Absent");
        // Person1 student=new Student_1("rameen", "road", 499, "rameenejaz4@gmail.com", "Absent");
        student.display();
        Date date=new Date(17, 03, 2007);
        date.display();
        Employee employee=new Employee("adnoc",100, date);
        employee.display();
    }
}
