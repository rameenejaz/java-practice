import java.util.Scanner;
public class User {
    private int userID;
    private String name;
    public User() {
        ID=0;
        Name="";
    }
    public User(int ID, String Name) {
        userID=ID;
        name=Name;

    }
    public void display() {
        System.out.println("User ID:"+ ID +" Name:"+ Name);
    }
}
public class Student extends User {
    String studentID;
    public Student (String Name, int ID, String studID) {
        super(Name, ID);
        studentID=studID;
    }
    public void display() {
        System.out.println("Student Name:" + Name + "Student ID: " + studentID );
    }
}
public class Teacher extends User {
    
}

public class libraryMS {
    
    public static void main(String[] args) {
        
    }
}
