import java.util.Scanner;
public class circumference2 {
    private float radius;
    circumference2() {
        radius=1.0f;
    }
    circumference2(float inputRadius) {
        radius=inputRadius;
    }
    public float findCircumference() {
        return (3.14f*2.0f*radius);
    }
    public void display () {
        System.out.printf("\nThe radius is: %.2f\n", radius);
        System.out.printf("\nThe circumference is: %.2f\n", findCircumference());
    }
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        //default constructor
        circumference2 defaultCircle= new circumference2();
        System.out.printf("The default radius circle is:");
        defaultCircle.display();
        //parameterized constrcutor:
        System.out.printf("Enter the radius of the circle:");
        float radius2=input.nextFloat();
        circumference2 userRadius=new circumference2(radius2);
        userRadius.display();

        input.close();
    }
}
