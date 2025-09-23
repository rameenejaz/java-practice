class student {
    String name;
    int age;

    student (String n, int a) { //constructor
        name=n;
        age=a;
    }
}
public class firstClass {
    public static void main(String[] args) {
        student s1= new student("rameen", 17); //creating an object
        System.out.println("Hi my name is " + s1.name + " and i am " + s1.age + " years old");
    }
}

