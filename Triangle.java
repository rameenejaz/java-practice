public class Triangle extends Shape {
    public Triangle(int numberOfLines,String penColor, String fillColor) {
        super(numberOfLines, penColor, fillColor );
    }
    @Override
    public void draw () {
        System.out.println("Drawing a circle");
        System.out.print("Lines: " +numberOfLines);
        System.out.println("Pen Color: " + penColor);
        System.out.println("Fill Color: " + fillColor);
        System.out.println("/\\");
    }
}
