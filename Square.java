//files used are shape, circle, triangle, and sqaure and main6
public class Square extends Shape{
    public Square(int numberOfLines,String penColor, String fillColor) {
        super(numberOfLines, penColor, fillColor );
    }
    @Override
    public void draw () {
        System.out.println("Drawing a square");
        System.out.print("Lines: " +numberOfLines);
        System.out.println("Pen Color: " + penColor);
        System.out.println("Fill Color: " + fillColor);
        System.out.println("[]");
    }
}
