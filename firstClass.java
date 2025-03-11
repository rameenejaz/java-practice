class student {
    String name;
    int age;
}
public class firstClass {
    public static void main(String[] args) {
        student s1= new student(); //creating an object
        s1.name="rameen";
        s1.age=18;
        System.out.println("Hi my name is " + s1.name + " and i am " + s1.age + " years old");
    }
}

