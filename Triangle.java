//files used are shape, circle, triangle, and sqaure and main6
public class Triangle extends Shape {
    public Triangle(int numberOfLines,String penColor, String fillColor) {
        super(numberOfLines, penColor, fillColor );
    }
    @Override
    public void draw () {
        System.out.println("Drawing a triangle");
        System.out.println("Lines: " +numberOfLines);
        System.out.println("Pen Color: " + penColor);
        System.out.println("Fill Color: " + fillColor);
        System.out.println("/\\");
    }
}
