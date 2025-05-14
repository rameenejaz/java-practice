//files used are shape, circle, triangle, and sqaure
public class Circle extends Shape {
    public Circle(String penColor, String fillColor) {
        // since a circle has zero sides
        super(0, penColor, fillColor );
    }
    @Override
    public void draw () {
        System.out.println("Drawing a circle");
        System.out.print("Lines: " +numberOfLines);
        System.out.println("Pen Color: " + penColor);
        System.out.println("Fill Color: " + fillColor);
        System.out.println("O");
    }

}
