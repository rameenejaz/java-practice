//files used are shape, circle, triangle, and sqaure
public abstract class Shape {
    protected int numberOfLines;
    protected String penColor;
    protected String fillColor;
    public Shape() {
        numberOfLines=0;
        penColor="";
        fillColor="";
    }
    public Shape(int numberOfLines, String penColor, String fillColor) {
        this.numberOfLines=numberOfLines;
        this.penColor=penColor;
        this.fillColor=fillColor;
    }
    public abstract void draw();

}
