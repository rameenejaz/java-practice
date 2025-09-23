//files used are shape, circle, triangle, and sqaure and main6
public class Main6 {
    public static void main(String[] args) {
        Shape newCircle=new Circle("blue", "yellow");
        newCircle.draw();
        System.out.println();
        Shape newSquare=new Square(4,"green", "red");
        newSquare.draw();
        System.out.println();
        Shape newTriangle=new Triangle(3, "black", "violet");
        newTriangle.draw();
    }
    
}
